Feature: Validate Amazon Clinic

@bestseller
Scenario: Validate Amazon Clinic

Given user visits Amazon page
When user clicks on Clinic icon
Then user should be able to redirect to the Clinic 
