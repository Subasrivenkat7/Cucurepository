$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:packagee2/login1.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters \"suba\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user password \"lashd\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.click_login()"
});
formatter.result({
  "status": "passed"
});
});