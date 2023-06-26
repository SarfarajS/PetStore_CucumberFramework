Feature: Registration

  Scenario: creat an account
    Given user shold be on home page
    When user click on sign button
    And user click on Register Now button
    And user enters User Id as "Sarfaraj"
    And user enters new password as "Admin@123"
    And user enters repeat password as "Admin@123"
    And user enters First name as "Sarfaraj"
    And user enters Last name as "Sayyad"
    And user enters email as "sarfarajsayyad@gmail.com"
    And user enters phone as "1234567890"
    And user enters address1 as "Latur"
    And user enters address2 as "Pune"
    And user enters city as "Pune"
    And user enters state as "Maharastra"
    And user enters zip as "413211"
    And user enters country as "India"
    And user clicks on Enable MyList checkbox
    And user clicks on Enable MyBanner checkbox
    And user clicks on save account information
    Then user should on home page
