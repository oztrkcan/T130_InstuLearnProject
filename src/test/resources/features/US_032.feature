
Feature: Check My Profile link on the Dashboard

  Scenario: TC_01_US_032: My Profile Link is enabled and disabled
    Given i m on Dashboard with "muammer.teacher@instulearn.com" email
    Then I see the Link of My Profile in Dashboard sidebar.
    Then I can click My Profile Link

  Scenario:TC_02_US_032: I can see  My Profile link on the Home Page
    Given i m on Homepage as "teacher" with "muammer" email
    When i click My Profile icon on Header
    Then i can see and click My Profile icon


  Scenario:TC_03_US_032: I can see My profile page
    Given i m on Dashboard with "muammer.teacher@instulearn.com" email
    When i click My Profile link on Dashboard sidebar
    Then i can see My Profile page

  Scenario:TC_04_US_032: I can see My profile page
    Given i m on Dashboard with "muammer.teacher@instulearn.com" email
    When i click My Profile link on Dashboard sidebar
    Then i can click About link and see about me
    Then i can click Courses Link and see Courses
    Then i can click Articles link and see Articles
    Then i can click Badges link and see Badges
    Then can click Reserve Meeting and see Reserve meetings

