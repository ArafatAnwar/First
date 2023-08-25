Feature: Buy stams

Scenario Outline: User should be able to buy stams

Given User visit USPS page
When User click on Stamps & Supplies, click on Desire stamps and click on Add to cart and click Check Out Now
When User click heck Out as Guest
When User insert "<First_Name>", "<Last_Name>", "<Phone>", "<Email>"
When User check mark same as above box
When User insert "<Address>", "<City>", Select state from dropdown and "<Zip>"
When User click Check Out Now
Then User should be able to check out


Examples: 

|First_Name|Last_Name|Phone|Email|Address|City|Zip|
|Arafat|Anwar|5714198870|arafat.anwar99@gmail.com|1338 Autumn Trl|Lewisville|75067|
