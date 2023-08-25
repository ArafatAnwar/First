Feature: Validate Ebay search

Scenario Outline: Validate Ebay search

Given user visit Ebay home
When user type "<phone>" and click search 
Then User should able to see the expected phone

Examples:
|phone| 
| iphone 12 promax |
	