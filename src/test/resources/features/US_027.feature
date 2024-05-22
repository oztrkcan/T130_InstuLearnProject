@kub
Feature: Have a Dashboard page
  Background:
    Given i m on Dashboard with "kubratankisi.org@instulearn.com" email
    When I click financial link on sidebar
  Scenario: TC01_US027:Check a dashboard link on home page
    When I click financial link on sidebar
    Then I can see Sales Report
    Then I can see Financial Summary
    Then I can see Payout
    Then I can see Charge Account
    Then I can see Subscribe

  Scenario: TC02_US027:Check a dashboard link on home page
    When I click Sales link on sidebar
    Then I can see  Sales statistics on page
    And  I select as from date "Oct 2023" and as to date "Oct 2025"
    When I click Show Result

  Scenario: TC03_US027
    When Click on the 'Financial Summary' link
    Then Financial documents list appears on the page

