Feature: SignIn

Scenario: SignIn with valid credentials
Given user should be on sign in page
When user click on sign in button
And user enters username as "Sarfaraj" and password as "Admin@123"
And user click on login button
Then user name should appear at left corner of the page as "Welcome Sarfaraj!"
