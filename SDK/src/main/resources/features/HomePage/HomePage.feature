@homePage

Feature: To Validate the Home Page of SDK

  Scenario: To test the Login functionality of SDK
    Given I launch the Application
    When  I enter the Credentials

  Scenario: To Validate the MenuBar Content
    Given I verify the Map Section
    And   I verify the Drawing Section
    When  I validate Trace Section
    Then  I validate Splicing Section
    And   I validate Reports Section
    And   I validate Report Manager Section

  Scenario: To Validate the ToolBar
    Given I verify the Edit tool
    When  I verify the Bell icon
    Then  I verify the Settings icon
    Then  I verify the SDK help

  Scenario: To Validate the Tab Layer
    Given I validate the Layers Tab
    When  I validate the Jobs Tab
    Then  I validate Details Tab
    And   I validate Search Tab
    And   I verify Log out icon





