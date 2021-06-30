$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/TestSuite.feature");
formatter.feature({
  "line": 1,
  "name": "Test Suite",
  "description": "As a user I should be able to add product to cart on nopcommerce website",
  "id": "test-suite",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11450069400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Should Add product to shopping cart successfully",
  "description": "",
  "id": "test-suite;user-should-add-product-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I hoover on computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on Desktop Link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select sort by option A to Z",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Build Your own computer Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should navigate to Build You Own Computer Page \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select two.two processor",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Select eight GB Ram",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select four hundred GB HDD",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I Select Vista Home OS",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select Total Commander software",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I check the price \"$1,475.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on Add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should be able to add product successfully \"The product has been added to your shopping cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on alert message",
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 245851400,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iHooverOnComputerTab()"
});
formatter.result({
  "duration": 415660300,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iClickOnDesktopLink()"
});
formatter.result({
  "duration": 1637952000,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectSortByOptionAToZ()"
});
formatter.result({
  "duration": 369811500,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iClickOnBuildYourOwnComputerAddToCartButton()"
});
formatter.result({
  "duration": 2145950000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 50
    }
  ],
  "location": "TestSuiteStepdefs.iShouldNavigateToBuildYouOwnComputerPage(String)"
});
formatter.result({
  "duration": 3076966700,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectTwoTwoProcessor()"
});
formatter.result({
  "duration": 234818800,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectEightGBRam()"
});
formatter.result({
  "duration": 331708200,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectFourHundredGBHDD()"
});
formatter.result({
  "duration": 320417800,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectVistaHomeOS()"
});
formatter.result({
  "duration": 152404400,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iSelectTotalCommanderSoftware()"
});
formatter.result({
  "duration": 173327400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,475.00",
      "offset": 19
    }
  ],
  "location": "TestSuiteStepdefs.iCheckThePrice(String)"
});
formatter.result({
  "duration": 2099889300,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 163840600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 46
    }
  ],
  "location": "TestSuiteStepdefs.iShouldBeAbleToAddProductSuccessfully(String)"
});
formatter.result({
  "duration": 2090398600,
  "status": "passed"
});
formatter.match({
  "location": "TestSuiteStepdefs.iClickOnAlertMessage()"
});
formatter.result({
  "duration": 125503700,
  "status": "passed"
});
});