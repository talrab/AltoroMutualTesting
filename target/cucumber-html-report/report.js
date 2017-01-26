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
  "duration": 8353156753,
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
  "duration": 749014218,
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
  "duration": 1679773337,
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
  "duration": 8084068315,
  "status": "passed"
});
formatter.match({
  "location": "AdminUserOptionsDefs.i_look_at_my_menu_options()"
});
formatter.result({
  "duration": 86616,
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
  "duration": 53556917,
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
  "duration": 60443048,
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
  "duration": 1403956215,
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
  "duration": 9565644795,
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
  "duration": 19396766351,
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
  "duration": 1381828436,
  "status": "passed"
});
formatter.uri("TransferFunds.feature");
formatter.feature({
  "line": 1,
  "name": "Transfer Funds",
  "description": "\r\nFormula:",
  "id": "transfer-funds",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Transfer Funds return a correct result statement",
  "description": "",
  "id": "transfer-funds;transfer-funds-return-a-correct-result-statement",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am signed in1",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I go to the Transfer Funds link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose to transfer 100$ from the 1001160141 account to the 1001160140",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I get a message saying $100 was successfully transferred from Account 1001160141 into Account 1001160140 at the current date",
  "keyword": "Then "
});
formatter.match({
  "location": "TransferFundsDefs.i_am_signed_in1()"
});
formatter.result({
  "duration": 9386959158,
  "status": "passed"
});
formatter.match({
  "location": "TransferFundsDefs.i_go_to_the_Transfer_Funds_link()"
});
formatter.result({
  "duration": 846060627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 21
    },
    {
      "val": "1001160141",
      "offset": 35
    },
    {
      "val": "1001160140",
      "offset": 61
    }
  ],
  "location": "TransferFundsDefs.i_choose_to_transfer_$_from_the_account_to_the(String,String,String)"
});
formatter.result({
  "duration": 339968857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 24
    },
    {
      "val": "1001160141",
      "offset": 70
    },
    {
      "val": "1001160140",
      "offset": 94
    }
  ],
  "location": "TransferFundsDefs.i_get_a_message_saying_$_was_successfully_transferred_from_Account_into_Account_at_the_current_date(String,String,String)"
});
formatter.result({
  "duration": 1712149856,
  "status": "passed"
});
});