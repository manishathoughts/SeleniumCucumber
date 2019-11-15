$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Searching the vegetables from the greekart web application",
  "description": "",
  "id": "searching-the-vegetables-from-the-greekart-web-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "searching the particular item and proceed to checkout",
  "description": "",
  "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Selenium-test1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "search for the \u003cName\u003e item",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "adding items to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "performs proceed to checkout for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify \u003cName\u003e is populated",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;",
  "rows": [
    {
      "cells": [
        "Name"
      ],
      "line": 17,
      "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;;1"
    },
    {
      "cells": [
        "Brinjal"
      ],
      "line": 18,
      "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;;2"
    },
    {
      "cells": [
        "Beetroot"
      ],
      "line": 19,
      "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "searching the particular item and proceed to checkout",
  "description": "",
  "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Selenium-test1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "search for the Brinjal item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "adding items to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "performs proceed to checkout for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify Brinjal is populated",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 6543585100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 15
    }
  ],
  "location": "MyStepDefinitions.search_for_the_item(String)"
});
formatter.result({
  "duration": 3516743400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.adding_items_to_the_cart()"
});
formatter.result({
  "duration": 13345931400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.performs_proceed_to_checkout_for_purchase()"
});
formatter.result({
  "duration": 5082549100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 7
    }
  ],
  "location": "MyStepDefinitions.verify_is_populated(String)"
});
formatter.result({
  "duration": 63353300,
  "status": "passed"
});
formatter.after({
  "duration": 2330435700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "searching the particular item and proceed to checkout",
  "description": "",
  "id": "searching-the-vegetables-from-the-greekart-web-application;searching-the-particular-item-and-proceed-to-checkout;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Selenium-test1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "search for the Beetroot item",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "adding items to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "performs proceed to checkout for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify Beetroot is populated",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 4834635800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beetroot",
      "offset": 15
    }
  ],
  "location": "MyStepDefinitions.search_for_the_item(String)"
});
formatter.result({
  "duration": 3406865300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.adding_items_to_the_cart()"
});
formatter.result({
  "duration": 13357606800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.performs_proceed_to_checkout_for_purchase()"
});
formatter.result({
  "duration": 5105735200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beetroot",
      "offset": 7
    }
  ],
  "location": "MyStepDefinitions.verify_is_populated(String)"
});
formatter.result({
  "duration": 73575100,
  "status": "passed"
});
formatter.after({
  "duration": 77549500,
  "status": "passed"
});
});