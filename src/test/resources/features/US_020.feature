@arzu
Feature:Check instructor menu and sub-menus on the dashboard

  Scenario:TC_01_US_020:View the Instructor menu and submenus
    Given i m on Dashboard with organization "rihirem890@ociun.com" email
    Then Verifies Instructors title is visible in the sidebar
    When Clicks on "Instructors" link
    Then Verifies visibility and activity of Instructor Submenu

  Scenario:TC_02_US_020:Creating a new instructor
    Given i m on Dashboard with organization "rihirem890@ociun.com" email
    When Clicks on "Instructors" link
    When Clicks on "New" submenu

  Scenario:TC_03_US_020:nstructor viewing test from the 'List' link
    Given i m on Dashboard with organization "rihirem890@ociun.com" email
    When Clicks on "Instructors" link
    When Clicks on "List" submenu link
    Then Verifies "Instructors" panel is displayed
    Then Validates and filters filter elements
    And Select as from date 01 "May 2024" and as to date 01 "May 2025"
    And Select name "Instructor SDET" for instructor name
    When Clicks "show result" button
    And If the Instructor page is empty click "New" link.


