$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountHistory.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Account History page",
  "description": "\r\nFormula:",
  "id": "test-the-account-history-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4279962736,
  "status": "passed"
});
formatter.before({
  "duration": 4032749545,
  "status": "passed"
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
  "duration": 3231422208,
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
  "duration": 945504555,
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
  "duration": 46968743,
  "status": "passed"
});
formatter.after({
  "duration": 1435615558,
  "status": "passed"
});
formatter.after({
  "duration": 1329727815,
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
formatter.before({
  "duration": 3912455514,
  "status": "passed"
});
formatter.before({
  "duration": 3965540857,
  "status": "passed"
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
  "duration": 4306182235,
  "status": "passed"
});
formatter.match({
  "location": "AdminUserOptionsDefs.i_look_at_my_menu_options()"
});
formatter.result({
  "duration": 38495,
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
  "duration": 57113545,
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
  "duration": 65844781,
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
  "duration": 57486570,
  "status": "passed"
});
formatter.after({
  "duration": 1302237569,
  "status": "passed"
});
formatter.after({
  "duration": 1354512576,
  "status": "passed"
});
});