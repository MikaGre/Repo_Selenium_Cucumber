Feature: Destination Selection

  Scenario:Verify amount of days displays from check in/out is accurate
    Given I am on hotels landing page
      And I close the popup window
      And I enter 'Letter' in search
      And I select 'Letterkenny, Donegal (county), Ireland' from autosuggestions
      And I enter check in '07/20/20' and check out '08/15/20'
    Then I verify the days icon is accurate



