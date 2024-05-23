
  Feature:  I want to have an area on the site where I can view and manage my certificates

    Background:
      Given i m on Dashboard with "ugur.teacher@instulearn.com" email
      And i click Certificates Link ond Dashboard Sidebar


    Scenario:TC_01_US_026: In Dashboard sidebar, under Certificates, 'List','Achivements','Certificate Validation','Completion Certificates' links should be visible and active
      Then I see List Link on Dashboard Sidebar
      Then I see Achivement Link on Dashboard Sidebar
      Then I see Certificate Validation Link on Dashboard Sidebar
      Then I see Completion Certificates Link on Dashboard Sidebar


    Scenario:TC_02_US_026: Certificate statistics information should be visible on the page
      When I click List Link on Sidebar
      Then I can see the Certificate Statistics
      And I select as from date "Oct 2023" and as to date "Oct 2025"
      And I select "All courses" for course on the Course Dropdown
      When I click Show Result for Certificates List
      Then I can see the list Of Certificates


    Scenario: TC_03_US_026: My achievements statistics information should be visible
      When I click Achivement link on Dashboard Sidebar
      Then I see My certificates statistics title on the page
      And I select as from date "Oct 2023" and as to date "Oct 2025"
      And I select "All courses" for course on the Course Dropdown
      When I click Show Result
      Then I see the Results of Certificates
    @ugr
    Scenario: TC_03_US_026: When the 'Certificate Validation' link is clicked, it should redirect to the certificate validation page
      When I click Certificates Validation Link on Sidebar
      Then I can see the Certificate Validation title on the page
    @ugr
    Scenario: TC_04_US_026: The filtered certificates should be displayed in the list of completed certificates
      And I click Completion Certificates link on Dashboard Sidebar
      And I select as from date "Oct 2023" and as to date "Oct 2025"
      When I click Show Result
      Then I see the Course Of My Ceriticates


