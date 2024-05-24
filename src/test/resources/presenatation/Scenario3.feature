@se3
Feature:I would like to see my  Achievements

  Scenario Outline: TC_02_US_044: My achievements statistics information should be visible
    Given i m on Dashboard as a "student" with "muammer" email
    When i click Certificates Link ond Dashboard Sidebar
    And I click Achivement link on Dashboard Sidebar
    And I select as from date "Oct 2023" and as to date "Oct 2025"
    And I select "<Course>" for course on the Course Dropdown
    When I click Show Result
    Then I see the Results of Certificates

    Examples:
      |          Course             |
      |  Beauty and Makeup Mastery  |
      |    All courses              |
