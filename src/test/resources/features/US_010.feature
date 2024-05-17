@arzu
Feature: Viewing the episode "Join us as an Instructor and start teaching"

  Background:
    Given I am on Home Page as a visitor

    Scenario: TC_01_US_010:The "As instructor and start teaching" section must be visible and active
      Then verify Join as instructor section  is visible in the body section
      When Click on the Join as instructor section
      Then Verifies accessed the login page in the Home Page
