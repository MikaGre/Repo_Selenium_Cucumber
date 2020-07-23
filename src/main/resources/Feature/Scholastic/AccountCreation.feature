Feature: User creates an account

  Scenario Outline: User creates account
    Given User is on Scholastic home page
      And User selects Account icon
      And User Clicks Register
    Then User enters '<firstName>','<lastName>','<email>'
      And User clicks next button
    Then User enters '<password>' and confirms password
      And User clicks on terms Of User check box
    Then User clicks next button

    Examples:
      | firstName | lastName | email                   | password     |
      | Test      | seamore  | seamoreRob.22@gmail.com | goodPass123  |
      | Peace     | pie      | peapie.TestQ2@gmail.com | password1234 |