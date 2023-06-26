Feature: add to cart

Scenario: Select a product and add item to cart 
Given user should be on sign in page
When user click on sign in button
And user enters username as "Sarfaraj" and password as "Admin@123"
And user click on login button
#Then user name should appear at left corner of the page as "Welcome Sarfaraj!"
And user click on product Fish
And user click on product Id AngelFish
And user click on add to cart button
And user click on proceed to checkout
And user click on continue button
And user click on confirm button
Then user should able to see the message as "Thank you, your order has been submitted."