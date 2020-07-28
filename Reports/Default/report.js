$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky/TempSummary.feature");
formatter.feature({
  "line": 1,
  "name": "Temp Summary",
  "description": "",
  "id": "temp-summary",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the temp value changes as per temp unit selected by user",
  "description": "",
  "id": "temp-summary;verify-the-temp-value-changes-as-per-temp-unit-selected-by-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sky"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on darksky landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify feelsLike, low and high temp values are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select ˚C, mph temp unit from dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I verify feelsLike, low and high temp values changed as per unit selected",
  "keyword": "Then "
});
formatter.match({
  "location": "TempSummarySD.i_am_on_darksky_landing_page()"
});
formatter.result({
  "duration": 9066902613,
  "status": "passed"
});
formatter.match({
  "location": "TempSummarySD.i_verify_feelsLike_low_and_high_temp_values_are_displayed()"
});
formatter.result({
  "duration": 802066971,
  "status": "passed"
});
formatter.match({
  "location": "TempSummarySD.i_select_from_temp_unit_dropdown()"
});
formatter.result({
  "duration": 3985324021,
  "status": "passed"
});
formatter.match({
  "location": "TempSummarySD.i_verify_feelsLike_low_and_high_temp_values_changed_as_per_unit_selected()"
});
formatter.result({
  "duration": 143230589,
  "status": "passed"
});
formatter.after({
  "duration": 194542862,
  "status": "passed"
});
});