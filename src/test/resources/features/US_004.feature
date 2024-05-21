
  Feature: Ability to register successfully

    Background:
      Given I am on Home Page as a visitor

      Scenario: Register link test
        Then Displays the Register link in the home page and clicks.
        Then Verifies that the opened page is the Register page.


    Scenario Outline:Test of not being able to register with an invalid password
      Then Displays the Register link in the home page and clicks.
      And  select "<type>" as a Account Type
      Then Verifies that you cannot be reached with a "<personal>" name "<email>" and "<password>"
      Then Verifies that it is not registered and gets an error message

      Examples:

        |    type         | |    personal       | |  email                              | |   password   |
        |   Student       | |    ahmet          | |  ahmegulmek.teacher@instulearn.com  | |   Learn.2504 |
        |   Instructor    | |    pedsd          | |  validfds                           | |   invaliddf  |
        |   Organization  | |    pedsd          | |  validfds                           | |   invaliddf  |



    @ahmet
    Scenario Outline:
      Then Displays the Register link in the home page and clicks.
      And  select "<type>" as a Account Type
      Then Verifies with valid information register
      Then Verifies that displays "https://qa.instulearn.com/login"
      Examples:
      |type|
      | Student   |



    Scenario:Testing whether it is possible to register without entering information
      Then Displays the Register link in the home page and clicks.
      When Verifies that registration is not done without entering information
      Then Verifies that it is not registered and gets an error message