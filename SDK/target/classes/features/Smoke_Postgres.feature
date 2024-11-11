@Smoke_Postgres

Feature: To Validate the Smoke Tests for SDK Application

  Scenario Outline: To Validate the Splice Connection Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberSpliceID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Splice Connection Report with <FiberSpliceID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberSpliceID |
      | http://10.246.4.94/Postgres/SHAW01_SO | SC10018205    |

  Scenario Outline:To Validate the Rf Power Trace Diagram from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <PowerSupplyID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    And   I create the Rf Power Trace Diagram Report with <PowerSupplyID>,<JOBID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | PowerSupplyID | JOBID  |
      | http://10.246.4.94/Postgres/SHAW01_SO | PS744733      | 123456 |

  Scenario Outline:To Validate the Equipment Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I Enter the <BoundaryID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    And   I create the Equipment Report with <BoundaryID>,<Properties> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | BoundaryID | Properties                  |
      | http://10.246.4.94/Postgres/SHAW01_SO | 83067748   | FiberSpliceCase,FiberSplice |

  Scenario Outline:To Validate the Splice Tray Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberSpliceID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Select the Fiber Splice Node
    Given I validate Report Manager Section
    Then  I Click on Create Report
    And   I create the Splice Tray Report with <FiberSpliceID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberSpliceID |
      | http://10.246.4.94/Postgres/SHAW01_SO | SC10018205    |

  Scenario Outline: To Validate the Trace Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    And   I create the Trace Report with  <FiberCableID>,<PhysicalSeq>,<Channel>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID | PhysicalSeq | Channel | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145134 | 5           | 10      | 543   |

  Scenario Outline:To Validate the Trace Schematic Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    And   I create the Trace Schematic Report with <FiberCableID>,<PhysicalSeq>,<Channel>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID | PhysicalSeq | Channel | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145137 | 6           | 12      | 543   |

  Scenario Outline:To Validate the Trace Summary Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Trace Summary Report with <FiberCableID>,<PhysicalSeq>,<Channel>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID | PhysicalSeq | Channel | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145144 | 8           | 13      | 543   |

  Scenario Outline:To Validate the Blown Fiber Schematic Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <SUPPORTTUBEID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Blown Fiber Schematic Report with <FiberCableID>,<Port>,<Channel>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | SUPPORTTUBEID | Port | Channel | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | R2678483190   | 8    | 13      | 543   |

  Scenario Outline:To Validate the Boundary Address Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <BoundaryID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Boundary Address Report with <BoundaryID>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | BoundaryID | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | 32267853   | 543   |

  Scenario Outline:To Validate the Home Passed Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <BoundaryID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Home Passed Report with <BoundaryID>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | BoundaryID | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | 32267853   | 543   |

  Scenario Outline:To Validate the Class Diagram Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Class Diagram Report with <Entity> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145144 |


  Scenario Outline:To Validate the Query Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the Query Report with <OrderByProperties>,<PropertyNames> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID | OrderByProperties | PropertyNames          |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145144 | Id                | ShortEntityDescription |


  Scenario Outline:To Validate the OTDR Report from Report Manager
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then I Enter the <FiberCableID> for the Entity
    When  I validate the Title of the Entity Selected
    Given I validate Report Manager Section
    Then  I Click on Create Report
    Then  I create the OTDR Report with <PhysicalSeq>,<Channel>,<JobID> and verify the Report created in the Report Manager Dashboard
    Given  I Log out
    Examples:
      | DB                                    | FiberCableID | PhysicalSeq | Channel | JobID |
      | http://10.246.4.94/Postgres/SHAW01_SO | PLEC13145144 | 10          | 12      | 678   |

  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                                    |
      | http://10.246.4.94/Postgres/SHAW01_SO |

  Scenario: To Validate the Ruler
    Given  I Verify the Ruler is displayed and clickable
    And    I Verify the Distance option of Ruler
    Then   I Verify the Area option of Red line Ruler

  Scenario: To Validate the Go to Location
    Given  I Verify the Go to Location is displayed and clickable
    Then   I Verify the Pop up enables for Go To Location


  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                                    |
      | http://10.246.4.94/Postgres/SHAW01_SO |

  Scenario: To Validate the Share
    Given  I verify the Share is displayed and clickable
    When   I Verify the Copy Lat & Long as URL
    Then   I Verify the Copy Features as URL

  Scenario: To Validate the Clear Option
    Given  I Validate the Clear control option

 # Scenario:  To Validate the Print
 #   Given   I Validate the Print is displayed and Clickable

  Scenario: To validate the LogOut icon
    Given  I Log out


  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                                    |
      | http://10.246.4.94/Postgres/SHAW01_SO |

  #Scenario: To Validate the Zoom to Location
  #  Given   I validate the Zoom to Location

  Scenario: To Validate the Previous View and Next View
    Given   I Validate the Previous View
    Then    I Validate the Next View


  Scenario: To validate the LogOut icon
    Given I Log out


  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                                    |
      | http://10.246.4.94/Postgres/SHAW01_SO |

  Scenario Outline: To Validate the Set Master Circuit on Fibers
    When  I Enter the <ID> for the Entity
    Then  I validate the Title of the Entity Selected
    Given I validate the Jobs Tab
    Then  I Search for the <Job> in the Search Box and select the job
    Then  I navigate to Trace tab and select one of the trace
    And   I Click on the Master Circuit Button
    Then  I Validate the Master Circuit Panel and Create a Master Circuit

    Examples:
      | ID           | Job            |
      | PLEC13144915 | Master Circuit |


  Scenario: To validate the LogOut icon
    Given I Log out

  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                                    |
      | http://10.246.4.94/Postgres/SHAW01_SO |

  Scenario Outline: To Validate the OSM and GOOGLE Place
    When  I Enter the <ID> for the Entity
    Then  I validate the Title of the Entity Selected for OSM and Google Place

    Examples:
      | ID                                         |
      | 652 Yates St, Victoria, BC V8W 1L3, Canada |

  Scenario: To validate the LogOut icon
    Given I Log out

