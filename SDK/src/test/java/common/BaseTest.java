package common;

import common.utility.ScreenRecorderUtil;
import common.utility.ExcelReader;
import net.thucydides.core.annotations.Managed;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    @Managed
    public static WebDriver driver;
    public static Properties properties;
    private static String url;
    private final String propertyFilePath = "src\\global\\properties\\Config.properties";
    static ExcelReader excelReader;

    @FindBy(xpath = "//*[@id=\"#header\"]//span[1]")
    private static WebElement SYNC_LOGO;

    @FindBy(xpath = "//*[@id=\"#header\"]//span[2]")
    private static WebElement SDK_LOGIN_LOGO;

    @FindBy(xpath = "//*[@id=\"login-form\"]//sncr-form-notification//span[2]")
    private static WebElement ERROR_INVALID_CREDENTIALS;


    static {
        try {
            excelReader = new ExcelReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public BaseTest() throws Exception {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    /*Setup method selecting the Browser and launching application uRL */
    public static void setUp(String DB) throws Exception {
        String BrowserName = properties.getProperty("Browser");
        if (BrowserName.equals("Chrome")) {
           // System.setProperty("webdriver.chrome.driver", "src\\global\\driver\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "src\\global\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-features=VizDisplayCompositor");
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        } else if (BrowserName.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "src\\test\\driver\\IEDriverServer.exe");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        if (DB != null) {
            driver.get(DB);
        } else {
            throw new RuntimeException("url not specified in the config properties file.");
        }
        //  login();

    }

    public static void login() throws InterruptedException {
        WebElement UserName = driver.findElement(By.id("login.form-input-username"));
        WebElement Password = driver.findElement(By.id("login.form-input-password"));
        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]//sncr-form-button//button"));


        Thread.sleep(10000);
        if (driver.findElement(By.xpath("//*[@id=\"#header\"]//span[1]")).isDisplayed() && driver.findElement(By.xpath("//*[@id=\"#header\"]//span[2]")).isDisplayed()) {
          //  UserName.sendKeys("admin");
            //Password.sendKeys("SpatialStorm01");
			UserName.sendKeys("pkde0001@spatialnetworx.ai");
            Password.sendKeys("AvaniAkshayGudi123*");
            Submit.click();
            Thread.sleep(10000);
        }
        Thread.sleep(10000);
       if (driver.findElement(By.xpath("//*[starts-with(@id,\"map\")]")).isDisplayed()) {
            System.out.println("SDK Application logged in Successfully!");
        }


    }


    public static void quitDriver() {
        driver.close();
    }
}
