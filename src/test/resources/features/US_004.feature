
  Feature: Ability to register successfully

    Background:
      Given I am on Home Page as a visitor

      Scenario: Register link test
        Then Displays the Register link in the home page and clicks.
        Then Verifies that the opened page is the Register page.

      Scenario: Register page visual, Register window and Being Register test
        Then Displays the Register link in the home page and clicks.
        Then Displays the image and signup form on the registration page
        When i am register as a "teacher" with "ahmet" email
        Then Verifies that the opened page is the home page

      Scenario:Test of not being able to register with an invalid email
        Then Displays the Register link in the home page and clicks.
        Then Verifies that you cannot be reached with "invalidemail" and "validpassword"
        Then Verifies that it is not registered and gets an error message

      Scenario:Test of not being able to register with an invalid password
         Then Displays the Register link in the home page and clicks.
         Then Verifies that you cannot be reached with "validemail" and "invalidpassword"
         Then Verifies that it is not registered and gets an error message

      Scenario:Test of not being able to register with an invalid password and invalid email
         Then Displays the Register link in the home page and clicks.
         Then Verifies that you cannot be reached with "invalidemail" and "invalidpassword"
         Then Verifies that it is not registered and gets an error message
    @ahmet
      Scenario:Testing whether it is possible to register without entering information
        Then Displays the Register link in the home page and clicks.
        When Verifies that registration is not done without entering information
        Then Verifies that it is not registered and gets an error message