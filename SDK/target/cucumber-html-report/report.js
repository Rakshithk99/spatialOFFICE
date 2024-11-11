$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Smoke.feature");
formatter.feature({
  "line": 3,
  "name": "To Validate the Smoke Tests for SDK Application",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "To Validate the Splice Connection Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-connection-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Enter the \u003cFiberSpliceID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I create the Splice Connection Report with \u003cFiberSpliceID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-connection-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberSpliceID"
      ],
      "line": 15,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-connection-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "SC10018205"
      ],
      "line": 16,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-connection-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "To Validate the Splice Connection Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-connection-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Enter the SC10018205 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I create the Splice Connection Report with SC10018205 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3868644300,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30960185000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SC10018205",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29327056900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14425491500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9968513100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21550668000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SC10018205",
      "offset": 43
    }
  ],
  "location": "HomePageDefinition.SpliceConnectionReport(String)"
});
formatter.result({
  "duration": 16855739200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2318637300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "To Validate the Rf Power Trace Diagram from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-rf-power-trace-diagram-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I Enter the \u003cPowerSupplyID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I create the Rf Power Trace Diagram Report with \u003cPowerSupplyID\u003e,\u003cJOBID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-rf-power-trace-diagram-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "PowerSupplyID",
        "JOBID"
      ],
      "line": 28,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-rf-power-trace-diagram-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PS744733",
        "123456"
      ],
      "line": 29,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-rf-power-trace-diagram-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "To Validate the Rf Power Trace Diagram from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-rf-power-trace-diagram-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I Enter the PS744733 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I create the Rf Power Trace Diagram Report with PS744733,123456 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2777956800,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31004109600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PS744733",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29325952800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14321914400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 10007186900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21579153400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PS744733",
      "offset": 48
    },
    {
      "val": "123456",
      "offset": 57
    }
  ],
  "location": "HomePageDefinition.RfPowerTraceDiagram(String,String)"
});
formatter.result({
  "duration": 22589862900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2332512400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "To Validate the Equipment Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-equipment-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 32,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I Enter the \u003cBoundaryID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I create the Equipment Report with \u003cBoundaryID\u003e,\u003cProperties\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-equipment-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "BoundaryID",
        "Properties"
      ],
      "line": 41,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-equipment-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "83067748",
        "FiberSpliceCase,FiberSplice"
      ],
      "line": 42,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-equipment-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 42,
  "name": "To Validate the Equipment Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-equipment-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I Enter the 83067748 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I create the Equipment Report with 83067748,FiberSpliceCase,FiberSplice and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2974413100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31019457200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "83067748",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29306253000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14255612600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9984726600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21602335700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "83067748,FiberSpliceCase",
      "offset": 35
    },
    {
      "val": "FiberSplice",
      "offset": 60
    }
  ],
  "location": "HomePageDefinition.EquipmentReport(String,String)"
});
formatter.result({
  "duration": 28317070600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2268180200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 44,
  "name": "To Validate the Splice Tray Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-tray-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 45,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I Enter the \u003cFiberSpliceID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I Select the Fiber Splice Node",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I create the Splice Tray Report with \u003cFiberSpliceID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-tray-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberSpliceID"
      ],
      "line": 55,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-tray-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "SC10018205"
      ],
      "line": 56,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-tray-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 56,
  "name": "To Validate the Splice Tray Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-splice-tray-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I Enter the SC10018205 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I Select the Fiber Splice Node",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I create the Splice Tray Report with SC10018205 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2924383100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30891623200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SC10018205",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29279759900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14219315500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iSelectTheFiberSpliceNode()"
});
formatter.result({
  "duration": 6263695300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9937407700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21623430600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SC10018205",
      "offset": 37
    }
  ],
  "location": "HomePageDefinition.SpliceTrayReport(String)"
});
formatter.result({
  "duration": 11357653200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2351756800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 58,
  "name": "To Validate the Trace Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 59,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I create the Trace Report with  \u003cFiberCableID\u003e,\u003cPhysicalSeq\u003e,\u003cChannel\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 67,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID",
        "PhysicalSeq",
        "Channel",
        "JobID"
      ],
      "line": 68,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145134",
        "5",
        "10",
        "543"
      ],
      "line": 69,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 69,
  "name": "To Validate the Trace Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I Enter the PLEC13145134 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I create the Trace Report with  PLEC13145134,5,10,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2966769300,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30912247500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145134",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29306738200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14194462200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9936899600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21611938300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " PLEC13145134",
      "offset": 31
    },
    {
      "val": "5",
      "offset": 45
    },
    {
      "val": "10",
      "offset": 47
    },
    {
      "val": "543",
      "offset": 50
    }
  ],
  "location": "HomePageDefinition.TraceReport(String,String,String,String)"
});
formatter.result({
  "duration": 34087809900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2281436600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 71,
  "name": "To Validate the Trace Schematic Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-schematic-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 72,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "I create the Trace Schematic Report with \u003cFiberCableID\u003e,\u003cPhysicalSeq\u003e,\u003cChannel\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 80,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-schematic-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID",
        "PhysicalSeq",
        "Channel",
        "JobID"
      ],
      "line": 81,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-schematic-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145137",
        "6",
        "12",
        "543"
      ],
      "line": 82,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-schematic-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 82,
  "name": "To Validate the Trace Schematic Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-schematic-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 72,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "I Enter the PLEC13145137 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "I create the Trace Schematic Report with PLEC13145137,6,12,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3041428700,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30926923200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145137",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29305416500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14238166100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 10001068100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21586463500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145137",
      "offset": 41
    },
    {
      "val": "6",
      "offset": 54
    },
    {
      "val": "12",
      "offset": 56
    },
    {
      "val": "543",
      "offset": 59
    }
  ],
  "location": "HomePageDefinition.TraceSchematicReport(String,String,String,String)"
});
formatter.result({
  "duration": 34095833800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2297579800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 84,
  "name": "To Validate the Trace Summary Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-summary-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 85,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "I create the Trace Summary Report with \u003cFiberCableID\u003e,\u003cPhysicalSeq\u003e,\u003cChannel\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 93,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-summary-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID",
        "PhysicalSeq",
        "Channel",
        "JobID"
      ],
      "line": 94,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-summary-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145144",
        "8",
        "13",
        "543"
      ],
      "line": 95,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-summary-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 95,
  "name": "To Validate the Trace Summary Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-trace-summary-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 85,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "I Enter the PLEC13145144 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "I create the Trace Summary Report with PLEC13145144,8,13,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2978413900,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30929186000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145144",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29245365800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14217998500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 10028864500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21552202300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145144",
      "offset": 39
    },
    {
      "val": "8",
      "offset": 52
    },
    {
      "val": "13",
      "offset": 54
    },
    {
      "val": "543",
      "offset": 57
    }
  ],
  "location": "HomePageDefinition.TraceSummaryReport(String,String,String,String)"
});
formatter.result({
  "duration": 34012099800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2304865100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 97,
  "name": "To Validate the Blown Fiber Schematic Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-blown-fiber-schematic-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 98,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 100,
  "name": "I Enter the \u003cSUPPORTTUBEID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "I create the Blown Fiber Schematic Report with \u003cFiberCableID\u003e,\u003cPort\u003e,\u003cChannel\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 106,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-blown-fiber-schematic-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "SUPPORTTUBEID",
        "Port",
        "Channel",
        "JobID"
      ],
      "line": 107,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-blown-fiber-schematic-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "R2678483190",
        "8",
        "13",
        "543"
      ],
      "line": 108,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-blown-fiber-schematic-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 108,
  "name": "To Validate the Blown Fiber Schematic Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-blown-fiber-schematic-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 98,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 100,
  "name": "I Enter the R2678483190 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "I create the Blown Fiber Schematic Report with \u003cFiberCableID\u003e,8,13,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2881115200,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30969162200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R2678483190",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29262931500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14211098000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9914720500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21550913800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cFiberCableID\u003e",
      "offset": 47
    },
    {
      "val": "8",
      "offset": 62
    },
    {
      "val": "13",
      "offset": 64
    },
    {
      "val": "543",
      "offset": 67
    }
  ],
  "location": "HomePageDefinition.BlownFiberSchematicReport(String,String,String,String)"
});
formatter.result({
  "duration": 28336947900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2245226000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 110,
  "name": "To Validate the Boundary Address Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-boundary-address-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 111,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 112,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "I Enter the \u003cBoundaryID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 114,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "I create the Boundary Address Report with \u003cBoundaryID\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 119,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-boundary-address-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "BoundaryID",
        "JobID"
      ],
      "line": 120,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-boundary-address-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "32267853",
        "543"
      ],
      "line": 121,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-boundary-address-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 121,
  "name": "To Validate the Boundary Address Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-boundary-address-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 111,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 112,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "I Enter the 32267853 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 114,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "I create the Boundary Address Report with 32267853,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2878627100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30975654300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32267853",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29228348100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14191103200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 10038065300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21636101300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32267853",
      "offset": 42
    },
    {
      "val": "543",
      "offset": 51
    }
  ],
  "location": "HomePageDefinition.BoundaryAddressReport(String,String)"
});
formatter.result({
  "duration": 22649272900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2283975000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 123,
  "name": "To Validate the Home Passed Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-home-passed-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 124,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 125,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "I Enter the \u003cBoundaryID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 128,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 129,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "I create the Home Passed Report with \u003cBoundaryID\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 131,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 132,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-home-passed-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "BoundaryID",
        "JobID"
      ],
      "line": 133,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-home-passed-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "32267853",
        "543"
      ],
      "line": 134,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-home-passed-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 134,
  "name": "To Validate the Home Passed Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-home-passed-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 124,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 125,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "I Enter the 32267853 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 128,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 129,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "I create the Home Passed Report with 32267853,543 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 131,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2908668800,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30982979300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32267853",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29251380500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14238654900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 10144921100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21602794000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32267853",
      "offset": 37
    },
    {
      "val": "543",
      "offset": 46
    }
  ],
  "location": "HomePageDefinition.HomePassedReport(String,String)"
});
formatter.result({
  "duration": 22696504700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2252060800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 136,
  "name": "To Validate the Class Diagram Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-class-diagram-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 137,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 138,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 141,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 142,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "I create the Class Diagram Report with \u003cEntity\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 144,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 145,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-class-diagram-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID"
      ],
      "line": 146,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-class-diagram-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145144"
      ],
      "line": 147,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-class-diagram-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 147,
  "name": "To Validate the Class Diagram Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-class-diagram-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 137,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 138,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "I Enter the PLEC13145144 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 141,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 142,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "I create the Class Diagram Report with \u003cEntity\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 144,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3075772900,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30935580100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145144",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29297422000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14213033200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9899085900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21580473800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cEntity\u003e",
      "offset": 39
    }
  ],
  "location": "HomePageDefinition.iCreateTheClassDiagramReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String)"
});
formatter.result({
  "duration": 22379218500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2264151100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 150,
  "name": "To Validate the Query Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-query-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 151,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 152,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 153,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 155,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 156,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "I create the Query Report with \u003cOrderByProperties\u003e,\u003cPropertyNames\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 158,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 159,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-query-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID",
        "OrderByProperties",
        "PropertyNames"
      ],
      "line": 160,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-query-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145144",
        "Id",
        "ShortEntityDescription"
      ],
      "line": 161,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-query-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 161,
  "name": "To Validate the Query Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-query-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 151,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 152,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 153,
  "name": "I Enter the PLEC13145144 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 155,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 156,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "I create the Query Report with Id,ShortEntityDescription and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 158,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2892115100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30934211400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145144",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29294781400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14222887900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9883384600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21635041400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Id",
      "offset": 31
    },
    {
      "val": "ShortEntityDescription",
      "offset": 34
    }
  ],
  "location": "HomePageDefinition.iCreateTheQueryReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String,String)"
});
formatter.result({
  "duration": 34015889800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2276514100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 163,
  "name": "To Validate the OTDR Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-otdr-report-from-report-manager",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 164,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 165,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 166,
  "name": "I Enter the \u003cFiberCableID\u003e for the Entity",
  "keyword": "Then "
});
formatter.step({
  "line": 167,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 168,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 169,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
  "name": "I create the OTDR Report with \u003cPhysicalSeq\u003e,\u003cChannel\u003e,\u003cJobID\u003e and verify the Report created in the Report Manager Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 171,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.examples({
  "line": 172,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-otdr-report-from-report-manager;",
  "rows": [
    {
      "cells": [
        "DB",
        "FiberCableID",
        "PhysicalSeq",
        "Channel",
        "JobID"
      ],
      "line": 173,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-otdr-report-from-report-manager;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO",
        "PLEC13145144",
        "10",
        "12",
        "678"
      ],
      "line": 174,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-otdr-report-from-report-manager;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 174,
  "name": "To Validate the OTDR Report from Report Manager",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-otdr-report-from-report-manager;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 164,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 165,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 166,
  "name": "I Enter the PLEC13145144 for the Entity",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 167,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "When "
});
formatter.step({
  "line": 168,
  "name": "I validate Report Manager Section",
  "keyword": "Given "
});
formatter.step({
  "line": 169,
  "name": "I Click on Create Report",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
  "name": "I create the OTDR Report with 10,12,678 and verify the Report created in the Report Manager Dashboard",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 171,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3113899600,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31064338400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13145144",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29224073400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14246797100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateReportManagerSection()"
});
formatter.result({
  "duration": 9856399700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnCreateReport()"
});
formatter.result({
  "duration": 21560968900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 30
    },
    {
      "val": "12",
      "offset": 33
    },
    {
      "val": "678",
      "offset": 36
    }
  ],
  "location": "HomePageDefinition.iCreateTheOtdrReportWithEntityAndVerifyTheReportCreatedInTheReportManagerDashboard(String,String,String)"
});
formatter.result({
  "duration": 39332433900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2279833800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 177,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 178,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 179,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 180,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 181,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 182,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 182,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 178,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 179,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 2096574200,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30935900900,
  "status": "passed"
});
formatter.scenario({
  "line": 184,
  "name": "To Validate the Ruler",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-ruler",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 185,
  "name": "I Verify the Ruler is displayed and clickable",
  "keyword": "Given "
});
formatter.step({
  "line": 186,
  "name": "I Verify the Distance option of Ruler",
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "I Verify the Area option of Red line Ruler",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheRulerIsDisplayedAndClickable()"
});
formatter.result({
  "duration": 11182899000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheDistanceOptionOfRuler()"
});
formatter.result({
  "duration": 38878823700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id,\"mat-dialog\")]/sncr-map-measure/button/span[1]\"}\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56173}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir12464_1542225502}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 7717518c18ac1af7b19488f5d7beda46\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id,\"mat-dialog\")]/sncr-map-measure/button/span[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.verifyDistanceOption(HomePageImplementation.java:1419)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyTheDistanceOptionOfRuler(HomePageDefinition.java:488)\r\n\tat ✽.And I Verify the Distance option of Ruler(src/main/resources/features/Smoke.feature:186)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheAreaOptionOfRedLineRuler()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 189,
  "name": "To Validate the Go to Location",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-go-to-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 190,
  "name": "I Verify the Go to Location is displayed and clickable",
  "keyword": "Given "
});
formatter.step({
  "line": 191,
  "name": "I Verify the Pop up enables for Go To Location",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheGoToLocationIsDisplayedAndClickable()"
});
formatter.result({
  "duration": 268199000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyThePopUpEnablesForGoToLocation()"
});
formatter.result({
  "duration": 24057544200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//sncr-map-center-location//form//div[1]/div[1]/button/span[1]/mat-icon\"}\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56173}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir12464_1542225502}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 7717518c18ac1af7b19488f5d7beda46\n*** Element info: {Using\u003dxpath, value\u003d//sncr-map-center-location//form//div[1]/div[1]/button/span[1]/mat-icon}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.verifyPopUpGoToLocation(HomePageImplementation.java:1462)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyThePopUpEnablesForGoToLocation(HomePageDefinition.java:503)\r\n\tat ✽.Then I Verify the Pop up enables for Go To Location(src/main/resources/features/Smoke.feature:191)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 194,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 195,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 196,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 197,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 198,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 199,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 199,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 195,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 196,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3187012100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 30989104900,
  "status": "passed"
});
formatter.scenario({
  "line": 201,
  "name": "To Validate the Share",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-share",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 202,
  "name": "I verify the Share is displayed and clickable",
  "keyword": "Given "
});
formatter.step({
  "line": 203,
  "name": "I Verify the Copy Lat \u0026 Long as URL",
  "keyword": "When "
});
formatter.step({
  "line": 204,
  "name": "I Verify the Copy Features as URL",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheShareIsDisplayedAndClickable()"
});
formatter.result({
  "duration": 11231354500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheCopyLatLongAsURL()"
});
formatter.result({
  "duration": 32007839400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//mat-dialog-container/sncr-error-dialog/mat-dialog-actions/button\"}\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56217}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir12412_1425028289}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 76c52c699513c3d506c81e2f3d775e64\n*** Element info: {Using\u003dxpath, value\u003d//mat-dialog-container/sncr-error-dialog/mat-dialog-actions/button}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.verifyLatLongCopy(HomePageImplementation.java:1486)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyTheCopyLatLongAsURL(HomePageDefinition.java:513)\r\n\tat ✽.When I Verify the Copy Lat \u0026 Long as URL(src/main/resources/features/Smoke.feature:203)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageDefinition.iVerifyTheCopyFeaturesAsURL()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 206,
  "name": "To Validate the Clear Option",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-clear-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 207,
  "name": "I Validate the Clear control option",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheClearControlOption()"
});
formatter.result({
  "duration": 6738051500,
  "error_message": "org.openqa.selenium.WebDriverException: element click intercepted: Element \u003cbutton title\u003d\"Clear Controls\" class\u003d\"fas fa-times\" style\u003d\"font-size: 1.5em;\"\u003e\u003c/button\u003e is not clickable at point (549, 112). Other element would receive the click: \u003cdiv class\u003d\"cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.12 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56217}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir12412_1425028289}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 76c52c699513c3d506c81e2f3d775e64\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor16.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.verifyClearControl(HomePageImplementation.java:1518)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iValidateTheClearControlOption(HomePageDefinition.java:528)\r\n\tat ✽.Given I Validate the Clear control option(src/main/resources/features/Smoke.feature:207)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 209,
      "value": "# Scenario:  To Validate the Print"
    },
    {
      "line": 210,
      "value": "#   Given   I Validate the Print is displayed and Clickable"
    }
  ],
  "line": 212,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 213,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 1222445900,
  "error_message": "org.openqa.selenium.WebDriverException: element click intercepted: Element \u003ca _ngcontent-ng-c2408375086\u003d\"\" mattooltipclass\u003d\"header-icon-tooltip\" class\u003d\"mat-mdc-tooltip-trigger toolbar-button ng-star-inserted\" aria-describedby\u003d\"cdk-describedby-message-ng-1-15\" cdk-describedby-host\u003d\"ng-1\"\u003e...\u003c/a\u003e is not clickable at point (984, 44). Other element would receive the click: \u003cdiv class\u003d\"cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.13 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56217}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir12412_1425028289}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 76c52c699513c3d506c81e2f3d775e64\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor16.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.logoutTabValidation(HomePageImplementation.java:379)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyLogOutIcon(HomePageDefinition.java:88)\r\n\tat ✽.Given I Log out(src/main/resources/features/Smoke.feature:213)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 216,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 217,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 218,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 219,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 220,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 221,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 221,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 217,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 218,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3389421900,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31233086800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 223,
      "value": "#Scenario: To Validate the Zoom to Location"
    },
    {
      "line": 224,
      "value": "#  Given   I validate the Zoom to Location"
    }
  ],
  "line": 226,
  "name": "To Validate the Previous View and Next View",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-previous-view-and-next-view",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 227,
  "name": "I Validate the Previous View",
  "keyword": "Given "
});
formatter.step({
  "line": 228,
  "name": "I Validate the Next View",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iValidateThePreviousView()"
});
formatter.result({
  "duration": 17809179400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheNextView()"
});
formatter.result({
  "duration": 17787161100,
  "status": "passed"
});
formatter.scenario({
  "line": 231,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 232,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2330139600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 235,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 236,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 237,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 238,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 239,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 240,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 240,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 236,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 237,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3439159900,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31047333200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 242,
  "name": "To Validate the Set Master Circuit on Fibers",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-set-master-circuit-on-fibers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 243,
  "name": "I Enter the \u003cID\u003e for the Entity",
  "keyword": "When "
});
formatter.step({
  "line": 244,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "Then "
});
formatter.step({
  "line": 245,
  "name": "I validate the Jobs Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 246,
  "name": "I Search for the \u003cJob\u003e in the Search Box and select the job",
  "keyword": "Then "
});
formatter.step({
  "line": 247,
  "name": "I navigate to Trace tab and select one of the trace",
  "keyword": "Then "
});
formatter.step({
  "line": 248,
  "name": "I Click on the Master Circuit Button",
  "keyword": "And "
});
formatter.step({
  "line": 249,
  "name": "I Validate the Master Circuit Panel and Create a Master Circuit",
  "keyword": "Then "
});
formatter.examples({
  "line": 251,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-set-master-circuit-on-fibers;",
  "rows": [
    {
      "cells": [
        "ID",
        "Job"
      ],
      "line": 252,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-set-master-circuit-on-fibers;;1"
    },
    {
      "cells": [
        "PLEC13144915",
        "Master Circuit"
      ],
      "line": 253,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-set-master-circuit-on-fibers;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 253,
  "name": "To Validate the Set Master Circuit on Fibers",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-set-master-circuit-on-fibers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 243,
  "name": "I Enter the PLEC13144915 for the Entity",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 244,
  "name": "I validate the Title of the Entity Selected",
  "keyword": "Then "
});
formatter.step({
  "line": 245,
  "name": "I validate the Jobs Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 246,
  "name": "I Search for the Master Circuit in the Search Box and select the job",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 247,
  "name": "I navigate to Trace tab and select one of the trace",
  "keyword": "Then "
});
formatter.step({
  "line": 248,
  "name": "I Click on the Master Circuit Button",
  "keyword": "And "
});
formatter.step({
  "line": 249,
  "name": "I Validate the Master Circuit Panel and Create a Master Circuit",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "PLEC13144915",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29427739900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelected()"
});
formatter.result({
  "duration": 14326279500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheJobsInTab()"
});
formatter.result({
  "duration": 5774363300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Master Circuit",
      "offset": 17
    }
  ],
  "location": "HomePageDefinition.iSearchForTheJobInTheSearchBoxAndSelectTheJob(String)"
});
formatter.result({
  "duration": 11977376800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToTraceTab()"
});
formatter.result({
  "duration": 5993885200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnTheMasterCircuitButton()"
});
formatter.result({
  "duration": 11956011700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheMasterCircuitPanelAndCreateAMasterCircuit()"
});
formatter.result({
  "duration": 8900299200,
  "status": "passed"
});
formatter.scenario({
  "line": 256,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 257,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2352156200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 259,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 260,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 261,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 262,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 263,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 264,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 264,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 260,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 261,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3500391000,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31130948200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 266,
  "name": "To Validate the OSM and GOOGLE Place",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-osm-and-google-place",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 267,
  "name": "I Enter the \u003cID\u003e for the Entity",
  "keyword": "When "
});
formatter.step({
  "line": 268,
  "name": "I validate the Title of the Entity Selected for OSM and Google Place",
  "keyword": "Then "
});
formatter.examples({
  "line": 270,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-osm-and-google-place;",
  "rows": [
    {
      "cells": [
        "ID"
      ],
      "line": 271,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-osm-and-google-place;;1"
    },
    {
      "cells": [
        "652 Yates St, Victoria, BC V8W 1L3, Canada"
      ],
      "line": 272,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-osm-and-google-place;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 272,
  "name": "To Validate the OSM and GOOGLE Place",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-osm-and-google-place;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 267,
  "name": "I Enter the 652 Yates St, Victoria, BC V8W 1L3, Canada for the Entity",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 268,
  "name": "I validate the Title of the Entity Selected for OSM and Google Place",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "652 Yates St, Victoria, BC V8W 1L3, Canada",
      "offset": 12
    }
  ],
  "location": "HomePageDefinition.iEnterTheIDForTheEntity(String)"
});
formatter.result({
  "duration": 29593938100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iValidateTheTitleOfTheEntitySelectedForOSM()"
});
formatter.result({
  "duration": 9821460500,
  "status": "passed"
});
formatter.scenario({
  "line": 274,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 275,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 2335965800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 277,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 278,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 279,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 280,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 281,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 282,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 282,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 278,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 279,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3334880000,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31174723300,
  "status": "passed"
});
formatter.scenario({
  "line": 284,
  "name": "Validating Theming for Graduated",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;validating-theming-for-graduated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 285,
  "name": "I Navigate to Theming",
  "keyword": "Given "
});
formatter.step({
  "line": 286,
  "name": "I Click on Add Theme",
  "keyword": "Then "
});
formatter.step({
  "line": 287,
  "name": "I Navigate to Graduated",
  "keyword": "And "
});
formatter.step({
  "line": 288,
  "name": "I enter the details for Graduated",
  "keyword": "Then "
});
formatter.step({
  "line": 289,
  "name": "I Click on the Color Bar to select a Color",
  "keyword": "And "
});
formatter.step({
  "line": 290,
  "name": "I Save the Theme",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToTheming()"
});
formatter.result({
  "duration": 26191137300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnAddTheme()"
});
formatter.result({
  "duration": 6773776300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToGraduated()"
});
formatter.result({
  "duration": 4641485600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iEnterTheDetailsForGraduated()"
});
formatter.result({
  "duration": 27078285600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnTheColorBar()"
});
formatter.result({
  "duration": 31009161700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iSaveTheTheme()"
});
formatter.result({
  "duration": 7644379000,
  "status": "passed"
});
formatter.scenario({
  "line": 292,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 293,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 3192472200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 296,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 297,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 298,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 299,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 300,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 301,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 301,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 297,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 298,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3361370600,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31060623800,
  "status": "passed"
});
formatter.scenario({
  "line": 303,
  "name": "Validating Theming for Graduated(Range)",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;validating-theming-for-graduated(range)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 304,
  "name": "I Navigate to Theming",
  "keyword": "Given "
});
formatter.step({
  "line": 305,
  "name": "I Click on Add Theme",
  "keyword": "Then "
});
formatter.step({
  "line": 306,
  "name": "I Navigate to Graduated Range",
  "keyword": "And "
});
formatter.step({
  "line": 307,
  "name": "I enter the details for Graduated Range",
  "keyword": "Then "
});
formatter.step({
  "line": 308,
  "name": "I Click on the Color Bar to select a Color",
  "keyword": "And "
});
formatter.step({
  "line": 309,
  "name": "I Add Min Max and Steps for Graduated Range",
  "keyword": "And "
});
formatter.step({
  "line": 310,
  "name": "I Save the Theme",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToTheming()"
});
formatter.result({
  "duration": 26183731700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnAddTheme()"
});
formatter.result({
  "duration": 6786217700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToGraduatedRange()"
});
formatter.result({
  "duration": 4608904100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iEnterDetailsForGraduatedRange()"
});
formatter.result({
  "duration": 17454304100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnTheColorBar()"
});
formatter.result({
  "duration": 30974542000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.addMinMaxStepsForGraduatedRange()"
});
formatter.result({
  "duration": 32072105000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id,\"mat-tab-content\")]/div/div[2]/button\"}\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.19 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56440}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir5732_962739220}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 5ef674a0bf69979bc95df39fc9e52444\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id,\"mat-tab-content\")]/div/div[2]/button}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.AddMinMax(HomePageImplementation.java:2055)\r\n\tat stepDefinition.HomePage.HomePageDefinition.addMinMaxStepsForGraduatedRange(HomePageDefinition.java:731)\r\n\tat ✽.And I Add Min Max and Steps for Graduated Range(src/main/resources/features/Smoke.feature:309)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageDefinition.iSaveTheTheme()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 312,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 313,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 1980877700,
  "error_message": "org.openqa.selenium.WebDriverException: element click intercepted: Element \u003ca _ngcontent-ng-c2408375086\u003d\"\" mattooltipclass\u003d\"header-icon-tooltip\" class\u003d\"mat-mdc-tooltip-trigger toolbar-button ng-star-inserted\" aria-describedby\u003d\"cdk-describedby-message-ng-1-58\" cdk-describedby-host\u003d\"ng-1\"\u003e...\u003c/a\u003e is not clickable at point (984, 44). Other element would receive the click: \u003cdiv class\u003d\"cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.61 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56440}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir5732_962739220}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 5ef674a0bf69979bc95df39fc9e52444\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor16.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.logoutTabValidation(HomePageImplementation.java:379)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyLogOutIcon(HomePageDefinition.java:88)\r\n\tat ✽.Given I Log out(src/main/resources/features/Smoke.feature:313)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 316,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 317,
  "name": "I launch \u003cDB\u003e the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 318,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.examples({
  "line": 319,
  "name": "",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;",
  "rows": [
    {
      "cells": [
        "DB"
      ],
      "line": 320,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;1"
    },
    {
      "cells": [
        "http://10.246.4.94/SHAW90_SO"
      ],
      "line": 321,
      "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 321,
  "name": "To test the Login functionality of SDK",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-test-the-login-functionality-of-sdk;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 317,
  "name": "I launch http://10.246.4.94/SHAW90_SO the Application",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 318,
  "name": "I enter the Credentials",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://10.246.4.94/SHAW90_SO",
      "offset": 9
    }
  ],
  "location": "LoginAuthentication.launch(String)"
});
formatter.result({
  "duration": 3819273600,
  "status": "passed"
});
formatter.match({
  "location": "LoginAuthentication.iEnterTheCredentials()"
});
formatter.result({
  "duration": 31362504200,
  "status": "passed"
});
formatter.scenario({
  "line": 323,
  "name": "Validating Theming for Rules",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;validating-theming-for-rules",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 324,
  "name": "I Navigate to Theming",
  "keyword": "Given "
});
formatter.step({
  "line": 325,
  "name": "I Click on Add Theme",
  "keyword": "Then "
});
formatter.step({
  "line": 326,
  "name": "I Navigate to Rules",
  "keyword": "And "
});
formatter.step({
  "line": 327,
  "name": "I enter the details for Rules",
  "keyword": "Then "
});
formatter.step({
  "line": 328,
  "name": "I Click on Add Rule",
  "keyword": "And "
});
formatter.step({
  "line": 329,
  "name": "I Add a Rule",
  "keyword": "And "
});
formatter.step({
  "line": 330,
  "name": "I Save the Theme",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToTheming()"
});
formatter.result({
  "duration": 26172412900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnAddTheme()"
});
formatter.result({
  "duration": 6774293800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iNavigateToRules()"
});
formatter.result({
  "duration": 3676323000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iEnterTheDetailsForRules()"
});
formatter.result({
  "duration": 8187459000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinition.iClickOnAddRule()"
});
formatter.result({
  "duration": 30109415700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id,\"mat-tab-content\")]/div/div/button/span[1]\"}\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20.10 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56495}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir8492_1177111911}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: fe8306de2045f11b52a4f245550eaf34\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id,\"mat-tab-content\")]/div/div/button/span[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy27.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:49)\r\n\tat com.google.common.collect.Iterators$8.transform(Iterators.java:799)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:362)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:160)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:144)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:572)\r\n\tat stepImplementation.HomePage.HomePageImplementation.ClickAddRule(HomePageImplementation.java:2001)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iClickOnAddRule(HomePageDefinition.java:721)\r\n\tat ✽.And I Click on Add Rule(src/main/resources/features/Smoke.feature:328)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageDefinition.iAddARule()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageDefinition.iSaveTheTheme()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 332,
  "name": "To validate the LogOut icon",
  "description": "",
  "id": "to-validate-the-smoke-tests-for-sdk-application;to-validate-the-logout-icon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 333,
  "name": "I Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageDefinition.iVerifyLogOutIcon()"
});
formatter.result({
  "duration": 1986586900,
  "error_message": "org.openqa.selenium.WebDriverException: element click intercepted: Element \u003ca _ngcontent-ng-c2408375086\u003d\"\" mattooltipclass\u003d\"header-icon-tooltip\" class\u003d\"mat-mdc-tooltip-trigger toolbar-button ng-star-inserted\" aria-describedby\u003d\"cdk-describedby-message-ng-1-58\" cdk-describedby-host\u003d\"ng-1\"\u003e...\u003c/a\u003e is not clickable at point (984, 44). Other element would receive the click: \u003cdiv class\u003d\"cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d127.0.6533.120)\n  (Driver info: chromedriver\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}),platform\u003dWindows NT 10.0.19045 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.65 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027AU-MELOCIQACL3\u0027, ip: \u002710.246.4.96\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56495}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, fedcm:accounts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d127.0.6533.72 (9755e24ca85aa18ffa16c743f660a3d914902775-refs/branch-heads/6533@{#1760}), userDataDir\u003dC:\\WINDOWS\\SystemTemp\\scoped_dir8492_1177111911}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d127.0.6533.120, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, webauthn:extension:minPinLength\u003dtrue, webauthn:extension:prf\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: fe8306de2045f11b52a4f245550eaf34\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor16.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy27.click(Unknown Source)\r\n\tat stepPage.HomePage.HomePage.clickToolElement(HomePage.java:948)\r\n\tat stepImplementation.HomePage.HomePageImplementation.logoutTabValidation(HomePageImplementation.java:379)\r\n\tat stepDefinition.HomePage.HomePageDefinition.iVerifyLogOutIcon(HomePageDefinition.java:88)\r\n\tat ✽.Given I Log out(src/main/resources/features/Smoke.feature:333)\r\n",
  "status": "failed"
});
});