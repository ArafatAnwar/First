Feature: USPS Registration

Scenario Outline: User should be able to create account

Given User visiti USPS home page
When User click on register
When User click on Sign up Now
When User Choose language
When User insert valid "<User_Name>" , "<pw>" and re-enter "<pw>" 
When User select dropdown first security qus and select second security qus
When User insert first "<Security_ans>" and re-enter "<Security_ans>",insert second "<security_ans2>" and re-enter "<security_ans2>"
When User select Radio button Personal account 
When User select dropdown button 
When User insert "<First_Name>", "<Last_Name>" ,"<Email>", re-enter "<Email>"
When User select type US 
When User insert "<Phone_Number>"
When User select form dropdown United States
When User insert "<Street_add>", "<City>"
When User select form dropdown state
When User click Verify address
Then User should create a new account

Examples: 
|User_Name|pw|Security_ans|security_ans2|First_Name|Last_Name|Email|Phone_Number|Street_add|City|
|arafat.anwar999999|Arafat12345|dhaka|major|Arafat|Anwar|arafat.anwarus99@gmail.com|5714198870|1338 autumn trl|Lewisville|

