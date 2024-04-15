Feature: NOP commerece App Login Feature


Scenario Outline: Successfull Application Login Test Sceanrio

Given Launching chrome browser
And User open Test URL "https://admin-demo.nopcommerce.com/login"
When User enters Email as "<email>" and "<password>"
And user clicked on Login btn
Then User lands on Homepage with title "Dashboard / nopCommerce administration"
And Close Browser

Examples:
| email | password |
| admin@yourstore.com | admin |
| admin@yourstore.com111 | admin121 |
