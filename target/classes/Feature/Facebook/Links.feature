Feature: Checking Links

  Scenario: Verify Terms link takes goes to correct web page
    Given I am on Facebook landing Page
    When I click on Terms link
    Then I verify user is on 'Terms of Service' page title
    And I verify facebook landing page is open


  Scenario: Verify Data Policy link takes goes to correct web page
    Given I am on Facebook landing Page
    When I click on Data Policy link
    Then I verify user is on 'Data Policy' page title
    And I verify facebook landing page is open


  Scenario: Verify Cookie Policy link takes goes to correct web page
    Given I am on Facebook landing Page
    When I click on Cookie Policy link
    Then I verify user is on 'Cookie Policy' page title
    And I verify facebook landing page is open
