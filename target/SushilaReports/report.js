$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7806703360,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Admin can login with valid details",
  "description": "",
  "id": "login-feature;admin-can-login-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Admin is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enter username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Admin enter password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Admin click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Admin can enter employment management system",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.adminIsOnTheHomepage()"
});
formatter.result({
  "duration": 377837653,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminEnterUsername()"
});
formatter.result({
  "duration": 113050027,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminEnterPassword()"
});
formatter.result({
  "duration": 61954560,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminClickLoginButton()"
});
formatter.result({
  "duration": 2546982400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminCanEnterEmploymentManagementSystem()"
});
formatter.result({
  "duration": 21333,
  "status": "passed"
});
formatter.after({
  "duration": 16390400,
  "status": "passed"
});
});