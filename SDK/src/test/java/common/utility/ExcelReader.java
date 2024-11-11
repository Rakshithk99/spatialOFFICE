package common.utility;

import common.BaseTest;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReader extends BaseTest {


    public ExcelReader() throws Exception {
        super();
    }

    public static void main(String args[]) throws Exception {

        int a = 2;
        ExcelReader eat = new ExcelReader();
//        String CellData = eat.getCellData("Booking", "Booking", a);
//        System.out.println("data for one cell  " + CellData);
//        String CellData1 = eat.getCellData("Booking", "Bookinga", a);
//        System.out.println("data for two cell  " + CellData1);
        ArrayList<String> ExcelData = eat.getExcelData("src\\global\\data\\Booking.xlsx", "Booking");
        System.out.println("data val  " + ExcelData);
    }

    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;


    /*Method to get the data of each cell individually*/
    public String getCellData(String xlFilePath, String sheetName, String colName, int rowNum) {
        try {
            fis = new FileInputStream(xlFilePath);
            workbook = new XSSFWorkbook(fis);
            fis.close();

            int col_Num = -1;
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    col_Num = i;
            }
            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(col_Num);
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colName + " does not exist  in Excel";
        }
        return String.valueOf(cell);
    }

    /*Method to get the Complete Excel data with both Column and row*/
//    public ArrayList<String> getExcelData(String sheetName) {
//        ArrayList<String> CellList = new ArrayList<>();
//        try {
//
//            sheet = workbook.getSheet(sheetName);
//            Iterator rowIterator = sheet.iterator();
//            while (rowIterator.hasNext()) {
//                XSSFRow row = (XSSFRow) rowIterator.next();
//                Iterator cellIterator = row.cellIterator();
//                while (cellIterator.hasNext()) {
//                    cell = (XSSFCell) cellIterator.next();
//                    CellList.add(String.valueOf(cell));
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return CellList;
//    }

    public ArrayList<String> getExcelData(String xlFilePath, String sheetName) {
        ArrayList<String> CellList = new ArrayList<>();
        try {
            fis = new FileInputStream(xlFilePath);
            workbook = new XSSFWorkbook(fis);
            fis.close();

            sheet = workbook.getSheet(sheetName);
            Iterator rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                XSSFRow row = (XSSFRow) rowIterator.next();
                Iterator cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    cell = (XSSFCell) cellIterator.next();
                    CellList.add(String.valueOf(cell));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return CellList;
    }
}
