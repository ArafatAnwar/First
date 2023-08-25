Feature: USPS login validation
Scenario Outline: user can login USPS

Given user visit USPS home page
When user click on signin
When user insert valid "<username>" and  valid "<password>" and click next 
Then user should be log in

Examples:
| username | password |
| Arafat99999 | Arafat12345 |