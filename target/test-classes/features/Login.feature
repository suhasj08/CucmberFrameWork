Feature: Login functionality

Scenario: Login with valid credentials
Given : User navigate to login page
When User has entered valid email address "suhassubbu12@gmail.com" into email field
And User has entered valid password "suhas@123" into password field
And User clicks on Login button
Then user should not get successfully logged in

Scenario: Login with invalid credentials
Given : User navigate to login page
When User has entered invalid email address "suhassubbu12@gmail" into email field
And User has entered invalid password "su1237" into password field
And User clicks on Login button
Then user should get warning message

Scenario: Login with valid email and invalid password
Given : User navigate to login page
When User has entered invalid email address "suhassubbu12@gmail.com" into email field
And User has entered invalid password "suhas@123" into password field
And User clicks on Login button
Then user should get warning message

