$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sri74/Downloads/Flipkart/Flipkart/src/main/java/Feature/Filpkart.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Website Feature",
  "description": "",
  "id": "flipkart-website-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6418395700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User Add product in cart Scenario",
  "description": "",
  "id": "flipkart-website-feature;user-add-product-in-cart-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Application  Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User mousehover on username in menubar",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on orders",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User extract last placed order in flipkart",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Application_Page()"
});
formatter.result({
  "duration": 610276900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.login()"
});
formatter.result({
  "duration": 483353600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.mousehover()"
});
formatter.result({
  "duration": 1850441300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.orders()"
});
formatter.result({
  "duration": 1901842800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.extract()"
});
formatter.result({
  "duration": 402815200,
  "status": "passed"
});
formatter.after({
  "duration": 482912100,
  "status": "passed"
});
});