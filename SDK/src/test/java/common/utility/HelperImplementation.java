package common.utility;

import common.BaseTest;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HelperImplementation extends BaseTest {

    DbConn dbConn = new DbConn();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    ArrayList<String> DbResult = new ArrayList<>();

    public HelperImplementation() throws Exception {
        super();
        PageFactory.initElements(driver, this);
    }


    /*Capturing screenshot of Map with the respect to the System Timings*/
    public void takeMapScreenshot() throws IOException {
        WebElement logo = driver.findElement(By.xpath("//*[starts-with(@id,\"map\")]"));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullScreen = ImageIO.read(screenshot);
        Point location = logo.getLocation();
        int width = logo.getSize().getWidth();
        int height = logo.getSize().getHeight();
        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
                width, height);
        try {
            ImageIO.write(logoImage, "png", screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileUtils.copyFile(screenshot, new File("src\\global\\screenshots\\" + timestamp() + ".png"));
    }

    /*Capturing screenshot with the respect to the System Timings*/
    public void takeScreenshot() {
        TakesScreenshot scShot = (TakesScreenshot) driver;
        File sourceFile = scShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src\\global\\screenshots\\" + timestamp() + ".png");
        try {
            FileUtils.copyFile(sourceFile, DestFile);

        } catch (Exception e) {

        }
    }

    public void windowHandling() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    /*Wait time for Page to load*/
    public void waitForPageLoad() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    /*highlightElement method will highlight the element on the UI*/
    public void highLightElement(WebDriver driver, WebElement element) {
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
    }

    /*Scroll method for horizontal and vertical*/
    public void scrollByElement(WebElement Element) {
        // js.executeScript("arguments[0].scrollIntoView();", Element);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(Element, 1000, 2000);
    }

    /*Fluent wait function to wait until element is displayed*/
    public void fluentWait() {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(5000, TimeUnit.MILLISECONDS);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    /*Method connecting to DbConn class and fetching Db data*/
    private void getResult(String sql, String[] entity_data) {
        dbConn.fetchingData(sql, entity_data);
        DbResult = dbConn.resultSetVal;
        System.out.println("resultSet values for address" + DbResult);
    }

}
