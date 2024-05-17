
Feature: I can review and purchase products on the Home Page
  Background:
    Given I am on Home Page as a visitor
@mua
  Scenario: TC_01_US_007: I can see Store Products title in the Home Page
    Then I see the title of the Store Products and Slider on the Home Page
    Then I see  price, like score, add to cart icon on product cards on the Home Page

