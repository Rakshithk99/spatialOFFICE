package common.utility;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import common.BaseTest;

public class DbConn extends BaseTest {
    private Statement stmt;
    private String dbname;
    private String username;
    private String password;
    ResultSet resultSet;
    private Object Date;


    public DbConn() throws Exception {
        super();
        PageFactory.initElements(driver, this);
    }

    private static SimpleDateFormat inSDF = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private static SimpleDateFormat outSDF = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

    public static String formatDate(String inDate) {
        String outDate = "";
        if (inDate != null) {
            try {
                Date date = inSDF.parse(inDate);
                outDate = outSDF.format(date);
            } catch (ParseException ex) {
            }
        }
        return outDate;
    }


    private static SimpleDateFormat inSDF1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private static SimpleDateFormat outSDF1 = new SimpleDateFormat("MM/dd/yyyy h:mm:ss");

    public static String formatDate1(String inDate) {
        String outDate = "";
        if (inDate != null) {
            try {
                Date date = inSDF1.parse(inDate);
                outDate = outSDF1.format(date);
            } catch (ParseException ex) {
            }
        }
        return outDate;
    }

    private void xmlDbData() {
        try {
            File fXmlFile = new File("src\\global\\data\\dbConfig.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            Element element = doc.getDocumentElement();
            NodeList nList = doc.getElementsByTagName("DB");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String DB_Name = eElement.getAttribute("id");
                    System.out.println("DB_Name" + DB_Name);
                    dbname = eElement.getElementsByTagName("hostname").item(0).getTextContent();
                    username = eElement.getElementsByTagName("username").item(0).getTextContent();
                    password = eElement.getElementsByTagName("password").item(0).getTextContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Statement mainDB() {
        try {
            xmlDbData();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver loaded");
            Connection con = DriverManager.
                    getConnection(dbname
                            , username, password);
            stmt = con.createStatement();
            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }


    public ArrayList<String> resultSetVal = new ArrayList<String>();

    public List<String> fetchingData(String sql, String[] entity) {
        try {
            mainDB();
            resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                for (String results : entity) {

                    String entityVal = resultSet.getString(results);
                    if (results.equals("POWER") || results.equals("POWER_RATING")) {
                        if (entityVal == null) {
                            entityVal = ",0";
                        } else if (entityVal.equals("0")) {
                            entityVal = "0,0";
                        }
                    }
                    if (entityVal == null) {
                        entityVal = "";
                    }
                    if (results.equals("UPD_DATE")) {
                        String entityVal1 = formatDate(entityVal);
                        entityVal = entityVal1.substring(1) + " PM";
                    }
                    if (results.equals("DATE_PUBLISHED") || results.equals("CREATE_DATE")) {
                        String entityVal1 = formatDate1(entityVal);
                        entityVal = entityVal1 + " PM";
                    }
                    if (results.equals("STREET_NAME")) {
                        entityVal = entityVal.replace("\\s", "");
                    }
                    if (results.equals("JTRENCH")) {
                        entityVal = "";
                    }
                    if (results.equals("TRENCH_SIZE") || results.equals("START_DEPTH") || results.equals("END_DEPTH")) {
                        entityVal = "-";
                    } else if (results.equals("LH_LENGTH")) {
                        entityVal = entityVal + "0";
                    }

                    resultSetVal.add(entityVal);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSetVal;
    }

//    private ArrayList<String> resultSetVal = new ArrayList<String>();
//    String[] address = {"ZIP", "ID"};
//    @When("I fetch results (.*)")
//    public List<String> getResult(String sql) {
//        try {
//            resultSet = stmt.executeQuery(sql);
//            while (resultSet.next()) {
//                for (String result : address) {
//                    System.out.println("array length" + address.length);
//                    String rsetval = resultSet.getString(result);
//                    resultSetVal.add(rsetval);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("resultSet" + resultSetVal);
//        return resultSetVal;
//    }

}

