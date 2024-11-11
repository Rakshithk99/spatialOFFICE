package stepPage.HomePage;

import common.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest {
    public HomePage() throws Exception {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"#header\"]/span[1]/img")
    public WebElement SPATIAL_LOGO;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[2]")
    public WebElement MAP;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[3]")
    public WebElement DRAWING;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[5]")
    public WebElement TRACE;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[7]")
    public WebElement RF_POWER;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[8]")
    public WebElement RF_LEVELS;

    @FindBy(xpath = "//*[@id=\"#header\"]/span[2]")
    public WebElement TRACE_DASHBOARD_TEXT;

    @FindBy(xpath = "//*[@id=\"#header\"]/span[2]")
    public WebElement SEARCH_DASHBOARD_TEXT;

    @FindBy(xpath = "//*[@id=\"circuitListPanel\"]/div")
    public WebElement TRACE_DASHBOARD_LIST_PANEL;

    @FindBy(xpath = "//*[@id=\"#header\"]/span[2]/span[1]")
    public WebElement SPLICING_DASHBOARD_TEXT;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[10]")
    public WebElement SPLICING;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[12]")
    public WebElement REPORTS;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[13]")
    public WebElement REPORT_MANAGER_DASHBOARD;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]//sncr-report-dialog//sncr-form//div[2]/button//span[1]")
    public WebElement REPORT_POPUP_CANCEL;

    @FindBy(xpath = "//*[@id=\"#header\"]/span[2]/span[1]")
    public WebElement REPORT_MANAGER_DASHBOARD_TEXT;

    @FindBy(xpath = "//*[@id=\"mat-dialog-20\"]/sncr-settings//button[1]")
    public WebElement SETTINGS_POPUP_CLOSE;

    @FindBy(xpath = "//*[@id=\"#header\"]/a[1]")
    public WebElement ZOOM_TOOL;

    @FindBy(xpath = "//*[@id=\"#header\"]/a[2]")
    public WebElement BELL_ICON;

    @FindBy(xpath = "//*[@id=\"#header\"]/a[3]")
    public WebElement SETTINGS_ICON;

    @FindBy(xpath = "//*[@id=\"settings.form-checkbox-MapSettings_DarkBackgroundColor-input\"]")
    public WebElement DARK_BACKGROUND_SETTINGS;

    @FindBy(xpath = "//sncr-settings//sncr-form//div[2]/button[2]")
    public WebElement SETTINGS_SAVE_ICON;

    @FindBy(xpath = "//*[@id=\"#header\"]/a[4]")
    public WebElement HELP_ICON;

    @FindBy(xpath = "//*[@id=\"topic\"]")
    public WebElement HELP_TOPIC;

    @FindBy(xpath = "//*[@id=\"#header\"]/a[6]")
    public WebElement LOGOUT_ICON;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-tab-label\")][1]")
    public WebElement LAYERS_TAB;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-tab-label\")][2]")
    public WebElement JOBS_TAB;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-tab-label\")][3]")
    public WebElement DETAILS_TAB;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-tab-label\")][4]")
    public WebElement SEARCH_TAB;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-tab-label\")][5]")
    public WebElement BOOKMARK_TAB;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-mdc-dialog\")]//sncr-error-dialog//button")
    public WebElement DRAWINGS_ERROR_TAB;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//button")
    public WebElement REPORTS_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//li[1]/a")
    public WebElement TRACE_REPORT;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//li[2]/a")
    public WebElement SPLICE_REPORT;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//li[3]/a")
    public WebElement EQUIPMENT_REPORT;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//li[4]/a")
    public WebElement ADDRESS_LIST_REPORT;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]//li[12]//li[5]/a")
    public WebElement HOME_PASSED_REPORT;

    @FindBy(xpath = "//mat-expansion-panel[1]//mat-expansion-panel-header/span[2]")
    public WebElement BASE_LAYERS_DROPDOWN;

    @FindBy(xpath = "//mat-expansion-panel[2]/mat-expansion-panel-header/span[2]")
    public WebElement SPATIALSTORM_LAYERS_DROPDOWN;

    @FindBy(xpath = "//mat-expansion-panel[3]//mat-expansion-panel-header//span[2]")
    public WebElement LAYERS_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"search-form-input-search\"]")
    public WebElement SEARCH_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-search//sncr-form-button/button")
    public WebElement SEARCH_ICON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//mat-toolbar//button")
    public WebElement JOBS_CREATION_PLUS_ICON;

    @FindBy(xpath = "//*[@id=\"job.form-select-TypeCode\"]/div")
    public WebElement JOB_TYPE_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][1]")
    public WebElement JOB_TYPE_FIBER_INFRASTRUCTURE;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement JOB_TYPE_SAVE;

    @FindBy(xpath = "//mat-dialog-container")
    public WebElement CREATE_JOB_DIALOG;

    @FindBy(xpath = "//*[@id=\"editpanel.form-input-Name\"]")
    public WebElement CREATE_JOB_NAME;

    @FindBy(xpath = "//*[@id=\"editpanel.form-input-Description\"]")
    public WebElement CREATE_JOB_DESCRIPTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//sncr-form-templated-button[2]")
    public WebElement CREATE_JOB_SAVE;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-3-3\"]//sncr-search-input//div/button")
    public WebElement SEARCH_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"mat-checkbox-120\"]/label")
    public WebElement SELECT_ALL_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-list-item[1]/mat-list-item")
    public WebElement JOB_FIRST_ITEM;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-list-item[2]/mat-list-item")
    public WebElement JOB_SECOND_ITEM;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//mat-toolbar-row/span")
    public WebElement JOB_TEXT_TOOLBAR;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-chip-list\")]//mat-chip")
    public WebElement JOB_TEXT_CHIP;

    @FindBy(xpath = "//*[starts-with(@id,\"map\")]")
    public WebElement MAP_AREA;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//mat-toolbar-row//button[2]")
    public WebElement JOBS_BACK_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"cdk-accordion-child\")]//a")
    public WebElement ENTITY_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//mat-toolbar-row[1]/span")
    public WebElement ENTITY_TITLE_DETAILS_PANEL;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-expansion-panel-header\")]/span[2]")
    public WebElement CORE_ATTRIBUTES_EXPANSION_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-details-category")
    public WebElement DETAILS_CATEGORY_TITLES;

    @FindBy(xpath = "//*[@id=\"report.form-select-type\"]//span//span")
    public WebElement SPLICE_CONNECTIONS_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-select-fileFormat\"]")
    public WebElement SPLICE_CONNECTION_DOCUMENT_FORMAT;

    @FindBy(xpath = "//*[@id=\"report.form-select-entity-EntityValue\"]")
    public WebElement SPLICE_CONNECTION_ENTITY_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-entity-EntityId\"]")
    public WebElement FIBER_SPLICE_ID;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement SPLICE_CONNECTION_SUBMIT;

    @FindBy(xpath = "//*[@id=\"resp-iframe\"]")
    public WebElement SPLICE_REPORT_IFRAME;

    @FindBy(xpath = "//sncr-search//div/button/span/mat-icon")
    public WebElement SEARCH_SMALL_DROPDOWN;

    @FindBy(xpath = "//div[2]//mat-checkbox[6]/label/div")
    public WebElement FIBER_CABLE_CHECK_BOX;

    @FindBy(xpath = "//sncr-splice-panel//mat-tab-group/mat-tab-header//div[3]")
    public WebElement SPLICE_TRAY_REPORT_1;

    @FindBy(xpath = "//*[@id=\"circuitListPanel\"]//tr[3]")
    public WebElement TRACE_ITEM;

    @FindBy(xpath = "//div//sncr-trace//mat-tab-header/div/div/div/div[1]")
    public WebElement TRACE_SUMMARY_TAB;

    @FindBy(xpath = "//div//sncr-trace//mat-tab-header/div/div/div/div[2]")
    public WebElement TRACE_SCHEMATIC_TAB;

    @FindBy(xpath = "//div//sncr-trace//mat-tab-header/div/div/div/div[3]")
    public WebElement TRACE_REPORT_TAB;

    @FindBy(xpath = "//div//sncr-trace//mat-tab-header/div/div/div/div[4]")
    public WebElement TRACE_MAP_TAB;

    @FindBy(xpath = "//div//sncr-trace//mat-tab-header/div/div/div/div[5]")
    public WebElement TRACE_OTDR_TAB;

    @FindBy(xpath = "//*[starts-with(@id,\"Table\")]")
    public WebElement TRACE_SUMMARY_REPORT;

    @FindBy(xpath = "//*[starts-with(@id,\"resp-iframe\")]")
    public WebElement REPORT_IFRAME;

    @FindBy(xpath = "//*[starts-with(@id,\"resp-iframe\")]")
    public WebElement TRACE_REPORT_AREA;

    @FindBy(xpath = "//*[starts-with(@id,\"map\")]")
    public WebElement MAP_TAB_AREA;


    @FindBy(xpath = "//*[@id=\"trace-otdr.form-input-distance\"]")
    public WebElement OTDR_VALUE_BOX;

    @FindBy(xpath = "//*[@id=\"trace-otdr.form-select-direction\"]")
    public WebElement OTDR_START_VALUE_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"trace-otdr.form-input-margin\"]")
    public WebElement OTDR_MARGIN_VALUE_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][3]")
    public WebElement OTDR_FROM_END_SELECTION_VALUE;

    @FindBy(xpath = "//*[@id=\"otdr-button\"]")
    public WebElement OTDR_GO_BUTTON;

    @FindBy(xpath = "//*[@id=\"splicing-form-select-leftCircuitOwner\"]//div[1]/span")
    public WebElement FROM_CIRCUIT_OWNER;

    @FindBy(xpath = "//*[@id=\"splicing-form-select-rightCircuitOwner\"]//div[1]/span")
    public WebElement TO_CIRCUIT_OWNER;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][1]")
    public WebElement FIRST_SEGMENT_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][2]")
    public WebElement SECOND_SEGMENT_SELECTION;

    @FindBy(xpath = "//*[@id=\"leftCircuitsListPanel\"]//tbody/tr[1]")
    public WebElement FIRST_ITEM_SELECTION;

    @FindBy(xpath = "//mat-toolbar-row//button[1]")
    public WebElement FIBRE_USAGE_REPORT;

    @FindBy(xpath = "//sncr-splice-panel//mat-tab-group/mat-tab-header//div[2]")
    public WebElement SPLICING_REPORT_TAB;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-splice-tray//tbody")
    public WebElement SPLICE_TRAY_REPORT;

    @FindBy(xpath = "//*[@id=\"float-download-filter\"]")
    public WebElement DOWNLOAD_BUTTON;

    @FindBy(xpath = "//*[@id=\"float-download\"]")
    public WebElement DOWNLOAD_POWER_TRACE_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-form-templated-button[4]/button")
    public WebElement CONTAINED_MDU_IDM_BUILDING_BUTTON;

    @FindBy(xpath = "//sncr-report-manager//mat-toolbar/button")
    public WebElement CREATE_REPORT;

    @FindBy(xpath = " //*[@id=\"report.form-select-type\"]")
    public WebElement SELECT_TYPE;

    @FindBy(xpath = "//mat-option[13]")
    public WebElement SPLICE_CONNECTIONS_DASHBOARD;

    @FindBy(xpath = "//mat-option[1]")
    public WebElement RF_POWER_TRACE_DIAGRAM_DASHBOARD;

    @FindBy(xpath = "//mat-option[2]")
    public WebElement BLOWN_FIBER_SCHEMATIC_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[3]")
    public WebElement BOUNDARY_ADDRESS_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[6]")
    public WebElement HOME_PASSED_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[4]")
    public WebElement CLASS_DIAGRAM_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[5]")
    public WebElement EQUIPMENT_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[9]")
    public WebElement SPLICE_TRAY_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[10]")
    public WebElement TRACE_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[11]")
    public WebElement TRACE_SCHEMATIC_DASHBOARD;

    @FindBy(xpath = "//mat-option[12]")
    public WebElement TRACE_SUMMARY_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[8]")
    public WebElement QUERY_REPORT_DASHBOARD;

    @FindBy(xpath = "//mat-option[7]")
    public WebElement OTDR_REPORT_DASHBOARD;

    @FindBy(xpath = "//*[@id=\"report.form-input-entity-EntityId\"]")
    public WebElement FIBER_SPLICE_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-cls\"]")
    public WebElement CLASS_DIAGRAM_INPUT_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-id-EntityId\"]")
    public WebElement RF_POWER_SUPPLY_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-seq\"]")
    public WebElement PHYSICAL_SEQ_NUMBER_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-channel\"]")
    public WebElement CHANNEL_NUMBER_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-jobid-EntityTitle\"]")
    public WebElement JOB_ID_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-select-polygon-GeometryValue\"]")
    public WebElement POLYGON_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"report.form-input-polygon-Geometry\"]")
    public WebElement POLYGON_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-properties\"]")
    public WebElement PROPERTIES_BOX;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[19]")
    public WebElement SEARCH;

    @FindBy(xpath = "/html/body//sncr-search-configuration")
    public WebElement SEARCH_PANEL;

    @FindBy(xpath = "//sncr-search-configuration//mat-toolbar/button[1]")
    public WebElement SEARCH_DROPDOWN_CONFIG;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[20]")
    public WebElement WMTS;

    @FindBy(xpath = "//as-split-area[1]/mat-toolbar/button[2]")
    public WebElement WMTS_OPEN_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-select-val\")]")
    public WebElement WMTS_VIEW_PROFILE;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-option\")][1]")
    public WebElement WMTS_PROFILE_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement WMTS_OPEN_SELECTION;

    @FindBy(xpath = "//sncr-wmts-configuration//sncr-wmts-layers//div[1]/mat-tree")
    public WebElement WMTS_LAYERS_List;

    @FindBy(xpath = "//as-split-area[1]/mat-toolbar/button[4]")
    public WebElement WMTS_IMPORT_BUTTON;

    @FindBy(xpath = "//*[@id=\"wmts-configuration-import.dialog.form-select-viewProfile\"]")
    public WebElement WMTS_VIEW_PROFILE_IMPORT;

    @FindBy(xpath = "//*[@id=\"wmts-configuration-import.dialog.form-select-styleMode\"]")
    public WebElement WMTS_CAD_IMPORT;

    @FindBy(xpath = "//*[@id=\"wmts-configuration-import.dialog.form-checkbox-isDefault\"]")
    public WebElement WMTS_DEFAULT_VIEW_PROFILE_IMPORT;

    @FindBy(xpath = "//*[@id=\"wmts-configuration-import.dialog.form-checkbox-activeOnly\"]")
    public WebElement WMTS_ACTIVE_ONLY_IMPORT;

    @FindBy(xpath = "//*[@id=\"wmts-configuration-import.dialog.form-checkbox-hideTypeLayer\"]")
    public WebElement WMTS_HIDE_TYPE_IMPORT;

    @FindBy(xpath = "//sncr-wmts-configuration-import-viewprofile//div[2]/button")
    public WebElement WMTS_CANEL_IMPORT_BUTTON;

    @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[15]")
    public WebElement MANAGER;

    @FindBy(xpath = "//sncr-cache-manager/mat-toolbar/button[1]")
    public WebElement MANAGER_ADD_CACHE;

    @FindBy(xpath = "//*[@id=\"disconnected-download.dialog.form-input-name\"]")
    public WebElement NAME_CACHE_MANAGER;

    @FindBy(xpath = "//sncr-disconnected-download//div[2]/button[1]")
    public WebElement CANCEL_CACHE_MANAGER;

    @FindBy(xpath = "//*[@id=\"cache-manager.form-input-search\"]")
    public WebElement SEARCH_CACHE;

    @FindBy(xpath = "//sncr-disconnected-download/sncr-form/form")
    public WebElement DOWNLOAD_CACHE_DIALOG;

    @FindBy(xpath = "//mat-dialog-container")
    public WebElement REPORT_PANEL;

    @FindBy(xpath = "//mat-drawer-container//mat-drawer//div")
    public WebElement SCROLL_BAR;

    @FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-3\"]//span[1]//mat-panel-title")
    public WebElement LAYERS;

    @FindBy(xpath = "//*[@id=\"Diagram6\"]")
    public WebElement RF_POWER_TRACE_REPORT;

    @FindBy(xpath = "//sncr-rf-power//as-split-area[2]//div/div[2]")
    public WebElement RF_POWER_TRACE;

    @FindBy(xpath = "//*[@class=\"fas fa-pencil\"]")
    public WebElement REDLINE_PENCIL;

    @FindBy(xpath = "//*[@class=\"ol-zoom-in\"]")
    public WebElement ZOOM_IN;

    @FindBy(xpath = "//*[@class=\"ol-zoom-out\"]")
    public WebElement ZOOM_OUT;

    @FindBy(xpath = "//*[@class=\"ol-unselectable ol-control\"]")
    public WebElement MENUBAR;

    @FindBy(xpath = "//*[@class=\"fas fa-ruler-combined\"]")
    public WebElement RULER;

    @FindBy(xpath = "//sncr-submenu/div/mat-button-toggle-group/mat-button-toggle[1]/button/span/mat-icon")
    public WebElement MEASURE_DISTANCE_LINE;

    //mat-button-toggle-group/mat-button-toggle[1]

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[2]")
    public WebElement MEASURE_AREA_DISTANCE_POLYGON;

    @FindBy(xpath = "//mat-dialog-container")
    public WebElement DIALOG_CONTAINER;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]/sncr-map-measure/button/span[1]")
    public WebElement DIALOG_CLOSE_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button")
    public WebElement DIALOG_OK_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-search-location\"]")
    public WebElement SEARCH_LOCATION;

    @FindBy(xpath = "//*[@id=\"location.form-select-projection\"]")
    public WebElement COORDINATE_SYSTEM_SELECT;

    @FindBy(xpath = "//*[@id=\"location.form-input-coordLL\"]")
    public WebElement LAT_LONG_SELECT;

    @FindBy(xpath = "//*[@id=\"location.form-select-scale\"]")
    public WebElement ZOOM_SELECT;

    @FindBy(xpath = "//*[@class=\"mat-focus-indicator close-button mat-button mat-button-base\"]")
    public WebElement SEARCH_LOCATION_DIALOG_CLOSE_BUTTON;


    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//sncr-map-center-location//div[2]/button")
    public WebElement GO_TO_LOCATION_CLOSE_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-share-alt\"]")
    public WebElement COPY_URL;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[1]")
    public WebElement COPY_LAT_LONG_LINK_BUTTON;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[2]")
    public WebElement COPY_FEATURE_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-times\"]")
    public WebElement CLEAR_CONTROLS;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[1]")
    public WebElement CLEAR_CURRENT_SELECTION;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[2]")
    public WebElement CLEAR_DROPPED_PINS;

    @FindBy(xpath = "//*[@class=\"fas fa-location-arrow\"]")
    public WebElement ZOOM_TO_LOCATION_ARROW;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[1]")
    public WebElement ZOOM_USER_SELECTION;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[2]")
    public WebElement ZOOM_KEYMAP;

    @FindBy(xpath = "//*[@class=\"fas fa-print\"]")
    public WebElement PRINT_MAP;

    @FindBy(xpath = "//*[@class=\"fas fa-chevron-left\"]")
    public WebElement CHEVRON_LEFT;

    @FindBy(xpath = "//*[@class=\"fas fa-chevron-right\"]")
    public WebElement CHEVRON_RIGHT;

    @FindBy(xpath = "//*[@class=\"far fa-square\"]")
    public WebElement DISCONNECTED_MODE;

    @FindBy(xpath = "//*[@class=\"fas fa-font\"]")
    public WebElement REDLINE_ALPHABET_FONT_BUTTON;

    @FindBy(xpath = "//*[@id=\"text-capture-popup-finish\"]/span[1]/mat-icon")
    public WebElement REDLINE_TEXT_SUBMIT;

    @FindBy(xpath = "//*[@class=\"fas fa-draw-polygon\"]")
    public WebElement REDLINE_POLYGON_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-arrows-alt-h\"]")
    public WebElement REDLINE_ARROWS_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-shapes\"]")
    public WebElement REDLINE_SHAPES_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-save\"]")
    public WebElement REDLINE_SAVE_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-trash\"]")
    public WebElement REDLINE_TRASH_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-undo\"]")
    public WebElement REDLINE_UNDO_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-times-circle\"]")
    public WebElement REDLINE_CIRCLE_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-chip-list\")]/div/div/mat-chip")
    public WebElement REDLINE_CHIP_CREATED;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-input\")][1]")
    public WebElement TEXT_AREA;

    @FindBy(xpath = "//mat-button-toggle[1]//button")
    public WebElement AMP_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[2]//button")
    public WebElement ANCHOR_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[5]//button")
    public WebElement CIRCLEFILLED_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[7]//button")
    public WebElement HEXAGON_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[9]//button")
    public WebElement SPLICE_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[10]//button")
    public WebElement SQUARE_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[13]//button")
    public WebElement STARFILLED_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle[14]//button")
    public WebElement TRIANGLE_SHAPE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[1]")
    public WebElement REDLINE_DRAW_LINE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[2]")
    public WebElement REDLINE_ARROWS_LINE_BUTTON;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[3]")
    public WebElement REDLINE_DOUBLE_ARROWS_LINE_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]//sncr-confirm-dialog//sncr-form-button[1]")
    public WebElement REDLINE_DIALOG_YES_BUTTON;

    @FindBy(xpath = "//*[@class=\"fas fa-globe\"]")
    public WebElement GEOPROCESSING_ICON;

    @FindBy(xpath = "//mat-button-toggle[1]")
    public WebElement GEOPROCESSING_BUFFER;

    @FindBy(xpath = "//mat-button-toggle[2]")
    public WebElement GEOPROCESSING_INTERSECTION;

    @FindBy(xpath = "//*[@id=\"geo-processing.buffer.dialog.form-input-distance\"]")
    public WebElement GEOPROCESSING_DISTANCE_INPUT;

    @FindBy(xpath = "//*[@id=\"geo-processing.buffer.dialog.form-select-distanceUnit\"]")
    public WebElement GEOPROCESSING_UNIT;

    @FindBy(xpath = "//*[@id=\"geo-processing.buffer.dialog.form-checkbox-intersects\"]/label/span[1]")
    public WebElement GEOPROCESSING_INTERSECTS_CHECKBOX;

    @FindBy(xpath = "//*[@id=\"geo-processing.buffer.dialog.form-autocomplete-featureClass\"]")
    public WebElement GEOPROCESSING_BUFFER_CLASS_LAYER;

    @FindBy(xpath = "//*[@id=\"geo-processing.intersection.dialog.form-autocomplete-featureClass\"]")
    public WebElement GEOPROCESSING_INTERSECTION_CLASS_LAYER;

    @FindBy(xpath = "//*[@id=\"polygon-inputSelection\"]")
    public WebElement GEOPROCESSING_POLYGON_RADIO_BUTTON;

    @FindBy(xpath = "//*[@id=\"view\"]/label/span[1]")
    public WebElement GEOPROCESSING_CURRENT_VIEW_RADIO_BUTTON;

    @FindBy(xpath = "//mat-dialog-container//sncr-geoprocessing-buffer-dialog//sncr-form//button[2]")
    public WebElement GEOPROCESSING_BUFFER_SUBMIT;

    @FindBy(xpath = "//sncr-geoprocessing-intersection-dialog//sncr-form//button[2]")
    public WebElement GEOPROCESSING_INTERSECTION_SUBMIT;

    @FindBy(xpath = "//mat-button-toggle-group/mat-button-toggle[3]")
    public WebElement CLEAR_GEOPROCESSING;

    @FindBy(xpath = "//*[@id=\"job-panel.form-input-jobFilter\"]")
    public WebElement JOBS_SEARCH_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-list-item[1]")
    public WebElement JOBS_FIRST_ITEM_SELECTION;

    @FindBy(xpath = "//*[@id=\"circuitListPanel\"]//tr[3]/td[10]//button")
    public WebElement MASTER_CIRCUIT_FIRST_BUTTON;

    @FindBy(xpath = "//mat-dialog-container//sncr-master-circuit-dialog//div[1]//mat-tab-group//mat-tab-header/div/div/div/div[1]")
    public WebElement CREATE_MASTER_CIRCUIT_HEADER;

    @FindBy(xpath = "//mat-dialog-container//sncr-master-circuit-dialog//div[1]//mat-tab-group//mat-tab-header/div/div/div/div[2]")
    public WebElement ASSIGN_MASTER_CIRCUIT_HEARDER;

    @FindBy(xpath = "//*[@id=\"master-circuit.dialog.form-input-name\"]")
    public WebElement MASTER_CIRCUIT_NAME_BOX;

    @FindBy(xpath = "//*[@id=\"master-circuit.dialog.form-select-typecode\"]//div[2]")
    public WebElement MASTER_CIRCUIT_TYPECODE_SELECTION_BOX;

    @FindBy(xpath = "//*[@id=\"master-circuit.dialog.form-input-alternateName\"]")
    public WebElement MASTER_CIRCUIT_ALTERNATE_NAME_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-form-autocomplete//div[1]//div//div[2]")
    public WebElement MASTER_CIRCUIT_ASSIGN_SELECTION_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//div[2]/button")
    public WebElement MASTER_CIRCUIT_UNASSIGN_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]//sncr-master-circuit-dialog//div[2]/button[2]")
    public WebElement MASTER_CIRCUIT_SUBMIT_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]//sncr-master-circuit-dialog/button/span[1]/mat-icon")
    public WebElement MASTER_CIRCUIT_PANEL_CLOSE;

    @FindBy(xpath = "//mat-option//span")
    public WebElement MASTER_CIRCUIT_FIBER_SYSTEMS_SELECTION;

    @FindBy(xpath = "//mat-option[1]/span")
    public WebElement MASTER_CIRCUIT_ASSIGN_FIRST_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id, \"cdk-overlay\")]//snack-bar-container//simple-snack-bar")
    public WebElement OSM_SEARCH_TIME_OUT_OVERLAY;

    @FindBy(xpath = "//*[starts-with(@id, \"cdk-overlay\")]//snack-bar-container//simple-snack-bar//button/span[1]")
    public WebElement OSM_SEARCH_TIME_OUT_OVERLAY_CANCEL;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//mat-card[2]//sncr-details-hierarchy//mat-nested-tree-node[1]//mat-nested-tree-node//mat-nested-tree-node//mat-tree-node/li/a")
    public WebElement FIBER_SPLICE_SELECT;

    @FindBy(xpath = "//*[@id=\"report.form-input-orderby\"]")
    public WebElement QUERY_ORDERBY_PROPERTIES_BOX;

    @FindBy(xpath = "//*[@id=\"report.form-input-properties\"]")
    public WebElement QUERY_PROPERTIES_NAME_BOX;
	
    @FindBy(xpath = "//*[@class=\"fas fa-binoculars\"]")
    public WebElement FIND_BUTTON;

    @FindBy(xpath = "//*[@id=\"map-find.form-autocomplete-classList\"]")
    public WebElement QUERY_CLASS_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"find-paginated-table\"]")
    public WebElement QUERY_TABLE_CONTENT;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][1]")
    public WebElement QUERY_CLASS_SELECTION;

    @FindBy(xpath = "//*[@id=\"btn-map-find-spatial-filter-button\"]//span")
    public WebElement SPATIAL_FILTER_BUTTON;

    @FindBy(xpath = "//sncr-find/sncr-form/form/div/button[1]")
    public WebElement RESET_CLASS_COLUMNS;

    @FindBy(xpath = "//sncr-find/sncr-form/form/div/button[2]")
    public WebElement SHOW_HIDE_COLUMNS_BUTTON;

    @FindBy(xpath = "//sncr-find/sncr-form/form/div/button[3]")
    public WebElement TOTAL_ROW_COUNT;

    @FindBy(xpath = "//*[@class=\"fa fa-star\"]")
    public WebElement BOOKMARK_ICON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog-title\")]")
    public WebElement BOOKMARK_DIALOG_TITLE;

    @FindBy(xpath = "//*[@id=\"view-bookmark.dialog.form-input-bookmarkName\"]")
    public WebElement BOOKMARK_SELECTED_BOX;

    @FindBy(xpath = "//*[starts-with(@id, \"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement BOOKMARK_ADD_BUTTON;

    @FindBy(xpath = "//*[@id=\"job-panel.form-input-jobFilter\"]")
    public WebElement BOOKMARK_SEARCH_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//div/sncr-bookmarks-panel/mat-list//mat-list-item/span")
    public WebElement BOOKMARK_SELECTED_ITEM;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-details/div/mat-toolbar/div/div/button")
    public WebElement BOOKMARK_STAR_BUTTON_DETAILS;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button[1]")
    public WebElement MASTER_CIRCUIT_CLOSE_BUTTON;

    @FindBy(xpath= "//*[@id=\"#header\"]/span[2]/span[1]")
    public WebElement HEADER_CLICK;

    @FindBy(xpath = "//*[@id=\"feature-inputSelection-input\"]")
    public WebElement SPATIAL_FILTER_CURRENT_SELECTION;

    @FindBy(xpath = "//*[@id=\"circuitListPanel\"]/div/table/tbody/tr[9]/td[11]/div/button/span[2]/span")
    public WebElement RESERVE_TAG_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-select-value\")]/span")
    public WebElement RESERVE_TAG_TYPE_CODE_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")][1]//span")
    public WebElement RESERVE_TAG_FIRST_SELECTION;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement RESERVE_TAG_SUBMIT;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]/sncr-circuit-tag-dialog//button[3]/span[1]")
    public WebElement RESERVE_TAG_REMOVE_SUBMIT;

    @FindBy(xpath = "//*[@id=\"circuit-tag.dialog.form-input-name\"]")
    public WebElement RESERVE_NAME_BOX;

    @FindBy(xpath = "//sncr-context-help-button/button")
    public WebElement CSH;
	
	@FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]//sncr-layer/div/div[2]//button[1]")
    public WebElement ADD_LAYER_BUTTON;

    @FindBy(xpath = "//*[@id=\"layerdatasource.dialog.form-select-layerType\"]")
    public WebElement LAYER_TYPE;

    @FindBy(xpath = "//mat-select//div[2]/div")
    public WebElement XYZ_LAYER_SELECTION_DELETE;

    @FindBy(xpath = "//mat-option[4]/span")
    public WebElement XYZ_LAYER_SELECTION;

    @FindBy(xpath = "//*[@id=\"layerdatasource.dialog.form-input-url\"]")
    public WebElement LAYER_URL_INPUT_BOX;

    @FindBy(xpath = "//*[@id=\"layerdatasource.dialog.form-input-name\"]")
    public WebElement LAYER_INPUT_NAME_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div[2]/button[2]")
    public WebElement LAYER_SAVE_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-conten\")]//div[2]//button[3]")
    public WebElement XYZ_DELETE_OPTION;

    @FindBy(xpath = "//*[text()=\" XYZ TEST LAYER (XYZ) \"]")
    public WebElement XYZ_LAYER_SELECTION_FOR_DELETE;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialo\")]//div[2]/button[2]")
    public WebElement LAYER_DELETE_BUTTON;
	
	@FindBy(xpath = "//*[@id=\"circuitListPanel\"]/div/table/tbody/tr[9]/td[8]")
    public WebElement TRACE_SELECTION;
	
	 @FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[17]")
    public WebElement THEMING_DASHBOARD;

    @FindBy(xpath = "//sncr-theming/mat-toolbar/button")
    public WebElement ADD_THEME_BUTTON;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-input-name\"]")
    public WebElement NAME_TEXT_BOX;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-autocomplete-classList\"]")
    public WebElement CLASS_LIST_DROPDOWN;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-option\")]")
    public WebElement CLASS_LIST_SELECTION;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-autocomplete-classProperty\"]")
    public WebElement CLASS_PROPERTY;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//div[1]/button")
    public WebElement CLASSIFY_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//sncr-form/form/div[2]/button[2]")
    public WebElement SAVE_BUTTON_THEMING;

    @FindBy(xpath = "//sncr-theming-dialog//mat-tab-header//div[2]")
    public WebElement GRADUATED_HEADER;

    @FindBy(xpath = "//sncr-theming-dialog//mat-tab-header//div[3]")
    public WebElement GRADUATED_RANGE_HEADER;

    @FindBy(xpath = "//sncr-theming-dialog//mat-tab-header//div[4]")
    public WebElement RULES_HEADER;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-input-gradNumClasses\"]")
    public WebElement THEMING_CLASSES_BOX_GRADUATED;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//sncr-color-ramp/div[2]")
    public WebElement THEMING_COLOR_BAR;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-input-gradRangeMin\"]")
    public WebElement GRADUATED_RANGE_MIN_BOX;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-input-gradRangeMax\"]")
    public WebElement GRADUATED_RANGE_MAX_BOX;

    @FindBy(xpath = "//*[@id=\"theming.dialog.form-input-gradRangeSteps\"]")
    public WebElement GRADUATED_RANGE_STEPS_BOX;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]//button")
    public WebElement THEMING_PREVIEW_BUTTON;

    @FindBy(xpath = "//*[@id=\"AddRule\"]")
    public WebElement THEMING_RULES_BUTTON;

    @FindBy(xpath = "//sncr-form-autosuggest//mat-form-field//input")
    public WebElement THEMING_QUERY_TEXT_BOX;

    @FindBy(xpath = "//div[text()='Color Ramp']")
    public WebElement COLOR_RAMP_TITLE;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//sncr-color-ramp-dialog/div/sncr-form/form/div[1]/div[1]/div[4]")
    public WebElement CHOOSE_COLOR_RAMP;

    @FindBy(xpath = "//*[@id=\"ngx-colors-overlay\"]/ngx-colors-panel/div")
    public WebElement COLOR_OVERLAY_1;

    @FindBy(xpath = "//*[@id=\"ngx-colors-overlay\"]/ngx-colors-panel/div/div[1]/div[7]")
    public WebElement COLOR_SELECTION_LAYER_1;

    @FindBy(xpath = "//*[@id=\"ngx-colors-overlay\"]/ngx-colors-panel/div")
    public WebElement COLOR_OVERLAY_2;

    @FindBy(xpath = "//*[@id=\"ngx-colors-overlay\"]/ngx-colors-panel/div/div[1]/div[7]")
    public WebElement COLOR_SELECTION_LAYER_2;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//sncr-color-ramp-dialog//sncr-form/form/div[2]/button[2]")
    public WebElement COLOR_SELECTION_OK_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]/div/div/div[2]/button")
    public WebElement PREVIEW_THEMING_GRADUATED_RANGE;

	@FindBy(xpath = "//*[starts-with(@id,\"mat-tab-content\")]/div/sncr-trace-otdr/as-split/div/div")
    public WebElement OTDR_DRAG;
	
	@FindBy(xpath = "//*[text()=' 19 : ~1:1,125 Local Street / High-Rise Buildings ']")
    public WebElement ZOOM_LEVEL_19;

    @FindBy(xpath = "//*[@class=\"ol-unselectable ol-control center-label\"]")
    public WebElement ZOOM_LEVEL_BOX;

    @FindBy(xpath = "//*[@id=\"location.form-select-scale\"]/div/div[2]")
    public WebElement ZOOM_DROPDOWN;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]//div[1]//button[1]")
    public WebElement ZOOM_LEVEL_BOX_GO_BUTTON;

    @FindBy(xpath = "//*[starts-with(@id,\"mat-dialog\")]/sncr-map-center-location/button/span[1]/mat-icon")
    public WebElement ZOOM_LEVEL_CLOSE_BUTTON;
	
	@FindBy(xpath = "//*[@id=\"menubar-content\"]")
    public WebElement VERTICAL_SCROLL;
	
	@FindBy(xpath = "//*[text()=\" KML (KML) \"]")
    public WebElement KML_LAYER_SELECTION_FOR_DELETE;

    @FindBy(xpath = "//*[text()=\" KMZ (KMZ) \"]")
    public WebElement KMZ_LAYER_SELECTION_FOR_DELETE;
	
	@FindBy(xpath = "//*[starts-with(@id,\"mat-mdc-dialog\")]//div/div[2]/button")
    public WebElement KML_IMPORT;

	@FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[17]")
    public WebElement SEARCH_POSTGRES;
	
	@FindBy(xpath = "//*[@id=\"menubar-content\"]/ul/li[18]")
    public WebElement WMTS_POSTGRES;
	
    @FindBy(xpath = "//mat-option[2]/span")
    public WebElement KMZ_LAYER_SELECTION;
	
	@FindBy(xpath = "//mat-option[1]/span")
    public WebElement KML_LAYER_SELECTION;





    public boolean clickToolElement(WebElement element) {
        element.click();
        return false;
    }

    public boolean isPresentElement(WebElement element) {
        return element.isDisplayed();
    }
}
