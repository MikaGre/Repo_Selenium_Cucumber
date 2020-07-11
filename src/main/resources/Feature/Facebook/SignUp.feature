Feature: Sign Up feature

  Scenario Outline: Verify Signup error message
    Given I am on Facebook landing Page
    And I enter '<firstName>' as First name
      And I enter '<lastName>' as Last name
      And I enter '<email>' as email
      And I enter '<password>' for password
      And I select '<gender>' for Gender
      And I select '10.12.1967' for birthday
    Then I press the sign up button

    Examples:
      | firstName | lastName | email                 | password    | gender |
      | Test      | test     | tttest@aol.com        | password123 | female |
      | Jimmy     | Dirt     | !!!!4897564@gmail.com | coolcool654 | male   |
      | Absoil    | Baddman  | tNNNt@unknow.com      | !@#$%*&^*&  | custom |