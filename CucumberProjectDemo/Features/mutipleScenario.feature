Feature: FeedBack feature functionality

Scenario: verification of Feedback form functionality
Given User launches the chrome browser
And navigates to example.com
When user clicks on feedback form
And feedback form opens
And user fills the feedback form
And user clicks on submit button
Then Feedback form is submitted  successfully

Scenario: verification of Feedback Ratings functionality
Given User launches the chrome browser
And navigates to example.com
When Open the feedback Ratings
And Feedback ratings provided by user
Then The feedback ratings are submitted successfully