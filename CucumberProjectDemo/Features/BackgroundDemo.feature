
Feature: Check home page functionality

Background: User is Logged In
Given User launches the ff browser
When User enters the Usrname and PassWrd
And Clicks Login Btn
Then User is navigated to App Home Page

Scenario: Check Add to Cart Link
When user clicks on Add to Cart Link
Then Add to cart module is displayed

Scenario: Check Logout link
When User clicks on Logout link
Then User lands on LoginPage


