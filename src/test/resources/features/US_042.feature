
  Feature: I would like to have a page where I can view and manage my meetings
      Background:
        Given i m on Dashboard with "ugur.student@instulearn.com" email
        And I click Meeting Link on the Dashboard Sidebar

    Scenario: 'My reservations' link should be visible and active
        Then I can see the My reservations Link on the Sidebar