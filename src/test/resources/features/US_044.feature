
Feature: I would like to have an area on the site where I can view and manage my certificates

  Background:
    Given i m on Dashboard as a "student" with "muammer" email
    When i click Certificates Link ond Dashboard Sidebar

  Scenario: TC_01_US_044 'Achivements','Certificate Validation','Completion Certificates' links should be visible and active

    Then I see Achivement Link on Dashboard Sidebar
    Then I see Certificate Validation Link on Dashboard Sidebar
    Then I see Completion Certificates Link on Dashboard Sidebar


  Scenario Outline: TC_02_US_044: My achievements statistics information should be visible
    And I click Achivement link on Dashboard Sidebar
    And I select as from date "Oct 2023" and as to date "Oct 2025"
    And I select "<Course>" for course on the Course Dropdown
    When I click Show Result
    Then I see the Results of Certificates

  Examples:
  |   Course                  |
  |  All courses              |
  |   Volleyball Referee      |
  |   education               |

  @mua
  Scenario: TC_03_US_044: The  certificates in the list of successful certificates should be able to be viewed, edited, deleted
    And I click Achivement link on Dashboard Sidebar
    And I click toggle Dropdown Menu
    When I click Open Button
    Then I can see the my Certificate

