Feature: Yahoo login validation
Scenario Outline: user can login gmail

Given user visit Yahoo home page
When user insert "<email>" and click next 
Then user should redirect to the next 
When user insert valid "<pw>" and click next button
Then user should be login

Examples:
| email|pw|
|arafat.anwar2023@yahoo.com | Alishba12345|