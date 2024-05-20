@kub
Feature: Have a Dashboard page
  Scenario: TC01_US019:Check a dashboard link on home page
    Given i m on Homepage as "teacher" with "kubra" email
    And   i click My Profile icon on Header
    When  I click dashboard link on home page
    Then  I access dashboard page


    Scenario:TC02_US019: Enable offline status button should be visible and activated
      Given i m on Dashboard with "kubratankisi.teacher@instulearn.com" email
      Then The Enable offline status button appears
      Then  Activate offline status button is active is verified

   Scenario:TC03_US019: Visibility and activity of links in the sidebar on the dashboard
     Given i m on Dashboard with "kubratankisi.teacher@instulearn.com" email
     Then The Courses,Course Bundles,Meetings link appears in the sidebar on the dashboard and it is verified that it is active.
     Then The Quizzes,Certificates,Financial link appears in the sidebar on the dashboard and it is verified that it is active.
     Then The Support,Marketing,Noticeboard link appears in the sidebar on the dashboard and it is verified that it is active.
     Then The Notifications,Settings,My Profile,Log Out link appears in the sidebar on the dashboard and it is verified that it is active.

   Scenario: TC04_US019:: View All Events link visibility and activity test
     Given i m on Dashboard with "kubratankisi.teacher@instulearn.com" email
     Then The View All Events link appears on the Dashboard page and confirms it is active

     Scenario: TC05_US019: Dashboard bodylink visibility and activity test
       Given i m on Dashboard with "kubratankisi.teacher@instulearn.com" email
       Then Account Balance links appear in the Dashboard body section and it is verified that it is active.
       Then Pending Meetings links appear in the Dashboard body section and it is verified that it is active.
       Then Support Messages links appear in the Dashboard body section and it is verified that it is active.
       Then Monthly Sales links appear in the Dashboard body section and it is verified that it is active.
       Then Comments links appear in the Dashboard body section and it is verified that it is active.
  @TC06_US019
       Scenario: TC06_US019 Visibility test of current advertisements and detailed information on the Advertisement Board
         Given i m on Dashboard with "kubratankisi.org@instulearn.com" email
         When  I click dashboard link on home page
         Then I view current advertisements and detailed information on the notice board.