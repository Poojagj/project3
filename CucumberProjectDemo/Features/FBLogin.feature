
Feature: Facebook Login Feature functionality

Scenario: Verify Facebook Login functionality with Valid credentials

Given The user launches Chrome browser
And User opens Facebook Login Page
When The user enters valid username and valid password
And the user clicks on login btn
Then User lands on Facebook home page
