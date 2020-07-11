Feature: AutoSuggestion Select

  Scenario: Verify user selection from autosuggestion appears on Search result page
    Given I am on hotels landing page
    When I enter 'york' in search
    And I select 'Lake George, New York, United States of America' from autosuggestions
    And I click on Search button
    Then I verify search result header is the same as text selected from auto suggestion
    And I verify text under 'Destination, property, or landmark' as text selected from auto suggestion


  Scenario: Verify the cheapest available hotel is less than $100
    Given I am on hotels landing page
    When I enter 'york' in search
    And I select 'Lake George, New York, United States of America' from autosuggestions
    And I click on Search button
    And I hover over Sort By Price and click Low to High
    Then I verify the cheapest hotel is less than $'100'


