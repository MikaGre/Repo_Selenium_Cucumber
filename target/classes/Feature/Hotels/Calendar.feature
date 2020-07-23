Feature: Calendar

  Background:
    Given I am on hotels landing page

  Scenario: Verify user can select date from Calendar
    When I enter tomorrow as check in
    And I enter 9 days from 'tomorrow' as checkout
    Then I verify 9 count on the briefcase

  Scenario Outline: Verify user can select date from any month
    When I enter <checkIn> as check in
    And I enter <days> days from check in date
    Then I verify <days> count on the briefcase

    Examples:
      | checkIn      | days |
      | October 20   | 11   |
      | September 10 | 20   |