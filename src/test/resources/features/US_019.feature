@kub
Feature: Have a Dashboard page
  Scenario: Check a dashboard link on home page
    Given i m on Homepage as "teacher" with "kubra" email
    And   i click My Profile icon on Header
    When  I click dashboard link on home page
    Then  I access dashboard page
    Then  The Enable offline status button appears
    Then  Activate offline status button is active is verified
    And  deneme