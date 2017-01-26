Feature: Test that the Admin user has the Admin menu items available

  Formula:


  Scenario: Admin menu exists

    Given I am signed in as an admin
    When I look at my menu options
    Then the ADMINISTRATION menu title exists
      And View Application Values link exists
      And Edit Users link exists