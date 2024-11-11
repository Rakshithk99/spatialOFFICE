@Sanity

Feature: To Validate the Sanity Tests for SDK Application

  Scenario Outline: To Validate the MAIN MenuBar Content
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    And   I verify the Drawing Section
    When  I validate Trace Section
    Then  I validate Rf Power Section
    Then  I validate Rf Levels Section
    Then  I validate Splicing Section
    And   I validate Reports Section
    And   I validate Report Manager Section
    Then  I Log out
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |


  Scenario Outline: To Validate the ToolBar
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Zoom tool
    When  I verify the Bell icon
    Then  I verify the Settings icon
    Then  I verify the SDK help
    Given  I verify the Map Section
    Then  I Log out
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline: To Create the XYZ Layer and validate the layer is created
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I Create the XYZ Layer
    And   I Delete the XYZ Layer
    Then  I Log out

    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |


  Scenario Outline: To Create the KML Layer and validate the layer is created
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I Create the KML Layer <path>
    And   I Delete the KML Layer
    Then  I Log out
    Examples:
      | DB                           | path                          |
      | http://10.246.4.94/SHAW90_SO | C:\Third Party Layers\KML.kml |


  Scenario Outline: To Create the KMZ Layer and validate the layer is created
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I Create the KMZ Layer <path>
    And   I Delete the KMZ Layer
    Then  I Log out
    Examples:
      | DB                           | path                          |
      | http://10.246.4.94/SHAW90_SO | C:\Third Party Layers\KMZ.kmz |


  Scenario Outline: To Validate the Base Layers Tab
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I validate the Layers Tab
    Then  I Validate the SpatialStorm Layers Tab
    And   I Validate the Base Layers Tab
    Then  I Log out
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline: To validate the Jobs Tab,Search and Details
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given  I validate the Jobs Tab
    And    I Create Job
    Given  I Enter the <ID> for the Entity
    When   I validate the Title of the Entity Selected
    Then   I Validate the Details layer of the Selected entity
    And    I Validate the Book Mark Tab <BOOKMARK>
    Then  I Log out
    Examples:
      | DB                           | ID         | BOOKMARK     |
      | http://10.246.4.94/SHAW90_SO | R229260882 | Storage Loop |

  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline: To validate the Drawings tab
    Given I verify the Map Section
    Then  I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    And   I verify the Drawing Section for the selected entity
    Then  I Log out
    Examples:
      | ID        |
      | C10026535 |

  Scenario Outline: To Validate the Trace from Main Menu
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given  I verify the Map Section
    Given  I Enter the <ID> for the Entity
    When   I validate the Title of the Entity Selected
    Then   I navigate to Trace tab and select mutiple traces
    And    I Validate the Summary tab
    Then   I Validate the Schematic tab
    And    I Validate the Report tab
    Then   I Validate the Map tab
    And    I Validate the OTDR tab by passing <OTDR Value>,<Margin>
    Then  I Log out
    Examples:
      | DB                           | ID         | OTDR Value | Margin |
      | http://10.246.4.94/SHAW90_SO | R229260882 | 300        | 1      |


  Scenario Outline: To Validate the Rf Power from Main Menu
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Given I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Navigate to Rf Power Report
    And   I Validate the RF Power Report
    Examples:
      | DB                           | ID       |
      | http://10.246.4.94/SHAW90_SO | PS744733 |

  Scenario: To Validate the Rf power Trace Report
    Given I Navigate to Rf Power Trace Report
    Then  I Validate the RF Power Trace Report

  Scenario Outline: To Validate the Rf Levels from Main Menu
    Given I verify the Map Section
    Given I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Navigate to RF Levels Report
    And   I Validate the RF Levels Report
    Then  I Log out
    Examples:
      | ID        |
      | RA3372883 |

  Scenario Outline: To Validate the Splicing
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Given  I Enter the <ID> for the Entity
    When   I validate the Title of the Entity Selected
    Then   I navigate to Splicing
    Then  I navigate to Report tab and verify Splice Report
    And   I validate the First Splice Tray report
    And   I validate the Splice Tray Reports
    Examples:
      | DB                           | ID         |
      | http://10.246.4.94/SHAW90_SO | SC10014626 |

  Scenario: To validate the LogOut icon
    Given  I Log out


  Scenario Outline:To validate the Trace Report from Reports Dropdown
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I Click on the reports dropdown
    Given I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I navigate to Trace Report
    And   I validate the Trace Panel and enter <PhysicalSeq>,<Channel> details
    Given  I Log out

    Examples:
      | DB                           | ID           | PhysicalSeq | Channel |
      | http://10.246.4.94/SHAW90_SO | PLEC10033103 | 5           | 10      |

  Scenario Outline:To validate the Splice Report from Reports Dropdown
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Then  I Click on the reports dropdown
    Then I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Navigate to Splice Report
    And   I validate the Splice Report Panel
    Given  I Log out

    Examples:
      | DB                           | ID         |
      | http://10.246.4.94/SHAW90_SO | SC10014711 |

  Scenario Outline:To validate the Equipment Report from Reports Dropdown
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Then  I Click on the reports dropdown
    Then I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Navigate to Equipment Report
    And   I validate the Equipment Report Panel
    Given  I Log out
    Examples:
      | DB                           | ID       |
      | http://10.246.4.94/SHAW90_SO | 10062439 |

  Scenario Outline:To validate the Address List Report & Home Passed Report from Reports Dropdown
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Then  I Click on the reports dropdown
    Then  I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Then  I Navigate to Address List Report
    And   I validate the Address List Report Panel
    Given  I Log out

    Examples:
      | DB                           | ID        |
      | http://10.246.4.94/SHAW90_SO | 593011783 |

  Scenario Outline: To validate the Home Passed Report from Reports Dropdown
    Given I launch <DB> the Application
    When  I enter the Credentials
    Given I verify the Map Section
    Then  I Click on the reports dropdown
    Then  I Enter the <ID> for the Entity
    When  I validate the Title of the Entity Selected
    Given  I Navigate to Home Passed Report
    And    I validate the Home Passed Report Panel
    Given  I Log out

    Examples:
      | DB                           | ID        |
      | http://10.246.4.94/SHAW90_SO | 593011783 |

  Scenario Outline: To Test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario: To validate the Search
    Given I navigate to Search tab
    Then  I Verify the Configurations of Search

  Scenario: To validate the WMTS
    Given I navigate to WMTS tab
    Then  I Verify the WMTS Panel
#    And   I Validate teh Open Panel of WMTS
 #   Then  I Validate the Import Panel of WMTS
  #  And   I validate the WMTS features


  Scenario: To validate the LogOut icon
    Given  I Log out


#  Scenario Outline: To Test the Login functionality of SDK
#    Given I launch <DB> the Application
#    When  I enter the Credentials
#    Examples:
#      | DB                           |
#      | http://10.246.4.94/SHAW90_SO |
#
#  Scenario Outline:To Validate the Red line Menu
#    When  I Enter the <ID> for the Entity
#    Then  I validate the Title of the Entity Selected
#    And   I Zoom in to the Required zoom level
#    Given I Verify the Red line Pencil is displayed and clickable
##    Then  I Verify the Red line Chip is displayed at te bottom of page
#
#    Examples:
#      | ID       |
#      | 32267852 |
#
#  Scenario: To Validate the Red line Creation for Text
#    Given I Click on the Alphabet Button
#    Then  I Add a Text in the selected Map area
#
#  Scenario: To Validate the Red line Creation for Shapes
#    When  I Click on the Shapes Button
#    Then  I Validate the Shapes listed
#    And   I Add the Shapes in the Selected Area
#
#  Scenario: To validate the LogOut icon
#    Given  I Log out

#
#  Scenario Outline: To Test the Login functionality of SDK
#    Given I launch <DB> the Application
#    When  I enter the Credentials
#    Examples:
#      | DB                           |
#      | http://10.246.4.94/SHAW90_SO |
#
#  Scenario Outline:To Validate the Red line Menu
#    When  I Enter the <ID> for the Entity
#    Then  I validate the Title of the Entity Selected
#    And   I Zoom in to the Required zoom level
#    Given I Verify the Red line Pencil is displayed and clickable
#   # Then  I Verify the Red line Chip is displayed at te bottom of page
#
#    Examples:
#      | ID       |
#      | 32267852 |
#
#  Scenario: To Validate the Red line Creation for Polygon
#    Then  I Click on the Red line Polygon
#    And   I Add a Polygon in Map area
#
#  Scenario:  To Validate the Red line Creation for Line and Arrows
#    When   I Click on the Draw Line Button
#    Then   I Add a line in Map Area
#    And    I Add a line Arrow in Map Area
#
#  Scenario: To Un save the Changes made for Red line
#    Given I Click on the Trash Button to Un Save Red line items
#
#  Scenario: To validate the LogOut icon
#    Given  I Log out

  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline:To Validate the Book Mark
    When  I Enter the <ID> for the Entity
    Then  I validate the Title of the Entity Selected
    And   I Click on the BookMark
    Then  I Add the Selected View as the New Book Mark
    Examples:
      | ID       |
      | 32267857 |

  Scenario: To validate the LogOut icon
    Given I Log out

  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline: To Validate the Find Table
    Given I verify the Map Section
    Then  I Enter the <ID> for the Entity
    Then  I validate the Title of the Entity Selected
    Given I Navigate to Find table and search for a class <CLASS>
    Then  I Validate the Menu items for the Find Table
    Examples:
      | ID         | CLASS        |
      | R426063263 | Storage Loop |


  Scenario: To Validate the SpatialFilter
    Given I Click on SpatialFilter Button
    Then  I Validate the Spatial Filter for Current View
    Given I Click on SpatialFilter Button for the second time
    Then  I Validate the Spatial Filter for Current Selection
    Then  I Validate the Spatial Filter for Draw Polygon Selection
    Then  I Log out


  Scenario Outline: To test the Login functionality of SDK
    Given I launch <DB> the Application
    When  I enter the Credentials
    Examples:
      | DB                           |
      | http://10.246.4.94/SHAW90_SO |

  Scenario Outline: To Validate the Circuit Reserve Tag
    Given I verify the Map Section
    Then  I Enter the <ID> for the Entity
    Then  I validate the Title of the Entity Selected
    Then  I navigate to Trace tab and select one of the trace
    And  I Validate the Circuit Reserve Tag for the Selected Cable
    Then I Validate the Edit for Circuit Reserve Tag
    Then I Log out
    Examples:
      | ID         |
      | R229260882 |

  Scenario Outline: To Validate the SpatialOffice with the URl to search with address
    Given I launch <DB> the Application
    When  I enter the Credentials
    Then  I take the screenshot for the Map
    Then  I Log out
    Examples:
      | DB                                                                                                                               |
      | http://10.246.4.94/SHAW90_SO/#/map(sidebar:sidebar)?selectedTab=search&searchText=777 Royal Oak Dr, Victoria, BC V8X 4V1, Canada |

