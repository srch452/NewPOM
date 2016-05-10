$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10888477156,
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
  "duration": 415540374,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminEnterUsername()"
});
formatter.result({
  "duration": 103011708,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminEnterPassword()"
});
formatter.result({
  "duration": 47519085,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminClickLoginButton()"
});
formatter.result({
  "duration": 2582577175,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.adminCanEnterEmploymentManagementSystem()"
});
formatter.result({
  "duration": 31574,
  "status": "passed"
});
formatter.after({
  "duration": 17698537,
  "status": "passed"
});
});