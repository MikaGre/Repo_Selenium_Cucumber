Feature: Login feature

  Scenario: Verify user error for invalid credentials
    Given I am on Facebook landing Page
    When I enter 'test@gmail.com' as username
    And I enter 'password' as password
    And I click on signin button
    Then I verify invalid credentials error message


  Scenario: Verify login and Signup Buttons are enabled
    Given I am on Facebook landing Page
      Then I verify 'login' button is enabled
        And I verify 'signup' button is enabled




    
