Feature: Searching the vegetables from the greekart web application

@Selenium-test
Scenario: searching the particular item from the list of items
Given User is on Greenkart landing page
When search for the Cucumber item
Then "Cucumber" is populated
@Selenium-test1
Scenario Outline: searching the particular item and proceed to checkout
Given User is on Greenkart landing page
When search for the <Name> item
And adding items to the cart
And performs proceed to checkout for purchase
Then verify <Name> is populated

Examples:
|Name    |
|Brinjal |
|Beetroot|

