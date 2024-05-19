@can
Feature: US_008 As a visitor, I want there to be a section in the body section of the homepage where I can perform my membership transactions.

  Background:

    Given I am on Home Page as a visitor


  Scenario Outline: TC_01_US_008: Test of displaying membership transactions in the body section of the homepage

    Given visitor tests for the "Subscribe Now!" text visibility displayed in the body section
    And displays the "<subscriptionOptions>" subscription option under Subscribe Now! menu

    Examples:
      | subscriptionOptions |
      | Bronze |
      | Gold |
      | Silver |




