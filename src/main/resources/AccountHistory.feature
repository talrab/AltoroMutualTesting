Feature: Test the Account History page

  Formula:


  Scenario: Account number is displayed in the header

    Given I am signed in
    When I choose account 1001160141 Savings
    Then the account history page header should display 1001160141