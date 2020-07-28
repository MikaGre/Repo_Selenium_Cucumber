Feature: Temp Summary

  @sky
  Scenario: Verify the temp value changes as per temp unit selected by user
    Given I am on darksky landing page
    Then I verify feelsLike, low and high temp values are displayed
    When I select ˚C, mph temp unit from dropdown
    Then I verify feelsLike, low and high temp values changed as per unit selected
