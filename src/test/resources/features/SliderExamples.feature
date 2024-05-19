@mua
Feature:  bisey dene
    Scenario Outline:  bakalim
      Given I am on Home Page as a visitor
      And I scroll the Newest Course Cards On Home Page
      Then  I click "<name>" one of the newest course
      Examples:
      |     name    |
      |     Cyber Security    |
      |     kurscu  |