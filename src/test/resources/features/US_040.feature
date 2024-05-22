Feature:Have a Dashboard page link
  Background:
    Given i m on Dashboard with "kubratankisi.student@instulearn.com" email

  Scenario: TC01_US040:Check a dashboard link on home page
    Then The Courses,Meetings link appears in the sidebar on the dashboard and it is verified that it is active.
    Then The Quizzes,Certificates,Financial link appears in the sidebar on the dashboard and it is verified that it is active.
    Then The Support link appears in the sidebar on the dashboard and it is verified that it is active.
    Then The Notifications,Settings,Log Out link appears in the sidebar on the dashboard and it is verified that it is active.

  Scenario: TC02_US040:: View All Events link visibility and activity test
    Then The View All Events link appears on the Dashboard page and confirms it is active

  Scenario: TC03_US040: Dashboard bodylink visibility and activity test
    Then Account Balance links appear in the Dashboard body section and it is verified that it is active.
    Then Support Messages links appear in the Dashboard body section and it is verified that it is active.
    Then Comments links appear in the Dashboard body section and it is verified that it is active.
    Then Purchased Courses links appear in the Dashboard body section and it is verified that it is active.
    Then Meetings links appear in the Dashboard body section and it is verified that it is active.

  Scenario: TC04_US040 Visibility test of current advertisements and detailed information on the Advertisement Board
    Then I view current advertisements and detailed information on the notice board.
    Then I can see the My Chart Grapphic
    When I click More Info Button 1
    Then I see the message of Noticeboard