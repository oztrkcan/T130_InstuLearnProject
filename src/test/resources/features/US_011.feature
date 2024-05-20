@batuhan
Feature: Display an area related to points on the home page.
  Background:
    Given I am on Home Page as a visitor

  Scenario: TC_01_US_011: Displaying the Earn Club Points area on the home page.
    Then I should see the Earn Club Points On Home Page

  Scenario: TC_02_US_011: The Rewards button is displayed and active on the home page.
    Then I should see the Rewards Button On Home Page And Click

  Scenario: TC_03_US_011: The Points Club Button is displayed on the home page.
    Then I should see the Points Club Button On Home Page And Click

  Scenario: TC_04_US_011: The Earn Club Points Discount Coupon is displayed on the homepage.
    Then I should see the Discount Coupon On Home Page And Click



