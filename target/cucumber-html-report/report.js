$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountHistory.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Account History page",
  "description": "\r\nFormula:",
  "id": "test-the-account-history-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Account number is displayed in the header",
  "description": "",
  "id": "test-the-account-history-page;account-number-is-displayed-in-the-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am signed in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I choose account 1001160141 Savings",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the account history page header should display 1001160141",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountHistoryDefs.i_am_signed_in()"
});
formatter.result({
  "duration": 7654613627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1001160141 Savings",
      "offset": 17
    }
  ],
  "location": "AccountHistoryDefs.i_choose_account(String)"
});
formatter.result({
  "duration": 907300539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1001160141",
      "offset": 47
    }
  ],
  "location": "AccountHistoryDefs.the_account_history_page_header_should_display(String)"
});
formatter.result({
  "duration": 1595055213,
  "status": "passed"
});
formatter.uri("AdminUserOptions.feature");
formatter.feature({
  "line": 1,
  "name": "Test that the Admin user has the Admin menu items available",
  "description": "\r\nFormula:",
  "id": "test-that-the-admin-user-has-the-admin-menu-items-available",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Admin menu exists",
  "description": "",
  "id": "test-that-the-admin-user-has-the-admin-menu-items-available;admin-menu-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am signed in as an admin",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I look at my menu options",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the ADMINISTRATION menu title exists",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "View Application Values link exists",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Edit Users link exists",
  "keyword": "And "
});
formatter.match({
  "location": "AdminUserOptionsDefs.i_am_signed_in_as_an_admin()"
});
formatter.result({
  "duration": 6844436489,
  "status": "passed"
});
formatter.match({
  "location": "AdminUserOptionsDefs.i_look_at_my_menu_options()"
});
formatter.result({
  "duration": 27717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADMINISTRATION",
      "offset": 4
    }
  ],
  "location": "AdminUserOptionsDefs.the_ADMINISTRATION_menu_title_exists(String)"
});
formatter.result({
  "duration": 49241536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "View Application Values",
      "offset": 0
    }
  ],
  "location": "AdminUserOptionsDefs.view_Application_Values_link_exists(String)"
});
formatter.result({
  "duration": 53662781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Users",
      "offset": 0
    }
  ],
  "location": "AdminUserOptionsDefs.edit_Users_link_exists(String)"
});
formatter.result({
  "duration": 1387319479,
  "status": "passed"
});
formatter.uri("Survey.feature");
formatter.feature({
  "line": 1,
  "name": "The 8gb ipod Survey works fine",
  "description": "\r\nFormula:",
  "id": "the-8gb-ipod-survey-works-fine",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "At the end of the survey I can enter my email.",
  "description": "",
  "id": "the-8gb-ipod-survey-works-fine;at-the-end-of-the-survey-i-can-enter-my-email.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I go threw the survey all to the end and enter my email@email.com and submit",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the email@email.com is presented to me",
  "keyword": "Then "
});
formatter.match({
  "location": "SurveyDefs.i_am_in_the_home_page()"
});
formatter.result({
  "duration": 5685023011,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email@email.com",
      "offset": 50
    }
  ],
  "location": "SurveyDefs.i_go_threw_the_survey_all_to_the_end_and_enter_my_email_email_com_and_submit(String)"
});
formatter.result({
  "duration": 2141222666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email@email.com",
      "offset": 4
    }
  ],
  "location": "SurveyDefs.the_email_email_com_is_presented_to_me(String)"
});
formatter.result({
  "duration": 1403501580,
  "status": "passed"
});
});