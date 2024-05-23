
    Feature: I would like to have an area on my Dashboard panel where I can do my transactions related to students
        Background:
          Given i m on Dashboard with "ugur.org@instulearn.com" email
          And I click Student Link on Sidebar

      Scenario: TC_01_US_021: 'New', 'List' links should be visible and active
        Then I can see New link on Sidebar
        Then I can see List on Sidebar

      Scenario: TC_02_021_US_021: Order to register a new student
        Given I click New link on Sidebar
        And I send information for new Student add
        When I click Save button for new Student register

      Scenario: TC_03_021_US_021: Order to register a new student
        And I click List Link under The Students Sidebar
        And I select as from date "Oct 2023" and as to date "Oct 2025"
        When I click Show Result



