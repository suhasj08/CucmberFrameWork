Feature:  Registration functionality

Scenario: User creates an account with mandatory fields
Given User navigates Register Account page
When User enters the below fields
|firtName|Suhas|
|lastName|J|
|email|suhassubbu21@gmail.com|
|telephone|123456789|
|password|123456|
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User account should not create without entring the mandatory fields
Given User navigates Register Account page
When User enters the below fields
|firtName|Suhas|
|lastName| |
|email|suhassubbu21@gmail.com|
|telephone|123456789|
|password|123456|
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully


   