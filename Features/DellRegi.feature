Feature: Dell registration

Scenario Outline: user should create user account

Given user visit Dell 
When user hover sign in and click Create an account
When user type "<Fn>", "<Ln>", "<email>", "<pw>" and click Create account
Then user should be able to create new account

Examples:

|Fn|Ln|email|pw|
|Arafat|Anwar|arafat.anwar99@gmail.com|Arafat12345|