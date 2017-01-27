Feature: The 8gb ipod Survey works fine

  Formula:


  Scenario: At the end of the survey I can enter my email.

    Given I am in the home page
    When I go threw the survey all to the end and enter my email@email.com and submit
    Then the email@email.com is presented to me


  Scenario: When skipping a step an error is displayed.

    Given I am in the home page
    When I skip a step in the middle
    Then a Request Out of Order appears