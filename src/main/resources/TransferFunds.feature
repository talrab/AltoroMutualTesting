Feature: Transfer Funds

  Formula:


  Scenario: Transfer Funds return a correct result statement

    Given I am signed in
    And I go to the Transfer Funds link
    When I choose to transfer 100$ from the 1001160141 account to the 1001160140
    Then I get a message saying $100 was successfully transferred from Account 1001160141 into Account 1001160140 at the current date