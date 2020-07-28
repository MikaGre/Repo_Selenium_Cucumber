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
