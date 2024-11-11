package stepDefinition.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepImplementation.HomePage.HomePageImplementation;

import java.awt.*;
import java.io.IOException;





public class HomePageDefinition {
    HomePageImplementation homePageImplementation = new HomePageImplementation();

    public HomePageDefinition() throws Exception {
        super();
    }


    @Given("^I verify the Map Section$")
    public void iVerifyTheMapSection() throws InterruptedException {
        homePageImplementation.mapSectionValidation();
    }

    @And("^I verify the Drawing Section$")
    public void iVerifyTheDrawingSection() throws InterruptedException {
        homePageImplementation.drawingSectionValidation();
    }

    @When("^I validate Trace Section$")
    public void iValidateTraceSection() throws InterruptedException {
        homePageImplementation.traceSectionValidation();
    }

    @When("^I validate Rf Power Section$")
    public void iValidateRfPowerSection() throws InterruptedException {
        homePageImplementation.rfPowerSectionValidation();
    }

    @When("^I validate Rf Levels Section$")
    public void iValidateRfLevelsSection() throws InterruptedException {
        homePageImplementation.rfLevelsSectionValidation();
    }

    @Then("^I validate Splicing Section$")
    public void iValidateSplicingSection() throws InterruptedException {
        homePageImplementation.splicingSectionValidation();
    }

    @And("^I validate Reports Section$")
    public void iValidateReportsSection() throws InterruptedException {
        homePageImplementation.reportsSectionValidation();

    }

    @And("^I validate Report Manager Section$")
    public void iValidateReportManagerSection() throws InterruptedException {
        homePageImplementation.reportManagerSectionValidation();

    }

    @Given("^I verify the Zoom tool$")
    public void iVerifyTheZoomTool() throws InterruptedException {
        homePageImplementation.zoomToolValidation();
    }

    @When("^I verify the Bell icon$")
    public void iVerifyTheBellIcon() throws InterruptedException {
        homePageImplementation.bellToolValidation();
    }

    @Then("^I verify the Settings icon$")
    public void iVerifyTheSettingsIcon() throws InterruptedException {
        homePageImplementation.settingsToolValidation();
    }

    @Then("^I verify the SDK help$")
    public void iVerifyTheSDKHelp() throws InterruptedException {
        homePageImplementation.helpToolValidation();
    }

    @Given("^I Log out$")
    public void iVerifyLogOutIcon() {
        homePageImplementation.logoutTabValidation();
    }

    @Given("^I validate the Layers Tab$")
    public void iValidateTheLayersInTab() throws InterruptedException {
        homePageImplementation.layersTabValidation();
    }

    @And("^I Validate the Base Layers Tab$")
    public void iValidateTheBaseLayersTab() throws InterruptedException, IOException {
        homePageImplementation.baseLayersValidation();
    }

    @Then("^I Validate the SpatialStorm Layers Tab$")
    public void iValidateTheSpatialStormLayersTab() throws InterruptedException {
        homePageImplementation.spatialStormLayersValidation();
    }

    @Given("^I validate the Jobs Tab$")
    public void iValidateTheJobsInTab() throws InterruptedException {
        homePageImplementation.jobsLayerValidation();
    }

    @And("^I Create Job$")
    public void iCreateJob() throws InterruptedException {
        homePageImplementation.createJob();
    }

    @Given("^I validate Details Tab$")
    public void iValidateDetailsTab() throws InterruptedException {
        homePageImplementation.detailsLayerValidation();
    }

    @Given("^I validate Search Tab$")
    public void iValidateSearchTab() throws InterruptedException {
        homePageImplementation.searchLayerValidation();
    }

    @Then("^I Validate the Job created$")
    public void iValidateTheJobCreated() throws InterruptedException {
        homePageImplementation.verifyJobCreated();
    }

    @Given("^I Enter the (.*) for the Entity$")
    public void iEnterTheIDForTheEntity(String id) throws InterruptedException {
        homePageImplementation.sendIdFromSearch(id);
    }

    @Then("^I Validate the Details layer of the Selected entity$")
    public void iValidateTheDetailsOfTheSelectedEntity() throws InterruptedException {
        homePageImplementation.validateDetailsPanel();
    }

    @When("^I validate the Title of the Entity Selected$")
    public void iValidateTheTitleOfTheEntitySelected() throws InterruptedException, IOException {
        homePageImplementation.validateTitleOfEntity();
    }

    @Then("^I navigate to Trace Report$")
    public void inavigateToTraceReport() throws InterruptedException {
        homePageImplementation.navigateToTraceReport();
    }

    @Given("^I Navigate to Splice Report$")
    public void iNavigateToSpliceReport() throws InterruptedException {
        homePageImplementation.navigateSpliceReport();
    }

    @Given("^I navigate to Trace tab and select mutiple traces$")
    public void iNavigateToTraceTabAndSelectOneOfTheTrace() throws InterruptedException {
        homePageImplementation.navigateToTrace();
    }

    @Then("^I validate the tabs under Trace$")
    public void iValidateTheTabsUnderTrace() throws InterruptedException {
        homePageImplementation.validateTraceTabs();
    }

    @And("^I Validate the Summary tab$")
    public void iValidateTheSummaryTab() throws InterruptedException {
        homePageImplementation.validateSummaryTab();
    }

    @Then("^I Validate the Schematic tab$")
    public void iValidateTheSchematicTab() throws InterruptedException {
        homePageImplementation.validateSchematicTab();
    }

    @And("^I Validate the Report tab$")
    public void iValidateTheReportTab() throws InterruptedException, IOException {
        homePageImplementation.validateReportTab();
    }

    @Then("^I Validate the Map tab$")
    public void iValidateTheMapTab() throws InterruptedException, IOException {
        homePageImplementation.validateMapTab();
    }

    @And("^I Validate the OTDR tab by passing (.*),(.*)$")
    public void iValidateTheOTDRTab(String otdr, String margin) throws InterruptedException {
        homePageImplementation.validateOTDRTab(otdr, margin);
    }


    @Given("^I navigate to Splicing$")
    public void iNavigateToSplicing() throws InterruptedException {
        homePageImplementation.navigateToSplicing();
    }

    @Then("^I navigate to Report tab and verify Splice Report$")
    public void iNavigateToReportTabAndVerifySpliceReport() throws InterruptedException {
        homePageImplementation.verifyReportsTabInSplicing();
    }

    @And("^I validate the Splice Tray Reports$")
    public void iValidateTheSpliceTrayReports() throws InterruptedException {
        homePageImplementation.validateSpliceTayReports();
    }


    @And("^I verify the Drawing Section for the selected entity$")
    public void iVerifyTheDrawingSectionForTheSelectedEntity() throws IOException, InterruptedException {
        homePageImplementation.validateDrawingForSelectedEntity();
    }

    @And("^I validate the First Splice Tray report$")
    public void iValidateTheSpliceTrayReport() throws InterruptedException {
        homePageImplementation.validateSpliceTrayReport();
    }

    @Then("^I Click on Create Report$")
    public void iClickOnCreateReport() throws InterruptedException {
        homePageImplementation.createReport();
    }

    @Then("^I create the Splice Connection Report with (.*) and verify the Report created in the Report Manager Dashboard$")
    public void SpliceConnectionReport(String FiberSpliceID) throws InterruptedException {
        homePageImplementation.createSpliceConnectionAndVerify(FiberSpliceID);
    }

    @And("^I create the Rf Power Trace Diagram Report with (.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void RfPowerTraceDiagram(String PowerSupplyID, String JOBID) throws InterruptedException {
        homePageImplementation.createRfPowerTraceDiagramAndVerify(PowerSupplyID, JOBID);
    }
    
	@And("^I create the Equipment Report with (.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void EquipmentReport(String BoundaryID, String Properties) throws InterruptedException {
        homePageImplementation.createEquipmentReportAndVerify(BoundaryID,Properties);
    }

    @And("^I create the Splice Tray Report with (.*) and verify the Report created in the Report Manager Dashboard$")
    public void SpliceTrayReport(String FiberSpliceID) throws InterruptedException {
        homePageImplementation.createSpliceTrayReportAndVerify(FiberSpliceID);
    }

    @And("^I create the Trace Report with (.*),(.*),(.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void TraceReport(String FiberCableID, String PhysicalSeq, String Channel, String JobID) throws InterruptedException {
        homePageImplementation.createTraceReportAndVerify(FiberCableID, PhysicalSeq, Channel, JobID);
    }

    @And("^I create the Trace Schematic Report with (.*),(.*),(.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void TraceSchematicReport(String FiberCableID, String PhysicalSeq, String Channel, String JobID) throws InterruptedException {
        homePageImplementation.createTraceSchematicReportAndVerify(FiberCableID, PhysicalSeq, Channel, JobID);
    }

    @Then("^I create the Trace Summary Report with (.*),(.*),(.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void TraceSummaryReport(String FiberCableID, String PhysicalSeq, String Channel, String JobID) throws InterruptedException {
        homePageImplementation.createTraceSummaryReportAndVerify(FiberCableID, PhysicalSeq, Channel, JobID);
    }

    @Then("^I create the Blown Fiber Schematic Report with (.*),(.*),(.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void BlownFiberSchematicReport(String SUPPORTTUBEID, String port, String Channel, String JobID) throws InterruptedException {
        homePageImplementation.createBlownFiberSchematicReportAndVerify(SUPPORTTUBEID, port, Channel, JobID);
    }

    @Then("^I create the Boundary Address Report with (.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void BoundaryAddressReport(String BoundaryID, String JobID) throws InterruptedException {
        homePageImplementation.createBoundaryAddressReportAndVerify(BoundaryID, JobID);
    }

    @Then("^I create the Home Passed Report with (.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void HomePassedReport(String BoundaryID, String JobID) throws InterruptedException {
        homePageImplementation.createHomePassedReportAndVerify(BoundaryID, JobID);
    }

    @Then("^I create the Class Diagram Report with (.*) and verify the Report created in the Report Manager Dashboard$")
    public void iCreateTheClassDiagramReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String Entity) throws InterruptedException {
        homePageImplementation.createClassDiagramReportandVerify(Entity);
    }
	
	@Then("^I create the Query Report with (.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void iCreateTheQueryReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String OrderByProperties,String PropertyNames) throws InterruptedException {
        homePageImplementation.createQueryReportandVerify(OrderByProperties,PropertyNames);
    }

    @Then("^I create the OTDR Report with (.*),(.*),(.*) and verify the Report created in the Report Manager Dashboard$")
    public void iCreateTheOtdrReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String PhysicalSeq, String Channel, String JobID) throws InterruptedException {
        homePageImplementation.createOtdrReportandVerify(PhysicalSeq, Channel, JobID);
    }

    @Given("^I navigate to Search tab$")
    public void iNavigateToSearchTab() throws InterruptedException {
        homePageImplementation.navigateToSearchTab();
    }

    @Then("^I Verify the Configurations of Search$")
    public void iVerifyTheConfigurationsOfSearch() throws InterruptedException {
        homePageImplementation.verifySearchConfiguration();
    }

    @Given("^I navigate to WMTS tab$")
    public void iNavigateToWMTSTab() throws InterruptedException {
        homePageImplementation.navigateToWMTS();
    }

    @Then("^I Verify the WMTS Panel$")
    public void iVerifyTheWMTSPanel() throws InterruptedException {
        homePageImplementation.verifyWMTSPanel();
    }

    @And("^I Validate teh Open Panel of WMTS$")
    public void iValidateTehOpenPanelOfWMTS() throws InterruptedException {
        homePageImplementation.validateWMTSOpenPanel();
    }

    @Then("^I Validate the Import Panel of WMTS$")
    public void iValidateTheImportPanelOfWMTS() throws InterruptedException {
        homePageImplementation.validateWMTSImportPanel();
    }

    @And("^I validate the WMTS features$")
    public void iValidateTheWMTSFeatures() throws InterruptedException {
        homePageImplementation.validateWMTSBasicfeatures();
    }

    @And("^I validate the Trace Panel and enter (.*),(.*) details$")
    public void validateTheTracePanelAndEnterTheDetailsIDPhysicalSeqChannel(String PhysicalSeq, String Channel) throws InterruptedException {
        homePageImplementation.validateTraceReport(PhysicalSeq, Channel);
    }

    @And("^I validate the Splice Report Panel$")
    public void iValidateTheSpliceReportPanel() throws InterruptedException {
        homePageImplementation.validateSpliceReportPanel();
    }

    @Then("^I Navigate to Equipment Report$")
    public void iNavigateToEquipmentReport() throws InterruptedException {
        homePageImplementation.navigateEquipmentReport();
    }

    @And("^I validate the Equipment Report Panel$")
    public void iValidateTheEquipmentReportPanel() throws InterruptedException {
        homePageImplementation.validateEquipmentReport();

    }

    @Then("^I Navigate to Address List Report$")
    public void iNavigateToAddressListReport() throws InterruptedException {
        homePageImplementation.navigateAddressListReport();
    }

    @And("^I validate the Address List Report Panel$")
    public void iValidateTheAdressListReportPanel() throws InterruptedException {
        homePageImplementation.validateAddressListReport();
    }

    @Given("^I Navigate to Home Passed Report$")
    public void iNavigateToHomePassedReport() throws InterruptedException {
        homePageImplementation.navigateHomePassedReport();
    }

    @And("^I validate the Home Passed Report Panel$")
    public void iValidateTheHoListReportPanel() throws InterruptedException {
        homePageImplementation.validateHomePassedReport();
    }


    @Then("^I Navigate to Rf Power Report$")
    public void iNavigateToRfPowerReport() throws InterruptedException {
        homePageImplementation.navigateToRfpower();
    }

    @And("^I Validate the RF Power Report$")
    public void iValidateTheRFPowerReport() throws InterruptedException {
        homePageImplementation.validateRfPowerReport();
    }

    @Given("^I Navigate to Rf Power Trace Report$")
    public void iNavigateToRfPowerTraceReport() throws InterruptedException {
        homePageImplementation.navigateToRfPowerTraceReport();
    }

    @Then("^I Validate the RF Power Trace Report$")
    public void iValidateTheRFPowerTraceReport() throws InterruptedException {
        homePageImplementation.validateRfPowerTraceReport();
    }

    @Given("^I Click on the Pencil$")
    public void iClickOnThePencil() {
        homePageImplementation.clickRedlinePencil();
    }

    @Given("^I Verify the Red line Pencil is displayed and clickable$")
    public void iVerifyTheRedLinePencilIsDisplayedAndClickable() throws InterruptedException {
        homePageImplementation.validateRedlinePencil();
    }

    @Then("^I Verify the Red line Chip is displayed at te bottom of page$")
    public void iVerifyTheRedLineChipIsDisplayedAtTeBottomOfPage() {
        homePageImplementation.validateRedlineChipDisplayed();
    }

    @And("^I Zoom in to the Required zoom level$")
    public void iZoomInToTheRequiredZoomLevel() throws InterruptedException {
        homePageImplementation.zoomToArea();
    }

    @Given("^I Click on the Alphabet Button$")
    public void iClickOnTheAlphabetButton() throws InterruptedException {
        homePageImplementation.validateAlphabetButton();
    }

    @Then("^I Add a Text in the selected Map area$")
    public void iAddATextInTheSelectedMapArea() throws InterruptedException {
        homePageImplementation.enterTextInMapArea();
    }

    @When("^I Click on the Shapes Button$")
    public void iClickOnTheShapesButton() throws InterruptedException {
        homePageImplementation.clickRedlineShapesButton();
    }

    @And("^I Validate the Shapes listed$")
    public void iValidateTheShapesListed() throws InterruptedException {
        homePageImplementation.validateShapesList();
    }

    @Then("^I Add the Shapes in the Selected Area$")
    public void iAddTheShapesInTheSelectedArea() throws InterruptedException {
        homePageImplementation.addShapesMapArea();
    }


    @Then("^I Click on the Red line Polygon$")
    public void iClickOnTheRedLinePolygon() throws Exception {
        homePageImplementation.clickRedlinePolygon();
    }

    @And("^I Add a Polygon in Map area$")
    public void iAddAPolygonInMapArea() throws Exception {
        homePageImplementation.drawAPolygonMapArea();
    }

    @When("^I Click on the Draw Line Button$")
    public void iClickOnTheDrawLineButton() throws InterruptedException {
        homePageImplementation.clickDrawLine();
    }

    @Then("^I Add a line in Map Area$")
    public void iAddALineInMapArea() throws InterruptedException {
        homePageImplementation.drawLineMapArea();
    }

    @And("^I Add a line Arrow in Map Area$")
    public void iAddALineArrowInMapArea() throws Exception {
        homePageImplementation.drawLineArrowMapArea();
    }

    @And("^I Add a line Arrow Double in Map Area$")
    public void iAddALineArrowDoubleInMapArea() throws InterruptedException {
        homePageImplementation.draLineArrowDoubleMapArea();
    }

    @Then("^I Navigate to RF Levels Report$")
    public void iNavigateToRFLevelsReport() throws InterruptedException {
        homePageImplementation.navigateTORfLevelsReport();
    }

    @And("^I Validate the RF Levels Report$")
    public void iValidateTheRFLevelsReport() throws InterruptedException {
        homePageImplementation.validateRfLevelsReport();
    }

    @Given("^I Click on the Trash Button to Un Save Red line items$")
    public void iClickOnTheTrashButtonToUnSaveRedLineItems() throws InterruptedException {
        homePageImplementation.clickTrashButton();
    }

    @Then("^I verify the Dialog opened$")
    public void iVerifyTheDialogOpened() throws InterruptedException{
        homePageImplementation.verifyDialogOpened();
    }

    @Given("^I Verify the Ruler is displayed and clickable$")
    public void iVerifyTheRulerIsDisplayedAndClickable() throws InterruptedException {
        homePageImplementation.verifyRulerDisplayed();
    }

    @And("^I Verify the Distance option of Ruler$")
    public void iVerifyTheDistanceOptionOfRuler() throws InterruptedException {
        homePageImplementation.verifyDistanceOption();
    }

    @Then("^I Verify the Area option of Red line Ruler$")
    public void iVerifyTheAreaOptionOfRedLineRuler() throws InterruptedException {
        homePageImplementation.verifyAreaOption();
    }

    @Given("^I Verify the Go to Location is displayed and clickable$")
    public void iVerifyTheGoToLocationIsDisplayedAndClickable() {
        homePageImplementation.verifyGoToLocationDisplayedAndClick();
    }

    @Then("^I Verify the Pop up enables for Go To Location$")
    public void iVerifyThePopUpEnablesForGoToLocation() throws InterruptedException {
        homePageImplementation.verifyPopUpGoToLocation();
    }

    @Given("^I verify the Share is displayed and clickable$")
    public void iVerifyTheShareIsDisplayedAndClickable() throws InterruptedException {
        homePageImplementation.shareDisplayedClick();
    }

    @When("^I Verify the Copy Lat & Long as URL$")
    public void iVerifyTheCopyLatLongAsURL() throws InterruptedException {
        homePageImplementation.verifyLatLongCopy();
    }

    @Then("^I Verify the Copy Features as URL$")
    public void iVerifyTheCopyFeaturesAsURL() throws InterruptedException {
        homePageImplementation.verifyFeatureCopy();
    }

    @Given("^I Validate the Print is displayed and Clickable$")
    public void iValidateThePrintIsDisplayedAndClickable() {
        homePageImplementation.printDisplayedClick();
    }

    @Given("^I Validate the Clear control option$")
    public void iValidateTheClearControlOption() throws InterruptedException {
        homePageImplementation.verifyClearControl();
    }

    @Given("^I validate the Zoom to Location$")
    public void iValidateTheZoomToLocation() throws InterruptedException {
        homePageImplementation.verifyZoomToLocation();
    }

    @Given("^I Validate the Previous View$")
    public void iValidateThePreviousView() throws InterruptedException, IOException {
        homePageImplementation.validatePreviousView();
    }

    @Then("^I Validate the Next View$")
    public void iValidateTheNextView() throws InterruptedException, IOException {
        homePageImplementation.validateNextView();
    }
	
    @Then("^I Click on the reports dropdown$")
    public void iClickOnTheReportsDropdown() {
        homePageImplementation.clickReportsDropdown();
		
    }
	
	 @Given("^I Click on SpatialFilter Button$")
    public void iClickOnSpatialFilterButton() throws InterruptedException {
        homePageImplementation.clickSpatialFilter();
    }

    @Given("^I Click on SpatialFilter Button for the second time$")
    public void iClickOnSpatialFilterButtonSecond() throws InterruptedException {
        homePageImplementation.clickSpatialFilterSecond();
    }
	
        @Then("^I Validate the Spatial Filter for Current View$")
    public void iValidateTheSpatialFilterForCurrentView() throws InterruptedException {
        homePageImplementation.SpatialFilterForCurrentView();
    }

    @Then("^I Validate the Spatial Filter for Draw Polygon Selection$")
    public void iValidateTheSpatialFilterForDrawPolygonSelection() throws InterruptedException {
		Thread.sleep(2000);
        homePageImplementation.clickSpatialFilter();
        homePageImplementation.clickSpatialFilter();
		Thread.sleep(2000);
        homePageImplementation.SpatialFilterForPolygon();
    }

    @Then("^I Validate the Spatial Filter for Current Selection$")
    public void iValidateTheSpatialFilterForCurrentSelection() throws InterruptedException {
        homePageImplementation.clickSpatialFilter();
		Thread.sleep(2000);
        homePageImplementation.SpatialFilterForCurrentSelection();
    }
    
	
	 @Then("^I Search for the (.*) in the Search Box and select the job$")
    public void iSearchForTheJobInTheSearchBoxAndSelectTheJob(String JOB) throws InterruptedException {
        homePageImplementation.searchJob(JOB);
    }

    @And("^I Click on the Master Circuit Button$")
    public void iClickOnTheMasterCircuitButton() throws InterruptedException {
        homePageImplementation.clickMasterCircuitButton();
    }

    @Then("^I Validate the Master Circuit Panel and Create a Master Circuit$")
    public void iValidateTheMasterCircuitPanelAndCreateAMasterCircuit() throws InterruptedException {
        homePageImplementation.createMasterCircuit();
    }

	
	 @Then("^I Select the Fiber Splice Node$")
    public void iSelectTheFiberSpliceNode() throws InterruptedException {
        homePageImplementation.selectFiberSplice();
    }
	
	 @And("^I Click on the BookMark$")
    public void iClickOnTheBookMark() throws InterruptedException {
        homePageImplementation.clickBookMark();
    }

    @Then("^I Add the Selected View as the New Book Mark$")
    public void iAddTheSelectedViewAsTheNewBookMark() throws InterruptedException {
        homePageImplementation.validateBookMark();
    }


    @And("^I Validate the Book Mark Tab (.*)$")
    public void iValidateTheBookMarkTab(String BOOKMARK) throws InterruptedException {
        homePageImplementation.validateBookMarkTab(BOOKMARK);
    }
	
	 @Then("^I validate the Title of the Entity Selected for OSM and Google Place$")
    public void iValidateTheTitleOfTheEntitySelectedForOSM() throws IOException, InterruptedException {
        homePageImplementation.validateTitleOfEntityOSM();
    }
	
	@Given("^I Navigate to Find table and search for a class (.*)$")
    public void iNavigateToFindTableAndSearchForAClassCLASS(String Class) throws InterruptedException {
        homePageImplementation.navigateToFindAndSearch(Class);
    }
	
	
	 @Then("^I Validate the Menu items for the Find Table$")
    public void iValidateTheMenuItemsForTheFindTable() throws IOException,InterruptedException{
        homePageImplementation.validateMenuItems();
    }
	
	    @And("^I Validate the Circuit Reserve Tag for the Selected Cable$")
    public void iValidateTheCircuitReserveTagForTheSelectedCable() throws IOException, InterruptedException {
        homePageImplementation.validateCircuitReserveTag();
    }

    @Then("^I Validate the Edit for Circuit Reserve Tag$")
    public void iValidateTheEditForCircuitReserveTag() throws InterruptedException {
        homePageImplementation.validateEditCircuitReserveTag();
    }
	
	  @Then("^I Create the XYZ Layer$")
    public void iCreateTheXYZLayer() throws InterruptedException {
        homePageImplementation.createXyzLayer();
    }

    @And("^I Delete the XYZ Layer$")
    public void iDeleteTheXYZLayer() throws InterruptedException {
        homePageImplementation.deleteXyzLayer();
    }
	
	@Then("^I take the screenshot for the Map$")
    public void iTakeTheScreenshotForTheMap() throws IOException, InterruptedException {
        homePageImplementation.takeSearchUrlScreenshot();
    }
	
	@Given("^I Navigate to Theming$")
    public void iNavigateToTheming() throws InterruptedException {
        homePageImplementation.NavigateToTheming();
    }

    @Then("^I Click on Add Theme$")
    public void iClickOnAddTheme() throws InterruptedException {
        homePageImplementation.AddTheme();
    }

    @And("^I enter the details for Categorized$")
    public void iEnterTheDetailsForCategorized() throws InterruptedException {
        homePageImplementation.DetailsForCategorized();

    }

    @Then("^I Save the Theme$")
    public void iSaveTheTheme() throws InterruptedException {
        homePageImplementation.SaveTheme();

    }

    @And("^I Navigate to Graduated$")
    public void iNavigateToGraduated() throws InterruptedException {
        homePageImplementation.NavigateToGraduated();
    }

    @Then("^I enter the details for Graduated$")
    public void iEnterTheDetailsForGraduated() throws InterruptedException {
        homePageImplementation.DetailsGraduated();
    }

    @And("^I Click on the Color Bar to select a Color$")
    public void iClickOnTheColorBar() throws InterruptedException {
        homePageImplementation.ClickColorBar();
    }

    @And("^I Navigate to Graduated Range$")
    public void iNavigateToGraduatedRange() throws InterruptedException {
        homePageImplementation.NavigateToGraduatedRange();
    }

    @Then("^I enter the details for Graduated Range$")
    public void iEnterDetailsForGraduatedRange() throws InterruptedException {
        homePageImplementation.DetailsForGraduatedRange();
    }

    @And("^I Navigate to Rules$")
    public void iNavigateToRules() throws InterruptedException {
        homePageImplementation.NavigateToRules();
    }

    @Then("^I enter the details for Rules$")
    public void iEnterTheDetailsForRules() throws InterruptedException {
        homePageImplementation.DetailsForRules();
    }

    @And("^I Click on Add Rule$")
    public void iClickOnAddRule() throws InterruptedException {
        homePageImplementation.ClickAddRule();
    }

    @And("^I Add a Rule$")
    public void iAddARule() throws InterruptedException {
        homePageImplementation.AddRule();
    }

    @And("I Add Min Max and Steps for Graduated Range")
    public void addMinMaxStepsForGraduatedRange() throws InterruptedException {
        homePageImplementation.AddMinMax();
    }
	
	 @Then("^I navigate to Trace tab and select one of the trace$")
    public void iNavigateToTraceTab() throws InterruptedException {
        homePageImplementation.navigateToTraceTab();
    }
	
	@Then("^I Create the KML Layer (.*)$")
    public void iCreateTheKMLLayer(String path) throws InterruptedException, AWTException {
        homePageImplementation.createKmlLayer(path);
    }

    @And("^I Delete the KML Layer$")
    public void iDeleteTheKMLLayer() throws InterruptedException {
        homePageImplementation.deleteKmlLayer();
    }


    @Then("^I Create the KMZ Layer (.*)$")
    public void iCreateTheKMZLayer(String path) throws InterruptedException, AWTException {
        homePageImplementation.createKmzLayer(path);
    }

    @And("^I Delete the KMZ Layer$")
    public void iDeleteTheKMZLayer() throws InterruptedException {
        homePageImplementation.deleteKmzLayer();
    }
	
	@Given("^I navigate to WMTS tab in Postgres DB$")
    public void iNavigateToWMTSTabPostgresDb() throws InterruptedException {
        homePageImplementation.navigateToWMTSPostgresDb();
    }
	
	  @Given("^I navigate to Search tab in Postgres DB$")
    public void iNavigateToSearchTabPostgresDb() throws InterruptedException {
        homePageImplementation.navigateToSearchTabPostgresDb();
    }
}
