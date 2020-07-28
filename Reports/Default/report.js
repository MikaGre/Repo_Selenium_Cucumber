$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hotels/Calendar.feature");
formatter.feature({
  "line": 1,
  "name": "Calendar",
  "description": "",
  "id": "calendar",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify user can select date from any month",
  "description": "",
  "id": "calendar;verify-user-can-select-date-from-any-month",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Cal"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter \u003ccheckIn\u003e as check in",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \u003cdays\u003e days from check in date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify \u003cdays\u003e count on the briefcase",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "calendar;verify-user-can-select-date-from-any-month;",
  "rows": [
    {
      "cells": [
        "checkIn",
        "days"
      ],
      "line": 18,
      "id": "calendar;verify-user-can-select-date-from-any-month;;1"
    },
    {
      "cells": [
        "October 20",
        "11"
      ],
      "line": 19,
      "id": "calendar;verify-user-can-select-date-from-any-month;;2"
    },
    {
      "cells": [
        "September 10",
        "20"
      ],
      "line": 20,
      "id": "calendar;verify-user-can-select-date-from-any-month;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelSearchSD.i_am_on_hotels_landing_page()"
});
formatter.result({
  "duration": 7807074954,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify user can select date from any month",
  "description": "",
  "id": "calendar;verify-user-can-select-date-from-any-month;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Cal"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter October 20 as check in",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter 11 days from check in date",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify 11 count on the briefcase",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "October 20",
      "offset": 8
    }
  ],
  "location": "CalenderSD.iEnterCheckInAsCheckIn(String)"
});
formatter.result({
  "duration": 3334356793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 8
    }
  ],
  "location": "CalenderSD.iEnterDaysDaysFromCheckInDate(int)"
});
formatter.result({
  "duration": 2671290462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 9
    }
  ],
  "location": "CalenderSD.iVerifyCountOnTheBriefcase(String)"
});
formatter.result({
  "duration": 54033439,
  "status": "passed"
});
formatter.after({
  "duration": 259876588,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelSearchSD.i_am_on_hotels_landing_page()"
});
formatter.result({
  "duration": 5301626866,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify user can select date from any month",
  "description": "",
  "id": "calendar;verify-user-can-select-date-from-any-month;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Cal"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter September 10 as check in",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter 20 days from check in date",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify 20 count on the briefcase",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "September 10",
      "offset": 8
    }
  ],
  "location": "CalenderSD.iEnterCheckInAsCheckIn(String)"
});
formatter.result({
  "duration": 2538842690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 8
    }
  ],
  "location": "CalenderSD.iEnterDaysDaysFromCheckInDate(int)"
});
formatter.result({
  "duration": 3113889730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 9
    }
  ],
  "location": "CalenderSD.iVerifyCountOnTheBriefcase(String)"
});
formatter.result({
  "duration": 69040175,
  "status": "passed"
});
formatter.after({
  "duration": 240756984,
  "status": "passed"
});
});