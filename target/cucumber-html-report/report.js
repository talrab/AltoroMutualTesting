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
  "duration": 10537260292,
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
  "duration": 1166270737,
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
  "duration": 3903424010,
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
