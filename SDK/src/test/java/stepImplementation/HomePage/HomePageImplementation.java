package stepImplementation.HomePage;

import common.BaseTest;
import common.utility.Constants;
import common.utility.HelperImplementation;
import common.utility.ScreenRecorderUtil;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import stepPage.HomePage.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

public class HomePageImplementation extends BaseTest {
    private HomePage homePage = new HomePage();
    private HelperImplementation helperImplementation = new HelperImplementation();
    private Constants constants = new Constants();

    Actions actions = new Actions(driver);


    public HomePageImplementation() throws Exception {
        PageFactory.initElements(driver, this);
    }

    public void validateCSHIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CSH);
        helperImplementation.highLightElement(driver, homePage.CSH);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        for (String child_window : s) {
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
            driver.switchTo().window(parent);
        }
    }

    @Step
    public void mapSectionValidation() throws InterruptedException {
        Thread.sleep(4000);
        if (homePage.isPresentElement(homePage.MAP)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.MAP);
            helperImplementation.highLightElement(driver, homePage.MAP);
            Thread.sleep(5500);
        } else {
            Assert.fail("Map is not Present");
        }
    }

    @Step
    public void drawingSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.DRAWING)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DRAWING);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DRAWINGS_ERROR_TAB);
        } else {
            Assert.fail("Drawing is not Present");
        }
    }

    @Step
    public void traceSectionValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.TRACE_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.TRACE_DASHBOARD_TEXT.getText(), "Trace\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.TRACE_DASHBOARD_LIST_PANEL.isDisplayed());
            validateCSHIcon();
        } else {
            Assert.fail("Trace is not Present");
        }
    }

    @Step
    public void rfPowerSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        if (homePage.isPresentElement(homePage.RF_POWER)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.RF_POWER);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.TRACE_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.TRACE_DASHBOARD_TEXT.getText(), "spatialOFFICE\n" +
                    "A spatialSDK Application");
            validateCSHIcon();
        } else {
            Assert.fail("Rf Power is not Present");
        }
    }

    @Step
    public void rfLevelsSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        if (homePage.isPresentElement(homePage.RF_LEVELS)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.RF_LEVELS);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.TRACE_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.TRACE_DASHBOARD_TEXT.getText(), "spatialOFFICE\n" +
                    "A spatialSDK Application");
            validateCSHIcon();
        } else {
            Assert.fail("Rf Levels is not Present");
        }
    }

    @Step
    public void splicingSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.SPLICING)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICING);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SPLICING_DASHBOARD_TEXT);
            // Assert.assertEquals(homePage.SPLICING_DASHBOARD_TEXT.getText(), "Splicing");
            validateCSHIcon();
        } else {
            Assert.fail("Splicing is not Present");
        }

    }

    @Step
    public void reportsSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        if (homePage.isPresentElement(homePage.REPORTS)) {
            homePage.clickToolElement(homePage.REPORTS_DROPDOWN);
            Thread.sleep(3000);
            actions.dragAndDrop(homePage.VERTICAL_SCROLL, homePage.SEARCH).build().perform();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_REPORT);
            validateCSHIcon();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_REPORT);
            validateCSHIcon();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.EQUIPMENT_REPORT);
            validateCSHIcon();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ADDRESS_LIST_REPORT);
            validateCSHIcon();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.HOME_PASSED_REPORT);
            validateCSHIcon();
            Thread.sleep(5500);
        } else {
            Assert.fail("Reports is not Present");
        }
    }

    @Step
    public void reportManagerSectionValidation() throws InterruptedException {
        homePage.clickToolElement(homePage.HEADER_CLICK);
        if (homePage.isPresentElement(homePage.REPORT_MANAGER_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REPORT_MANAGER_DASHBOARD);
            helperImplementation.highLightElement(driver, homePage.REPORT_MANAGER_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.REPORT_MANAGER_DASHBOARD_TEXT.getText(), "Report Manager");
            validateCSHIcon();
        } else {
            Assert.fail("Report Manager is not Present");
        }
    }

    @Step
    public void zoomToolValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.ZOOM_TOOL)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_TOOL);
            //  helperImplementation.takeScreenshot();
        } else {
            Assert.fail("ZOOM_TOOL Tool is not Present");
        }
    }

    @Step
    public void bellToolValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.BELL_ICON)) {
            Thread.sleep(500);
            homePage.clickToolElement(homePage.BELL_ICON);
        } else {
            Assert.fail("Bell Tool is not Present");
        }
    }

    @Step
    public void settingsToolValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.SETTINGS_ICON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SETTINGS_ICON);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DARK_BACKGROUND_SETTINGS);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SETTINGS_SAVE_ICON);
        } else {
            Assert.fail("Settings Tool is not Present");
        }
    }

    @Step
    public void helpToolValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.HELP_ICON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.HELP_ICON);
            //helperImplementation.highLightElement(driver, homePage.HELP_TOPIC);
            // homePage.isPresentElement(homePage.HELP_TOPIC);
            Thread.sleep(4000);
            homePage.clickToolElement(homePage.MAP);
        } else {
            Assert.fail("Help Tool is not Present");
        }
    }

    @Step
    public void layersTabValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.LAYERS_TAB)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.LAYERS_TAB);
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.BASE_LAYERS_DROPDOWN);
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.BASE_LAYERS_DROPDOWN);
        } else {
            Assert.fail("Layers Tool is not Present");
        }
    }


    ArrayList<String> MAP_Actual = new ArrayList<>();
    ArrayList<String> MAP_Expected = new ArrayList<>(Arrays.asList(constants.MAPS_LAYERS_DASHBOARD));

    @Step
    public void baseLayersValidation() throws InterruptedException, IOException {
        List<WebElement> elements = driver.findElements(By.xpath("//*[starts-with(@id,\"mat-radio\")]//label"));
        for (int i = 1; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//*[starts-with(@id,\"mat-radio\")][" + i + "]"));
            Thread.sleep(5500);
            element.click();
            Thread.sleep(5500);
            helperImplementation.takeMapScreenshot();
            String Map_Text = element.getText();
            System.out.print("Map text" + Map_Text);
            MAP_Actual.add(Map_Text);
        }
        System.out.print("Map actual****" + MAP_Actual);
        Assert.assertEquals("Map list are not matching please check..", MAP_Actual, MAP_Expected);


    }


    ArrayList<String> SpatialStorm_Actual = new ArrayList<>();
    ArrayList<String> SpatialStorm_Expected = new ArrayList<>(Arrays.asList(constants.SPATIALSTORM_LAYERS_DASHBOARD));

    @Step
    public void spatialStormLayersValidation() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elements = driver.findElements(By.xpath("//mat-expansion-panel[1]//mat-list-item"));
        for (int i = 1; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//mat-expansion-panel[1]//mat-list-item[" + i + "]//label"));
            WebElement element1 = driver.findElement(By.xpath("//mat-expansion-panel[1]//mat-list-item[" + i + "]"));
            Thread.sleep(3000);
            element.click();
            Thread.sleep(3000);
            String SpatialStorm_Text = element1.getText();
            System.out.print("SpatialStorm text" + SpatialStorm_Text);
            SpatialStorm_Actual.add(SpatialStorm_Text);
        }
        System.out.print("SpatialStorm actual****" + SpatialStorm_Actual);
        Assert.assertEquals("SpatialStorm list are not matching please check..", SpatialStorm_Actual, SpatialStorm_Expected);
    }

    @Step
    public void jobsLayerValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.JOBS_TAB)) {
            homePage.clickToolElement(homePage.JOBS_TAB);
            Thread.sleep(5500);

        } else {
            Assert.fail("Jobs tab is not present to click");
        }

    }

    @Step
    public void createJob() throws InterruptedException {
        jobsLayerValidation();
        if (homePage.isPresentElement(homePage.JOBS_CREATION_PLUS_ICON)) {
            homePage.clickToolElement(homePage.JOBS_CREATION_PLUS_ICON);
            Thread.sleep(5500);
            //validateCSHIcon();
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.JOB_TYPE_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.JOB_TYPE_FIBER_INFRASTRUCTURE);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.JOB_TYPE_SAVE);
        } else {
            Assert.fail("JOb creation plus icon is not present to click...");
        }
        if (homePage.isPresentElement(homePage.CREATE_JOB_DIALOG)) {
            Thread.sleep(5500);
            homePage.CREATE_JOB_NAME.sendKeys("TEST");
            Thread.sleep(5500);
            // homePage.CREATE_JOB_DESCRIPTION.sendKeys("TESTING JOB");
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CREATE_JOB_SAVE);
        } else {
            Assert.fail("JOb Creation Panel is not present");
        }
    }

    @Step
    public void verifyJobCreated() throws InterruptedException {
        Thread.sleep(5500);
        homePage.clickToolElement(homePage.JOBS_BACK_BUTTON);
//        Thread.sleep(500);
//        homePage.clickToolElement(homePage.JOB_FIRST_ITEM);
//        if (homePage.JOB_TEXT_TOOLBAR.getText().equalsIgnoreCase(homePage.JOB_TEXT_CHIP.getText())) {
//            Assert.assertTrue(true);
//        } else {
//            Assert.fail("ToolBar Text and Chip Text doesnt match..please verify" + "ToolBar Job Name: " + homePage.JOB_TEXT_TOOLBAR.getText() + "   Text below the Map:  " + homePage.JOB_TEXT_CHIP.getText());
//        }
    }

    @Step
    public void detailsLayerValidation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.DETAILS_TAB)) {
            homePage.clickToolElement(homePage.DETAILS_TAB);
            Thread.sleep(5500);
        } else {
            Assert.fail("Details Tab is not present to click");
        }
    }

    @Step
    public void searchLayerValidation() throws InterruptedException {
        Thread.sleep(10000);
        if (homePage.isPresentElement(homePage.SEARCH_TAB)) {
            homePage.clickToolElement(homePage.SEARCH_TAB);
            Thread.sleep(5500);
            homePage.SEARCH_BOX.clear();
            homePage.SEARCH_BOX.sendKeys("1");
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SEARCH_ICON);
            Thread.sleep(5500);
        } else {
            Assert.fail("Search Layer is not present to click");
        }
    }

    @Step
    public void logoutTabValidation() {
        if (homePage.isPresentElement(homePage.LOGOUT_ICON)) {
            homePage.clickToolElement(homePage.LOGOUT_ICON);
            helperImplementation.highLightElement(driver, homePage.SPATIAL_LOGO);
        } else {
            Assert.fail("Logout Tool is not present to click");
        }
        BaseTest.quitDriver();
    }

    public void sendIdFromSearch(String id) throws InterruptedException {
        // if (homePage.isPresentElement(homePage.SEARCH_TAB)) {
        //Thread.sleep(5500);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id, \"mat-tab-label\")][4]")));
        boolean status = element.isDisplayed();
        if (status) {
            System.out.println("SEARCH Tab is loaded...");

            homePage.clickToolElement(homePage.SEARCH_TAB);
            Thread.sleep(5500);
            homePage.SEARCH_BOX.clear();
            Thread.sleep(5500);
            homePage.SEARCH_BOX.sendKeys(id);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SEARCH_ICON);
            Thread.sleep(12000);
            // if(homePage.isPresentElement(homePage.OSM_SEARCH_TIME_OUT_OVERLAY)){
            // helperImplementation.highLightElement(driver,homePage.OSM_SEARCH_TIME_OUT_OVERLAY);
            //  homePage.clickToolElement(homePage.OSM_SEARCH_TIME_OUT_OVERLAY_CANCEL);
            // }
            //else {
            //   System.out.println("OSM Search Layover is not present");
            //}
        } else {
            Assert.fail("Search Layer is not present to click");
        }
    }

    public void validateTitleOfEntity() throws InterruptedException, IOException {
        Thread.sleep(4000);
        String selectedEntity = homePage.ENTITY_SELECTION.getText();
        System.out.println("Selected **" + selectedEntity);
        homePage.clickToolElement(homePage.ENTITY_SELECTION);
        Thread.sleep(4000);
        helperImplementation.takeMapScreenshot();
        String detail = homePage.ENTITY_TITLE_DETAILS_PANEL.getText();
        String detailVal = detail.replace("Details", "");
        String detailValReplaced = detailVal.substring(0, detailVal.length() - 1);
        System.out.println("Details value**" + detailValReplaced);
        Thread.sleep(5500);
        if (selectedEntity.equalsIgnoreCase(detailValReplaced)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Entity title from Search Selected to entity in details panel are not Matching please verify.." + homePage.ENTITY_SELECTION.getText().equalsIgnoreCase(detailValReplaced));
        }
    }


    public void navigateToTraceReport() throws InterruptedException {
        if (homePage.isPresentElement(homePage.REPORTS)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_REPORT);
        } else {
            Assert.fail("Reports Dropdown is not Present");
        }

    }

    ArrayList<String> Details_Actual = new ArrayList<>();
    ArrayList<String> Details_Expected = new ArrayList<>(Arrays.asList(constants.DETAILS_LISTED_DASHBOARD));

    public void validateDetailsPanel() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.DETAILS_TAB)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CORE_ATTRIBUTES_EXPANSION_BUTTON);
            Thread.sleep(5500);
            List<WebElement> elements = driver.findElements(By.xpath("//*[starts-with(@id,\"mat-tab-content\")]//sncr-details-category"));
            for (int i = 1; i <= elements.size(); i++) {
                WebElement element = driver.findElement(By.xpath("//*[starts-with(@id,\"mat-tab-content\")]//sncr-details-category[" + i + "]"));
                String detailsCategory = element.getText();
                System.out.print("details text" + detailsCategory);
                Details_Actual.add(detailsCategory);
            }
            System.out.print("details actual****" + Details_Actual);
            Assert.assertEquals("Details List list are not matching please check..", Details_Actual, Details_Expected);
        } else {
            Assert.fail("Details Tab is not present to click");
        }
    }

    public void navigateSpliceReport() throws InterruptedException {
        if (homePage.isPresentElement(homePage.SPLICE_REPORT)) {
            Thread.sleep(10000);
            homePage.clickToolElement(homePage.SPLICE_REPORT);
            Thread.sleep(10000);
        } else {
            Assert.fail("Splice Report is not  present to click.......please verify");
        }
    }


    public void navigateToTrace() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE)) {
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.TRACE);
            Thread.sleep(5500);
//            actions.keyDown(Keys.SHIFT).build().perform();
//            Thread.sleep(1000);
            homePage.clickToolElement(homePage.TRACE_SELECTION);

            // homePage.clickToolElement(homePage.TRACE_ITEM);
            Thread.sleep(5500);
            FibreUsageReport();
        } else {
            Assert.fail("Trace is not Present to click please verify........");
        }
    }

    public void FibreUsageReport() throws InterruptedException {
        if (homePage.isPresentElement(homePage.FIBRE_USAGE_REPORT)) {
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.FIBRE_USAGE_REPORT);
            Thread.sleep(5000);
        }
    }

    ArrayList<String> Trace_Tabs_Actual = new ArrayList<>();
    ArrayList<String> Trace_Tabs_Expected = new ArrayList<>(Arrays.asList(constants.Trace_Tabs_DASHBOARD));

    public void validateTraceTabs() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath("//sncr-trace//mat-tab-group//div//div//div//div//div"));
        for (int i = 1; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//sncr-trace//mat-tab-group//div//div//div//div[" + i + "]//div"));
            Thread.sleep(5500);
            element.click();
            Thread.sleep(5500);
            String detailsCategory = element.getText();
            System.out.print("trace tab text" + detailsCategory);
            Trace_Tabs_Actual.add(detailsCategory);
        }
        System.out.print("trace tab  actual****" + Trace_Tabs_Actual);
        Assert.assertEquals("Details List list are not matching please check..", Trace_Tabs_Actual, Trace_Tabs_Expected);
    }


    public void validateSummaryTab() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_SUMMARY_TAB)) {
            // homePage.clickToolElement(homePage.TRACE_SUMMARY_TAB);
            Thread.sleep(5500);
            driver.switchTo().frame(homePage.REPORT_IFRAME);
            Assert.assertTrue("Trace Summary Report table is not present please verify", homePage.isPresentElement(homePage.TRACE_SUMMARY_REPORT));
            helperImplementation.highLightElement(driver, homePage.TRACE_SUMMARY_REPORT);
            Thread.sleep(5500);
            driver.switchTo().defaultContent();
        } else {
            Assert.fail("Trace Summary Tab is not present to click");
        }
    }

    public void validateSchematicTab() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_SCHEMATIC_TAB)) {
            Thread.sleep(4000);
            homePage.clickToolElement(homePage.TRACE_SCHEMATIC_TAB);
            Thread.sleep(5500);
            Assert.assertTrue("Trace Schematic Report iframe is not shown up please verify", homePage.isPresentElement(homePage.REPORT_IFRAME));
            helperImplementation.highLightElement(driver, homePage.REPORT_IFRAME);
            Thread.sleep(3000);
        } else {
            Assert.fail("Trace Schematic Tab is not present to click");
        }
    }

    public void validateReportTab() throws InterruptedException, IOException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.TRACE_REPORT_TAB)) {
            Thread.sleep(4000);
            actions.click(homePage.TRACE_REPORT_TAB).build().perform();
            Thread.sleep(5500);
            Assert.assertTrue("Trace Report is not shown up please verify", homePage.isPresentElement(homePage.TRACE_REPORT_AREA));
            helperImplementation.highLightElement(driver, homePage.TRACE_REPORT_AREA);
            Thread.sleep(5500);
            // homePage.clickToolElement(homePage.DOWNLOAD_BUTTON);
        } else {
            Assert.fail("Trace Report Tab is not present to click");
        }
    }

    public void validateMapTab() throws InterruptedException, IOException {
        if (homePage.isPresentElement(homePage.TRACE_MAP_TAB)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_MAP_TAB);
            Thread.sleep(5500);
            Assert.assertTrue("Trace Map Area is not shown up please verify", homePage.isPresentElement(homePage.MAP_TAB_AREA));
            helperImplementation.takeMapScreenshot();
        } else {
            Assert.fail("Trace Map Tab is not present to click");
        }
    }

    public void validateOTDRTab(String otdr, String margin) throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_OTDR_TAB)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_OTDR_TAB);
            Thread.sleep(5500);
            homePage.OTDR_VALUE_BOX.sendKeys(otdr);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.OTDR_START_VALUE_DROPDOWN);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.OTDR_FROM_END_SELECTION_VALUE);
            Thread.sleep(5500);
            WebElement element = driver.findElement(By.xpath("//*[starts-with(@id,\"mat-tab-conten\")]//sncr-trace-otdr/as-split/div"));
            actions.dragAndDropBy(element, 300, 350).build().perform();
            Thread.sleep(3000);
            homePage.OTDR_MARGIN_VALUE_BOX.sendKeys(margin);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.OTDR_GO_BUTTON);
            Thread.sleep(5500);
            Assert.assertTrue("OTDR Map area is not present please verify", homePage.isPresentElement(homePage.MAP_TAB_AREA));
        } else {
            Assert.fail("OTDR Tab is not present to click");
        }
    }

    public void navigateToSplicing() throws InterruptedException {
        if (homePage.isPresentElement(homePage.SPLICING)) {
            homePage.clickToolElement(homePage.SPLICING);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.FROM_CIRCUIT_OWNER);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.FIRST_SEGMENT_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TO_CIRCUIT_OWNER);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SECOND_SEGMENT_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.FIRST_ITEM_SELECTION);
        } else {
            Assert.fail("SPLICING Tab is not Present to Click Please verify!..");
        }
    }

    public void verifyReportsTabInSplicing() throws InterruptedException {
        if (homePage.isPresentElement(homePage.SPLICING_REPORT_TAB)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICING_REPORT_TAB);
            Thread.sleep(5500);
            Assert.assertTrue("Splice Report is not Present please verify ", homePage.isPresentElement(homePage.SPLICE_REPORT_IFRAME));
            helperImplementation.highLightElement(driver, homePage.SPLICE_REPORT_IFRAME);
            Thread.sleep(5500);
            // homePage.clickToolElement(homePage.DOWNLOAD_BUTTON);
        } else {
            Assert.fail("Report Tab is not Present please Verify!..");
        }
    }


    public void validateSpliceTayReports() throws InterruptedException {
        // List<WebElement> elements = driver.findElements(By.xpath("//sncr-splice-panel//mat-tab-group/mat-tab-header//div[" + i + "]"));
        for (int i = 4; i <= 11; i++) {
            WebElement element = driver.findElement(By.xpath("//sncr-splice-panel//mat-tab-group/mat-tab-header//div[" + i + "]"));
            Thread.sleep(5500);
            element.click();
            Thread.sleep(5500);
            Assert.assertTrue("Splice Tray Report is not shown up please verify", homePage.isPresentElement(homePage.SPLICE_TRAY_REPORT));
            helperImplementation.highLightElement(driver, homePage.SPLICE_TRAY_REPORT);
        }
    }

    public void validateDrawingForSelectedEntity() throws InterruptedException, IOException {
        if (homePage.isPresentElement(homePage.CONTAINED_MDU_IDM_BUILDING_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CONTAINED_MDU_IDM_BUILDING_BUTTON);
            Thread.sleep(4000);
            helperImplementation.takeMapScreenshot();
        } else {
            Assert.fail("CONTAINED MDU_IDM_BUILDING_BUTTON is not Present");
        }
    }

    public void validateSpliceTrayReport() throws InterruptedException {
        Thread.sleep(10000);
        if (homePage.isPresentElement(homePage.SPLICE_TRAY_REPORT_1)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_TRAY_REPORT_1);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SPLICE_REPORT_IFRAME);
            Assert.assertTrue("Splice Tray Report is not present please verify ", homePage.isPresentElement(homePage.SPLICE_REPORT_IFRAME));
        } else {
            Assert.fail("Splice Tray Report is not Present please verify");
        }

    }

    public void createReport() throws InterruptedException {
        Thread.sleep(10000);
        if (homePage.isPresentElement(homePage.CREATE_REPORT)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CREATE_REPORT);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SELECT_TYPE);
        } else {
            Assert.fail("Create Report button is not Present to click Please Verify!!... ");
        }

    }

    public void createSpliceConnectionAndVerify(String fiberSpliceID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.SPLICE_CONNECTIONS_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTIONS_DASHBOARD);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Splice Connections select Type or Fiber Splice Entity Box is not Present Please verify");
        }

    }

    public void createRfPowerTraceDiagramAndVerify(String powerSupplyID, String JOBID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.RF_POWER_TRACE_DIAGRAM_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.RF_POWER_TRACE_DIAGRAM_DASHBOARD);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(JOBID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("RF Power Trace Diagram or Power Supply Entity Box is not Present Please verify");
        }
    }

    public void createEquipmentReportAndVerify(String boundaryID, String properties) throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.EQUIPMENT_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.EQUIPMENT_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.PROPERTIES_BOX.click();
            homePage.PROPERTIES_BOX.sendKeys(properties);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Equipment Report select Type is not Present Please verify");
        }
    }

    public void createSpliceTrayReportAndVerify(String fiberSpliceID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.SPLICE_TRAY_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_TRAY_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
        } else {
            Assert.fail("Splice Tray Report select Type is not Present Please verify");
        }
    }

    public void createTraceReportAndVerify(String FiberCableID, String PhysicalSeq, String Channel, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.PHYSICAL_SEQ_NUMBER_BOX.clear();
            homePage.PHYSICAL_SEQ_NUMBER_BOX.click();
            homePage.PHYSICAL_SEQ_NUMBER_BOX.sendKeys(PhysicalSeq);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.clear();
            homePage.CHANNEL_NUMBER_BOX.sendKeys(Channel);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Trace Report Select Type is not Present Please verify");
        }
    }

    public void createTraceSchematicReportAndVerify(String fiberCableID, String physicalSeq, String channel, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_SCHEMATIC_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_SCHEMATIC_DASHBOARD);
            Thread.sleep(5500);
            homePage.PHYSICAL_SEQ_NUMBER_BOX.clear();
            homePage.PHYSICAL_SEQ_NUMBER_BOX.sendKeys(physicalSeq);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.clear();
            homePage.CHANNEL_NUMBER_BOX.sendKeys(channel);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Trace Schematic Report Select Type is not Present Please verify");
        }
    }

    public void createTraceSummaryReportAndVerify(String fiberCableID, String physicalSeq, String channel, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE_SUMMARY_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_SUMMARY_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.PHYSICAL_SEQ_NUMBER_BOX.clear();
            homePage.PHYSICAL_SEQ_NUMBER_BOX.sendKeys(physicalSeq);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.clear();
            homePage.CHANNEL_NUMBER_BOX.sendKeys(channel);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Trace Summary Report Select Type is not Present Please verify");
        }
    }

    public void createBlownFiberSchematicReportAndVerify(String SUPPORTTUBEID, String port, String channel, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.BLOWN_FIBER_SCHEMATIC_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.BLOWN_FIBER_SCHEMATIC_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.clear();
            homePage.CHANNEL_NUMBER_BOX.sendKeys(channel);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Blown Fiber Schematic Report Type is not Present Please verify");
        }
    }


    public void createBoundaryAddressReportAndVerify(String BoundaryID, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.BOUNDARY_ADDRESS_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.BOUNDARY_ADDRESS_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Boundary Address Report Type is not Present Please verify");
        }
    }

    public void createHomePassedReportAndVerify(String BoundaryID, String jobID) throws InterruptedException {
        if (homePage.isPresentElement(homePage.HOME_PASSED_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.HOME_PASSED_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.click();
            homePage.JOB_ID_BOX.sendKeys(jobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Home Passed Report Type is not Present Please verify");
        }
    }

    public void createClassDiagramReportandVerify(String entity) throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.CLASS_DIAGRAM_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CLASS_DIAGRAM_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Class Diagram Report Type is not Present Please verify");
        }
    }

    public void createQueryReportandVerify(String OrderByProperties, String PropertyNames) throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.QUERY_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.QUERY_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.QUERY_ORDERBY_PROPERTIES_BOX.sendKeys(OrderByProperties);
            Thread.sleep(5500);
            homePage.QUERY_PROPERTIES_NAME_BOX.click();
            homePage.QUERY_ORDERBY_PROPERTIES_BOX.sendKeys(PropertyNames);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("Query Report Type is not Present verify");
        }

    }

    public void navigateToSearchTab() throws InterruptedException {
        Thread.sleep(500);
        actions.dragAndDrop(homePage.VERTICAL_SCROLL, homePage.SEARCH).build().perform();
        Thread.sleep(2000);
        if (homePage.isPresentElement(homePage.SEARCH)) {
            homePage.clickToolElement(homePage.SEARCH);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SEARCH_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.SEARCH_DASHBOARD_TEXT.getText(), "Search\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.SEARCH_PANEL.isDisplayed());
        } else {
            Assert.fail("Search is not Present");
        }

    }

    public void verifySearchConfiguration() throws InterruptedException {
        helperImplementation.highLightElement(driver, homePage.SEARCH_DROPDOWN_CONFIG);
        List<WebElement> elements = driver.findElements(By.xpath("//sncr-search-configuration//mat-toolbar/button"));
        for (int i = 1; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//sncr-search-configuration//mat-toolbar/button[" + i + "]"));
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, element);
        }

    }

    public void navigateToWMTS() throws InterruptedException {
        Thread.sleep(3000);
        actions.dragAndDrop(homePage.VERTICAL_SCROLL, homePage.WMTS).build().perform();
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.WMTS)) {
            homePage.clickToolElement(homePage.WMTS);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SEARCH_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.SEARCH_DASHBOARD_TEXT.getText(), "View Profiles\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.MAP_AREA.isDisplayed());
        } else {
            Assert.fail("WMTS is not Present");
        }
    }

    public void verifyWMTSPanel() throws InterruptedException {
        Assert.assertTrue(homePage.isPresentElement(homePage.MAP_AREA));
    }

    public void validateWMTSOpenPanel() throws InterruptedException {
        if (homePage.isPresentElement(homePage.WMTS_OPEN_BUTTON)) {
            homePage.clickToolElement(homePage.WMTS_OPEN_BUTTON);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.WMTS_VIEW_PROFILE);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.WMTS_PROFILE_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.WMTS_OPEN_SELECTION);
            Thread.sleep(10000);
            Assert.assertTrue("View Profile is not opened to see the Layers", homePage.WMTS_LAYERS_List.isDisplayed());

        } else {
            Assert.fail("OPen Button is nt present to click");
        }
    }

    public void validateWMTSImportPanel() throws InterruptedException {
        if (homePage.isPresentElement(homePage.WMTS_IMPORT_BUTTON)) {
            homePage.clickToolElement(homePage.WMTS_IMPORT_BUTTON);
            Thread.sleep(5500);
            Assert.assertTrue("View Profile is not present", homePage.WMTS_VIEW_PROFILE_IMPORT.isDisplayed());
            Assert.assertTrue("Cad Type is not present", homePage.WMTS_CAD_IMPORT.isDisplayed());
            Assert.assertTrue("Default View profile Checkbox is not present", homePage.WMTS_DEFAULT_VIEW_PROFILE_IMPORT.isDisplayed());
            Assert.assertTrue("Active only Checkbox is not present", homePage.WMTS_ACTIVE_ONLY_IMPORT.isDisplayed());
            //  Assert.assertTrue("Hide type is not present", homePage.WMTS_HIDE_TYPE_IMPORT.isDisplayed());
            homePage.clickToolElement(homePage.WMTS_CANEL_IMPORT_BUTTON);
        } else {
            Assert.fail("Imprt Button is nt present to click");
        }
    }

    public void validateWMTSBasicfeatures() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath("//div/sncr-wmts-configuration/mat-toolbar/button"));
        for (int i = 1; i <= elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//div/sncr-wmts-configuration/mat-toolbar/button[" + i + "]"));
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, element);

        }

    }

    public void navigateToCacheManager() throws InterruptedException {
        if (homePage.isPresentElement(homePage.MANAGER)) {
            homePage.clickToolElement(homePage.MANAGER);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SEARCH_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.SEARCH_DASHBOARD_TEXT.getText(), "Disconnected Manager\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.MAP_AREA.isDisplayed());
        } else {
            Assert.fail("Cache Manager is not Present");
        }

    }

    public void verifyCacheManagerPanel() {
        Assert.assertTrue(homePage.isPresentElement(homePage.MAP_AREA));
    }

    public void clickCacheManager() {
        if (homePage.isPresentElement(homePage.MANAGER_ADD_CACHE)) {
            homePage.clickToolElement(homePage.MANAGER_ADD_CACHE);
        } else {
            Assert.fail("Cache Manager Button is not Present to click");
        }

    }

    public void validateSearchCache() {
        if (homePage.isPresentElement(homePage.SEARCH_CACHE)) {
            homePage.SEARCH_CACHE.sendKeys("Test");
        }
    }


    public void validateTraceReport(String PhysicalSeq, String Channel) throws InterruptedException {
        Thread.sleep(6000);
        if (homePage.isPresentElement(homePage.REPORT_PANEL)) {
            helperImplementation.highLightElement(driver, homePage.REPORT_PANEL);
            Thread.sleep(5500);
            homePage.PHYSICAL_SEQ_NUMBER_BOX.clear();
            homePage.PHYSICAL_SEQ_NUMBER_BOX.sendKeys(PhysicalSeq);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.clear();
            homePage.CHANNEL_NUMBER_BOX.sendKeys(Channel);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(8000);
            Assert.assertTrue("Download Button is not present hence report is not generated", homePage.isPresentElement(homePage.DOWNLOAD_BUTTON));
        } else {
            Assert.fail("Trace Report is not Present Please verify");
        }
    }

    public void validateSpliceReportPanel() throws InterruptedException {
        Thread.sleep(6000);
        if (homePage.isPresentElement(homePage.REPORT_PANEL)) {
            helperImplementation.highLightElement(driver, homePage.REPORT_PANEL);
            Thread.sleep(6000);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(28000);
            Assert.assertTrue("Splice Report Iframe is not Present", homePage.isPresentElement(homePage.SPLICE_REPORT_IFRAME));
            Assert.assertTrue("Download Button is not present hence report is not generated", homePage.isPresentElement(homePage.DOWNLOAD_BUTTON));
        } else {
            Assert.fail("Splice Report is not Present Please verify");
        }

    }

    public void navigateEquipmentReport() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.EQUIPMENT_REPORT)) {
            Thread.sleep(10000);
            homePage.clickToolElement(homePage.EQUIPMENT_REPORT);
            Thread.sleep(10000);
        } else {
            Assert.fail("Equipment Report is not present to click.......please verify");
        }
    }

    public void validateEquipmentReport() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.REPORT_PANEL)) {
            helperImplementation.highLightElement(driver, homePage.REPORT_PANEL);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
            Assert.assertTrue("Download Button is not present hence report is not generated", homePage.isPresentElement(homePage.DOWNLOAD_BUTTON));
        } else {
            Assert.fail("Equipment Report is not Present Please verify");
        }


    }

    public void navigateAddressListReport() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.ADDRESS_LIST_REPORT)) {
            Thread.sleep(10000);
            homePage.clickToolElement(homePage.ADDRESS_LIST_REPORT);
            Thread.sleep(10000);
        } else {
            Assert.fail("Address List Report is not present to click.......please verify");
        }

    }

    public void validateAddressListReport() throws InterruptedException {
        Thread.sleep(6000);
        if (homePage.isPresentElement(homePage.REPORT_PANEL)) {
            helperImplementation.highLightElement(driver, homePage.REPORT_PANEL);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
            Assert.assertTrue("Download Button is not present hence report is not generated", homePage.isPresentElement(homePage.DOWNLOAD_BUTTON));
        } else {
            Assert.fail("Address List Report is not Present Please verify");
        }
        System.gc();

    }

    public void navigateHomePassedReport() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.HOME_PASSED_REPORT)) {
            Thread.sleep(10000);
            homePage.clickToolElement(homePage.HOME_PASSED_REPORT);
            Thread.sleep(10000);
        } else {
            Assert.fail("Home Passed Report is not present to click.......please verify");
        }

    }

    public void validateHomePassedReport() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.REPORT_PANEL)) {
            helperImplementation.highLightElement(driver, homePage.REPORT_PANEL);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
            Assert.assertTrue("Download Button is not present hence report is not generated", homePage.isPresentElement(homePage.DOWNLOAD_BUTTON));
        } else {
            Assert.fail("Home Passed Report is not Present Please verify");
        }
        System.gc();
    }


    public void navigateToRfpower() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.RF_POWER)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.RF_POWER);
            Thread.sleep(5500);
        } else {
            Assert.fail("RF Power Report is not  Present to click please verify........");
        }
    }

    public void validateRfPowerReport() throws InterruptedException {
        Thread.sleep(10000);
        if (homePage.isPresentElement(homePage.RF_POWER)) {
            Thread.sleep(5500);
            driver.switchTo().frame(homePage.REPORT_IFRAME);
            Thread.sleep(5000);
            Assert.assertTrue("RF Power Report table is not present please verify", homePage.isPresentElement(homePage.TRACE_SUMMARY_REPORT));
            Thread.sleep(2000);
            helperImplementation.highLightElement(driver, homePage.TRACE_SUMMARY_REPORT);
            Thread.sleep(5500);
            driver.switchTo().defaultContent();
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DOWNLOAD_BUTTON);
        } else {
            Assert.fail("Rf Report is not present");
        }
        System.gc();

    }

    public void navigateToRfPowerTraceReport() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.RF_POWER_TRACE)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.RF_POWER_TRACE);
        } else {
            Assert.fail("RF Power Trace is not present");
        }
    }

    public void validateRfPowerTraceReport() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame(homePage.REPORT_IFRAME);
        Thread.sleep(20000);
        Assert.assertTrue("RF Power Trace Report table is not present please verify", homePage.isPresentElement(homePage.RF_POWER_TRACE_REPORT));
        helperImplementation.highLightElement(driver, homePage.RF_POWER_TRACE_REPORT);
        Thread.sleep(5500);
        driver.switchTo().defaultContent();
        Thread.sleep(5500);
        homePage.clickToolElement(homePage.DOWNLOAD_POWER_TRACE_BUTTON);
    }

    public void clickRedlinePencil() {
        homePage.clickToolElement(homePage.REDLINE_PENCIL);
    }

    public void validateRedlinePencil() throws InterruptedException {
        if (homePage.isPresentElement(homePage.REDLINE_PENCIL)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_PENCIL);
        } else {
            Assert.fail("Red Line Pencil is not present to click..Please verify");
        }
    }

    public void validateRedlineChipDisplayed() {
        Assert.assertTrue(homePage.REDLINE_CHIP_CREATED.isDisplayed());
        Assert.assertEquals(homePage.REDLINE_CHIP_CREATED.getText(), "spatialOFFICE Redline Created by AU-MELOCIQACL3\\admin");

    }

    public void zoomToArea() throws InterruptedException {
        if (homePage.isPresentElement(homePage.ZOOM_LEVEL_BOX)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_LEVEL_BOX);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_DROPDOWN);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.ZOOM_LEVEL_19);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.ZOOM_LEVEL_BOX_GO_BUTTON);
            Thread.sleep(5000);
            homePage.clickToolElement(homePage.ZOOM_LEVEL_CLOSE_BUTTON);
        } else {
            Assert.fail("Zoom Level Box is not present to click");
        }
    }

    public void validateAlphabetButton() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.REDLINE_ALPHABET_FONT_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_ALPHABET_FONT_BUTTON);
            Thread.sleep(5500);
//            Actions actions = new Actions(driver);
//            actions.moveToElement(homePage.MAP_AREA, 650, 750).click().perform();
            homePage.clickToolElement(homePage.MAP_AREA);

        } else {
            Assert.fail("Red line Alphabet is not present to click");
        }
    }

    public void enterTextInMapArea() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TEXT_AREA)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TEXT_AREA);
            Thread.sleep(5500);
            homePage.TEXT_AREA.sendKeys("TEST RED LINE TEXT");
            homePage.clickToolElement(homePage.REDLINE_TEXT_SUBMIT);

        } else {
            Assert.fail("Text Area is not present please verify*");
        }
    }

    public void clickRedlineShapesButton() throws InterruptedException {
        if (homePage.isPresentElement(homePage.REDLINE_SHAPES_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);

        } else {
            Assert.fail("Red line Alphabet is not present to click");
        }

    }

    public void validateShapesList() throws InterruptedException {
        for (int i = 1; i <= 16; i++) {
            WebElement element = driver.findElement(By.xpath("//mat-button-toggle[" + i + "]//button"));
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, element);
        }
    }

    public void addShapesMapArea() throws InterruptedException {
        homePage.clickToolElement(homePage.AMP_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -300, -400).click().perform();

        homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.ANCHOR_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -350, -405).click().perform();

        homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.CIRCLEFILLED_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -400, -450).click().perform();

        homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.SQUARE_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -150, -200).click().perform();

        homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.STARFILLED_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -100, -150).click().perform();

        homePage.clickToolElement(homePage.REDLINE_SHAPES_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.TRIANGLE_SHAPE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, -400, -500).click().perform();
    }


    public void clickRedlinePolygon() throws Exception {
        if (homePage.isPresentElement(homePage.REDLINE_POLYGON_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_POLYGON_BUTTON);
        } else {
            Assert.fail("Red line Polygon Button is not Present to click");
        }

    }

    public void drawAPolygonMapArea() throws Exception {
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, 700, 770).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 770, 800).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 800, 820).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 820, 840).click().perform();
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_CIRCLE_BUTTON);
    }

    public void clickDrawLine() throws InterruptedException {
        Thread.sleep(2500);
        if (homePage.isPresentElement(homePage.REDLINE_ARROWS_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_ARROWS_BUTTON);
        } else {
            Assert.fail("Red line Arrows Button is not Present to click");
        }

    }

    public void drawLineMapArea() throws InterruptedException {
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_DRAW_LINE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, 600, 650).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 650, 680).click().perform();
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_CIRCLE_BUTTON);
    }

    public void drawLineArrowMapArea() throws Exception {
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_ARROWS_BUTTON);
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_ARROWS_LINE_BUTTON);
        Thread.sleep(5500);
        actions.moveToElement(homePage.MAP_AREA, 500, 520).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 520, 540).click().perform();
        Thread.sleep(5500);
        homePage.clickToolElement(homePage.REDLINE_CIRCLE_BUTTON);
    }

    public void draLineArrowDoubleMapArea() throws InterruptedException {
        homePage.clickToolElement(homePage.REDLINE_ARROWS_BUTTON);
        Thread.sleep(5500);
        homePage.clickToolElement(homePage.REDLINE_DOUBLE_ARROWS_LINE_BUTTON);
        Thread.sleep(2500);
        actions.moveToElement(homePage.MAP_AREA, 800, 820).click().perform();
        actions.moveToElement(homePage.MAP_AREA, 820, 840).click().perform();
        Thread.sleep(2500);
        homePage.clickToolElement(homePage.REDLINE_CIRCLE_BUTTON);
    }

    public void navigateTORfLevelsReport() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.RF_LEVELS)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.RF_LEVELS);
        }
    }

    public void validateRfLevelsReport() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.RF_LEVELS)) {
            Thread.sleep(6000);
            driver.switchTo().frame(homePage.REPORT_IFRAME);
            Assert.assertTrue("RF Power Report table is not present please verify", homePage.isPresentElement(homePage.TRACE_SUMMARY_REPORT));
            helperImplementation.highLightElement(driver, homePage.TRACE_SUMMARY_REPORT);
            Thread.sleep(6000);
            driver.switchTo().defaultContent();
            Thread.sleep(6000);
            homePage.clickToolElement(homePage.DOWNLOAD_BUTTON);
        } else {
            Assert.fail("Rf Levels Report is not present Please verify..");
        }
    }

    public void clickTrashButton() throws InterruptedException {
        if (homePage.isPresentElement(homePage.REDLINE_TRASH_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_TRASH_BUTTON);
        } else {
            Assert.fail("Red line Trash button is not present to click Please verify..");
        }
    }

    public void verifyDialogOpened() throws InterruptedException {
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.REDLINE_DIALOG_YES_BUTTON);
            Thread.sleep(5500);
        } else {
            Assert.fail("Dialog is not Opened.Please verify");
        }
    }

    public void verifyRulerDisplayed() throws InterruptedException {
        if (homePage.isPresentElement(homePage.RULER)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.RULER);
            Thread.sleep(5500);
        } else {
            Assert.fail("Ruler is not Present.Please verify");
        }
    }

    public void verifyDistanceOption() throws InterruptedException {
        if (homePage.isPresentElement(homePage.MEASURE_DISTANCE_LINE)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.MEASURE_DISTANCE_LINE);
            Thread.sleep(2000);
            homePage.isPresentElement(homePage.DIALOG_CONTAINER);
            Thread.sleep(5500);
            actions.moveToElement(homePage.MAP_AREA, 500, 550);
            actions.moveToElement(homePage.MAP_AREA, 550, 650);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DIALOG_CLOSE_BUTTON);
        } else {
            Assert.fail("Measure Line is not Present.Please verify");
        }

    }

    public void verifyAreaOption() throws InterruptedException {
        homePage.clickToolElement(homePage.RULER);
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.MEASURE_AREA_DISTANCE_POLYGON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.MEASURE_AREA_DISTANCE_POLYGON);
            homePage.isPresentElement(homePage.DIALOG_CONTAINER);
            Thread.sleep(5500);
            actions.moveToElement(homePage.MAP_AREA, 350, 450);
            actions.moveToElement(homePage.MAP_AREA, 450, 550);
            actions.moveToElement(homePage.MAP_AREA, 550, 600);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.DIALOG_CLOSE_BUTTON);
        } else {
            Assert.fail("Measure Area Polygon is not Present.Please verify");
        }
    }

    public void verifyGoToLocationDisplayedAndClick() {
        if (homePage.isPresentElement(homePage.SEARCH_LOCATION)) {
            homePage.clickToolElement(homePage.SEARCH_LOCATION);

        } else {
            Assert.fail("Go To Location is not Present.Please verify");
        }
    }

    public void verifyPopUpGoToLocation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            helperImplementation.highLightElement(driver, homePage.DIALOG_CONTAINER);
            Thread.sleep(500);
            helperImplementation.highLightElement(driver, homePage.COORDINATE_SYSTEM_SELECT);
            Thread.sleep(500);
            helperImplementation.highLightElement(driver, homePage.LAT_LONG_SELECT);
            Thread.sleep(500);
            helperImplementation.highLightElement(driver, homePage.ZOOM_SELECT);
            homePage.clickToolElement(homePage.GO_TO_LOCATION_CLOSE_BUTTON);
        } else {
            Assert.fail("Go to Location Search Dialog is not resent Please verify");
        }

    }

    public void shareDisplayedClick() throws InterruptedException {
        if (homePage.isPresentElement(homePage.COPY_URL)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.COPY_URL);
            Thread.sleep(5500);
        } else {
            Assert.fail("Share button is not Present.Please verify");
        }
    }

    public void verifyLatLongCopy() throws InterruptedException {
        if (homePage.isPresentElement(homePage.COPY_LAT_LONG_LINK_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.COPY_LAT_LONG_LINK_BUTTON);
            Thread.sleep(5500);
            homePage.isPresentElement(homePage.DIALOG_CONTAINER);
            helperImplementation.highLightElement(driver, homePage.DIALOG_CONTAINER);
            homePage.clickToolElement(homePage.DIALOG_OK_BUTTON);

        } else {
            Assert.fail("Copy Lat and Long option is not Present.Please verify");
        }
    }

    public void verifyFeatureCopy() throws InterruptedException {
        homePage.clickToolElement(homePage.COPY_URL);
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.COPY_FEATURE_BUTTON)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.COPY_FEATURE_BUTTON);
            Thread.sleep(5500);
            homePage.isPresentElement(homePage.DIALOG_CONTAINER);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.DIALOG_CONTAINER);
            homePage.clickToolElement(homePage.DIALOG_OK_BUTTON);

        } else {
            Assert.fail("Copy Feature option is not Present.Please verify");
        }
    }

    public void printDisplayedClick() {
        Assert.assertTrue(homePage.PRINT_MAP.isDisplayed());
        helperImplementation.highLightElement(driver, homePage.PRINT_MAP);
    }

    public void verifyClearControl() throws InterruptedException {
        if (homePage.isPresentElement(homePage.CLEAR_CONTROLS)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CLEAR_CONTROLS);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.CLEAR_CURRENT_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CLEAR_CURRENT_SELECTION);
            Thread.sleep(500);
            homePage.clickToolElement(homePage.CLEAR_CONTROLS);
            Thread.sleep(500);
            helperImplementation.highLightElement(driver, homePage.CLEAR_DROPPED_PINS);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CLEAR_DROPPED_PINS);
        } else {
            Assert.fail("Clear Control button is not Present.Please verify");
        }
    }

    public void verifyZoomToLocation() throws InterruptedException {
        if (homePage.isPresentElement(homePage.ZOOM_TO_LOCATION_ARROW)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_TO_LOCATION_ARROW);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.ZOOM_USER_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_USER_SELECTION);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_TO_LOCATION_ARROW);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.ZOOM_KEYMAP);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.ZOOM_KEYMAP);

        } else {
            Assert.fail("Zoom To Location button is not Present.Please verify");
        }

    }

    public void validatePreviousView() throws InterruptedException, IOException {
        if (homePage.isPresentElement(homePage.CHEVRON_LEFT)) {
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.CHEVRON_LEFT);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CHEVRON_LEFT);
            Thread.sleep(5500);
            helperImplementation.takeMapScreenshot();
        } else {
            Assert.fail("Go to Previous View button is not Present.Please verify");
        }
    }

    public void validateNextView() throws InterruptedException, IOException {
        if (homePage.isPresentElement(homePage.CHEVRON_RIGHT)) {
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.CHEVRON_RIGHT);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.CHEVRON_RIGHT);
            Thread.sleep(5500);
            helperImplementation.takeMapScreenshot();
        } else {
            Assert.fail("Go to Next View button is not Present.Please verify");
        }
    }


    public void clickReportsDropdown() {
        if (homePage.isPresentElement(homePage.REPORTS)) {
            homePage.clickToolElement(homePage.REPORTS_DROPDOWN);
        } else {
            Assert.fail("Reports is not Present");
        }
    }


    public void clickSpatialFilter() throws InterruptedException {
        Thread.sleep(6000);
        if (homePage.isPresentElement(homePage.SPATIAL_FILTER_BUTTON)) {
            Thread.sleep(5000);
            actions.click(homePage.SPATIAL_FILTER_BUTTON).build().perform();
            //homePage.clickToolElement(homePage.SPATIAL_FILTER_BUTTON);
        } else {
            Assert.fail("Spatial Filter Button is present to click please verify...");
        }
    }

    public void clickSpatialFilterSecond() throws InterruptedException {
        Thread.sleep(6000);
        if (homePage.isPresentElement(homePage.SPATIAL_FILTER_BUTTON)) {
            Thread.sleep(5000);
            actions.click(homePage.SPATIAL_FILTER_BUTTON).build().perform();
            //homePage.clickToolElement(homePage.SPATIAL_FILTER_BUTTON);
        } else {
            Assert.fail("Spatial Filter Button is present to click please verify...");
        }
    }

    public void SpatialFilterForCurrentView() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            homePage.GEOPROCESSING_DISTANCE_INPUT.clear();
            Thread.sleep(3000);
            homePage.GEOPROCESSING_DISTANCE_INPUT.sendKeys("100");
            homePage.GEOPROCESSING_BUFFER_SUBMIT.click();
            Thread.sleep(5000);
        } else {
            Assert.fail("Spatial Filter Dialog is not opened please verify");
        }

    }

    public void SpatialFilterForPolygon() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.GEOPROCESSING_POLYGON_RADIO_BUTTON);
            Thread.sleep(3000);
            homePage.GEOPROCESSING_DISTANCE_INPUT.clear();
            Thread.sleep(3000);
            homePage.GEOPROCESSING_DISTANCE_INPUT.sendKeys("100");
            Thread.sleep(3000);
            Assert.assertTrue(homePage.isPresentElement(homePage.GEOPROCESSING_UNIT));
            Thread.sleep(3000);
            actions.moveToElement(homePage.MAP_AREA, 800, 820).click().perform();
            actions.moveToElement(homePage.MAP_AREA, 820, 840).click().perform();
            actions.moveToElement(homePage.MAP_AREA, 840, 860).click().perform();
            Thread.sleep(3000);
            homePage.GEOPROCESSING_BUFFER_SUBMIT.click();
            Thread.sleep(5000);
        } else {
            Assert.fail("Spatial Filter Dialog is not opened please verify");
        }
    }

    public void SpatialFilterForCurrentSelection() throws InterruptedException {

        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.SPATIAL_FILTER_CURRENT_SELECTION);
            Thread.sleep(3000);
            homePage.GEOPROCESSING_DISTANCE_INPUT.clear();
            Thread.sleep(3000);
            homePage.GEOPROCESSING_DISTANCE_INPUT.sendKeys("100");
            Assert.assertTrue(homePage.isPresentElement(homePage.GEOPROCESSING_UNIT));
            Thread.sleep(3000);
            homePage.GEOPROCESSING_BUFFER_SUBMIT.click();
            Thread.sleep(5000);
        } else {
            Assert.fail("Spatial Filter Dialog is not opened please verify");
        }
    }

    public void clickMasterCircuitButton() throws InterruptedException {
        if (homePage.isPresentElement(homePage.MASTER_CIRCUIT_FIRST_BUTTON)) {
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.MASTER_CIRCUIT_FIRST_BUTTON);
            WebElement element = driver.findElement(By.xpath("//as-split-area[1]/sncr-circuit-list//tr[3]/td[10]/div/button"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            //homePage.clickToolElement(homePage.MASTER_CIRCUIT_FIRST_BUTTON);
            Thread.sleep(5500);
        } else {
            Assert.fail("Master Circuit button is not Present.Please verify");
        }
    }

    public void searchJob(String JOB) throws InterruptedException {
        if (homePage.isPresentElement(homePage.JOBS_SEARCH_BOX)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.JOBS_SEARCH_BOX);
            homePage.JOBS_SEARCH_BOX.sendKeys(JOB);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.JOBS_FIRST_ITEM_SELECTION);
        } else {
            Assert.fail("JOBS Search Box is not Present.Please verify");
        }

    }

    public void createMasterCircuit() throws InterruptedException {
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(1000);
            homePage.isPresentElement(homePage.CREATE_MASTER_CIRCUIT_HEADER);
            Thread.sleep(1000);
            homePage.MASTER_CIRCUIT_NAME_BOX.sendKeys("Master Circuit 1");
            Thread.sleep(1000);
            homePage.MASTER_CIRCUIT_TYPECODE_SELECTION_BOX.click();
            homePage.MASTER_CIRCUIT_FIBER_SYSTEMS_SELECTION.click();
            Thread.sleep(1000);
            homePage.MASTER_CIRCUIT_ALTERNATE_NAME_BOX.sendKeys("Master Circuit 123");
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.MASTER_CIRCUIT_CLOSE_BUTTON);
            Thread.sleep(2500);
        } else {
            Assert.fail("Master Circuit Panel is not Present.Please verify");
        }

    }


    public void selectFiberSplice() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.FIBER_SPLICE_SELECT)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.FIBER_SPLICE_SELECT);
        } else {
            Assert.fail("Fiber Splice node is not present to click");
        }
    }

    public void clickBookMark() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.BOOKMARK_ICON)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.BOOKMARK_ICON);
        } else {
            Assert.fail("Book Mark Icon is not present to click");
        }

    }

    public void validateBookMark() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.BOOKMARK_DIALOG_TITLE)) {
            Thread.sleep(3000);
            helperImplementation.highLightElement(driver, homePage.BOOKMARK_SELECTED_BOX);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.BOOKMARK_ADD_BUTTON);
        }
    }

    public void validateBookMarkTab(String BOOKMARK) throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.BOOKMARK_TAB)) {
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.BOOKMARK_TAB);
            Thread.sleep(3000);
            homePage.BOOKMARK_SEARCH_BOX.sendKeys(BOOKMARK);
            Thread.sleep(3000);
            homePage.clickToolElement(homePage.BOOKMARK_SELECTED_ITEM);
            Thread.sleep(3000);
            homePage.isPresentElement(homePage.BOOKMARK_STAR_BUTTON_DETAILS);
            helperImplementation.highLightElement(driver, homePage.BOOKMARK_STAR_BUTTON_DETAILS);
        } else {
            Assert.fail("Book Mark Tab is not present to click");
        }

    }

    public void validateTitleOfEntityOSM() throws InterruptedException, IOException {
        Thread.sleep(3000);
        String selectedEntity = homePage.ENTITY_SELECTION.getText();
        System.out.println("Selected **" + selectedEntity);
        homePage.clickToolElement(homePage.ENTITY_SELECTION);
        Thread.sleep(3000);
        helperImplementation.takeMapScreenshot();
        String detail = homePage.ENTITY_TITLE_DETAILS_PANEL.getText();
        System.out.println("Details value**" + detail);
        Thread.sleep(3000);
        if (selectedEntity.equalsIgnoreCase(detail)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Entity title from Search Selected to entity in details panel are not Matching please verify.." + homePage.ENTITY_SELECTION.getText().equalsIgnoreCase(detail));
        }
    }

    public void navigateToFindAndSearch(String Class) throws InterruptedException {
        Thread.sleep(5000);
        if (homePage.isPresentElement(homePage.FIND_BUTTON)) {
            Thread.sleep(5000);
            homePage.clickToolElement(homePage.FIND_BUTTON);
            Thread.sleep(6000);
            homePage.isPresentElement(homePage.QUERY_CLASS_DROPDOWN);
            Thread.sleep(2000);
            homePage.QUERY_CLASS_DROPDOWN.sendKeys(Class);
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.FIRST_SEGMENT_SELECTION);
            Thread.sleep(2000);
        } else {
            Assert.fail("Find Table Button is not present to click please check...");
        }
    }

    public void validateMenuItems() throws InterruptedException {
        Thread.sleep(3000);
        if (homePage.isPresentElement(homePage.QUERY_TABLE_CONTENT)) {
            Assert.assertTrue("Spatial Filter Button is not Present Please b=verify..", homePage.isPresentElement(homePage.SPATIAL_FILTER_BUTTON));
            Thread.sleep(1000);
            helperImplementation.highLightElement(driver, homePage.SPATIAL_FILTER_BUTTON);
            Thread.sleep(1000);
            Assert.assertTrue("RESET Class Columns Button is present Please verify..", homePage.isPresentElement(homePage.RESET_CLASS_COLUMNS));
            Thread.sleep(1000);
            helperImplementation.highLightElement(driver, homePage.RESET_CLASS_COLUMNS);
            Thread.sleep(1000);
            Assert.assertTrue("Show/Hide Column Button is present Please verify..", homePage.isPresentElement(homePage.SHOW_HIDE_COLUMNS_BUTTON));
            Thread.sleep(1000);
            helperImplementation.highLightElement(driver, homePage.SHOW_HIDE_COLUMNS_BUTTON);
            Thread.sleep(1000);
            Assert.assertTrue("Total Row Count Button is present Please verify..", homePage.isPresentElement(homePage.TOTAL_ROW_COUNT));
            Thread.sleep(1000);
            helperImplementation.highLightElement(driver, homePage.TOTAL_ROW_COUNT);
        } else {
            Assert.fail("Query Table Content is not loaded");
        }
    }

    public void validateCircuitReserveTag() throws InterruptedException, IOException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.RESERVE_TAG_BUTTON);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(1000);
            homePage.RESERVE_NAME_BOX.sendKeys("Test Reserve");
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.RESERVE_TAG_TYPE_CODE_SELECTION);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.RESERVE_TAG_FIRST_SELECTION);
            Thread.sleep(500);
            homePage.clickToolElement(homePage.RESERVE_TAG_SUBMIT);
            Thread.sleep(5000);
        } else {
            Assert.fail("Circuit Reserve Tag Dialog not Present Please verify...");
        }

    }

    public void validateEditCircuitReserveTag() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.RESERVE_TAG_BUTTON);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            Thread.sleep(5000);
            homePage.clickToolElement(homePage.RESERVE_TAG_SUBMIT);
            Thread.sleep(5000);
        } else {
            Assert.fail("Circuit Reserve Tag Dialog not Present Please verify...");
        }

    }


    public void createXyzLayer() throws InterruptedException {
        Thread.sleep(4000);
        homePage.clickToolElement(homePage.ADD_LAYER_BUTTON);
        Thread.sleep(1000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            homePage.clickToolElement(homePage.LAYER_TYPE);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.XYZ_LAYER_SELECTION);
            Thread.sleep(1000);
            homePage.LAYER_URL_INPUT_BOX.sendKeys("https://{a-c}.tile.thunderforest.com/cycle/{z}/{x}/{y}.png?apikey=0e6fc415256d4fbb9b5166a718591d71");
            Thread.sleep(1000);
            homePage.LAYER_INPUT_NAME_BOX.sendKeys("XYZ TEST LAYER");
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.LAYER_SAVE_BUTTON);
            Thread.sleep(5000);
        } else {
            Assert.fail("Layer Dialog is not Present to add XYZ Layer");
        }
    }

    public void deleteXyzLayer() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickToolElement(homePage.XYZ_DELETE_OPTION);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.XYZ_LAYER_SELECTION_DELETE);
        Thread.sleep(500);
        homePage.isPresentElement(homePage.XYZ_LAYER_SELECTION_FOR_DELETE);
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.XYZ_LAYER_SELECTION_FOR_DELETE);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.LAYER_DELETE_BUTTON);
        Thread.sleep(4000);

    }

    public void takeSearchUrlScreenshot() throws IOException, InterruptedException {
        Thread.sleep(30000);
        helperImplementation.takeMapScreenshot();
    }


    public void NavigateToTheming() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.THEMING_DASHBOARD)) {
            Thread.sleep(10000);
            homePage.clickToolElement(homePage.THEMING_DASHBOARD);
            Thread.sleep(10000);
        } else {
            Assert.fail("THEMING Dashboard is not present to click.......please verify");
        }
    }

    public void AddTheme() throws InterruptedException {
        Thread.sleep(6000);
        homePage.clickToolElement(homePage.ADD_THEME_BUTTON);

    }

    public void DetailsForCategorized() throws InterruptedException {
        Thread.sleep(2000);
        homePage.NAME_TEXT_BOX.sendKeys("Testing_Categorized_Theme");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_DROPDOWN);
        homePage.CLASS_LIST_DROPDOWN.sendKeys("Storage Loop");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CLASS_PROPERTY);
        Thread.sleep(500);
        homePage.CLASS_PROPERTY.sendKeys("AccountCode");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CLASSIFY_BUTTON);
        Thread.sleep(10000);
    }

    public void SaveTheme() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.SAVE_BUTTON_THEMING);
        Thread.sleep(5000);
    }

    public void NavigateToGraduated() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.GRADUATED_HEADER);
        Thread.sleep(2000);
    }

    public void DetailsGraduated() throws InterruptedException {
        Thread.sleep(2000);
        homePage.NAME_TEXT_BOX.sendKeys("Testing_Graduated_Theme");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_DROPDOWN);
        homePage.CLASS_LIST_DROPDOWN.sendKeys("Storage Loop");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CLASS_PROPERTY);
        Thread.sleep(500);
        homePage.CLASS_PROPERTY.sendKeys("AutoCADColor");
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(3000);
        homePage.clickToolElement(homePage.CLASSIFY_BUTTON);
        Thread.sleep(10000);
    }

    public void DetailsForGraduatedRange() throws InterruptedException {
        Thread.sleep(2000);
        homePage.NAME_TEXT_BOX.sendKeys("Testing_Graduated_Range_Theme");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_DROPDOWN);
        homePage.CLASS_LIST_DROPDOWN.sendKeys("Storage Loop");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.CLASS_PROPERTY);
        Thread.sleep(500);
        homePage.CLASS_PROPERTY.sendKeys("AutoCADSymbolScale");
        Thread.sleep(3000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(3000);
    }

    public void NavigateToRules() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.RULES_HEADER);
        Thread.sleep(1000);
    }

    public void DetailsForRules() throws InterruptedException {
        Thread.sleep(2000);
        homePage.NAME_TEXT_BOX.sendKeys("Testing_Rules_Theme");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_DROPDOWN);
        homePage.CLASS_LIST_DROPDOWN.sendKeys("Fiber Cable Geometry");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.CLASS_LIST_SELECTION);
        Thread.sleep(1000);
    }

    public void ClickAddRule() throws InterruptedException {
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", homePage.THEMING_RULES_BUTTON);
//        homePage.clickToolElement(homePage.THEMING_RULES_BUTTON);
        Thread.sleep(2000);

    }

    public void ClickColorBar() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickToolElement(homePage.THEMING_COLOR_BAR);
        Thread.sleep(8000);
        if (homePage.isPresentElement(homePage.COLOR_RAMP_TITLE)) {
            Thread.sleep(4000);
            homePage.clickToolElement(homePage.CHOOSE_COLOR_RAMP);
            Thread.sleep(2000);
            Assert.assertTrue(homePage.COLOR_OVERLAY_1.isDisplayed());
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.COLOR_SELECTION_LAYER_1);
            Thread.sleep(2000);
            Assert.assertTrue(homePage.COLOR_OVERLAY_2.isDisplayed());
            homePage.clickToolElement(homePage.COLOR_SELECTION_LAYER_2);
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.COLOR_SELECTION_OK_BUTTON);
            Thread.sleep(2000);
        } else {
            Assert.fail("COLOR RAMP Dialog is not displayed....");
        }
    }

    public void NavigateToGraduatedRange() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickToolElement(homePage.GRADUATED_RANGE_HEADER);
        Thread.sleep(2000);
    }

    public void AddRule() throws InterruptedException {
        Thread.sleep(2000);
        homePage.THEMING_QUERY_TEXT_BOX.sendKeys("NumberSpare = 97");
        Thread.sleep(1000);
    }

    public void AddMinMax() throws InterruptedException {
        Thread.sleep(2000);
        homePage.GRADUATED_RANGE_MIN_BOX.clear();
        Thread.sleep(1000);
        homePage.GRADUATED_RANGE_MIN_BOX.sendKeys("10");
        Thread.sleep(1000);
        homePage.GRADUATED_RANGE_MAX_BOX.clear();
        Thread.sleep(1000);
        homePage.GRADUATED_RANGE_MAX_BOX.sendKeys("50");
        Thread.sleep(1000);
        homePage.GRADUATED_RANGE_STEPS_BOX.clear();
        Thread.sleep(1000);
        homePage.GRADUATED_RANGE_STEPS_BOX.sendKeys("5");
        Thread.sleep(1000);
        homePage.clickToolElement(homePage.PREVIEW_THEMING_GRADUATED_RANGE);
        Thread.sleep(2000);
    }


    public void navigateToTraceTab() throws InterruptedException {
        if (homePage.isPresentElement(homePage.TRACE)) {
            homePage.clickToolElement(homePage.TRACE);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.TRACE_SELECTION);
            //Thread.sleep(5500);
        } else {
            Assert.fail("Trace Tab is not Present to click please verify........");
        }
    }


    public void createKmlLayer(String path) throws InterruptedException, AWTException {
        Thread.sleep(4000);
        homePage.clickToolElement(homePage.ADD_LAYER_BUTTON);
        Thread.sleep(1000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            homePage.clickToolElement(homePage.LAYER_TYPE);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.KML_LAYER_SELECTION);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.KML_IMPORT);
            Thread.sleep(5000);
            StringSelection strSelection = new StringSelection(path);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(strSelection, null);
            Thread.sleep(5000);
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(3000);
            robot.keyRelease(KeyEvent.VK_ENTER);
            homePage.LAYER_INPUT_NAME_BOX.sendKeys("KML");
            Thread.sleep(2000);
            homePage.clickToolElement(homePage.LAYER_SAVE_BUTTON);
            Thread.sleep(7000);

        } else {
            Assert.fail("Layer Dialog is not Present to add KML Layer");
        }
    }

    public void deleteKmlLayer() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickToolElement(homePage.XYZ_DELETE_OPTION);
        Thread.sleep(4000);
        homePage.clickToolElement(homePage.XYZ_LAYER_SELECTION_DELETE);
        Thread.sleep(500);
        homePage.clickToolElement(homePage.KML_LAYER_SELECTION_FOR_DELETE);
        Thread.sleep(3000);
        homePage.clickToolElement(homePage.LAYER_DELETE_BUTTON);
        Thread.sleep(4000);
    }

    public void createKmzLayer(String path) throws InterruptedException, AWTException {
        Thread.sleep(4000);
        homePage.clickToolElement(homePage.ADD_LAYER_BUTTON);
        Thread.sleep(1000);
        if (homePage.isPresentElement(homePage.DIALOG_CONTAINER)) {
            homePage.clickToolElement(homePage.LAYER_TYPE);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.KMZ_LAYER_SELECTION);
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.KML_IMPORT);
            Thread.sleep(3000);
            StringSelection strSelection = new StringSelection(path);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(strSelection, null);
            Thread.sleep(3000);
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(3000);
            robot.keyRelease(KeyEvent.VK_ENTER);
            homePage.LAYER_INPUT_NAME_BOX.sendKeys("KMZ");
            Thread.sleep(1000);
            homePage.clickToolElement(homePage.LAYER_SAVE_BUTTON);
            Thread.sleep(5000);

        } else {
            Assert.fail("Layer Dialog is not Present to add KMZ Layer");
        }
    }

    public void deleteKmzLayer() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickToolElement(homePage.XYZ_DELETE_OPTION);
        Thread.sleep(4000);
        homePage.clickToolElement(homePage.XYZ_LAYER_SELECTION_DELETE);
        Thread.sleep(500);
        homePage.clickToolElement(homePage.KMZ_LAYER_SELECTION_FOR_DELETE);
        Thread.sleep(3000);
        homePage.clickToolElement(homePage.LAYER_DELETE_BUTTON);
        Thread.sleep(4000);
    }

    public void navigateToSearchTabPostgresDb() throws InterruptedException {
        if (homePage.isPresentElement(homePage.SEARCH_POSTGRES)) {
            homePage.clickToolElement(homePage.SEARCH_POSTGRES);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SEARCH_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.SEARCH_DASHBOARD_TEXT.getText(), "Search\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.SEARCH_PANEL.isDisplayed());
        } else {
            Assert.fail("Search is not Present");
        }

    }

    public void navigateToWMTSPostgresDb() throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.WMTS_POSTGRES)) {
            homePage.clickToolElement(homePage.WMTS_POSTGRES);
            Thread.sleep(5500);
            helperImplementation.highLightElement(driver, homePage.SEARCH_DASHBOARD_TEXT);
            Assert.assertEquals(homePage.SEARCH_DASHBOARD_TEXT.getText(), "View Profiles\n" +
                    "A spatialSDK Application");
            Assert.assertTrue(homePage.MAP_AREA.isDisplayed());
        } else {
            Assert.fail("WMTS is not Present");
        }
    }


    public void createOtdrReportandVerify(String PhysicalSeq, String Channel, String JobID) throws InterruptedException {
        Thread.sleep(5500);
        if (homePage.isPresentElement(homePage.OTDR_REPORT_DASHBOARD)) {
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.OTDR_REPORT_DASHBOARD);
            Thread.sleep(5500);
            homePage.PHYSICAL_SEQ_NUMBER_BOX.sendKeys(PhysicalSeq);
            Thread.sleep(5500);
            homePage.CHANNEL_NUMBER_BOX.sendKeys(Channel);
            Thread.sleep(5500);
            homePage.JOB_ID_BOX.sendKeys(JobID);
            Thread.sleep(5500);
            homePage.clickToolElement(homePage.SPLICE_CONNECTION_SUBMIT);
            Thread.sleep(5500);
        } else {
            Assert.fail("OTDR Report Type is not Present verify");
        }
    }


}

