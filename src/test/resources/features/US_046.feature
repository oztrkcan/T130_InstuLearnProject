
Feature:Ability to operate in the support menu

  Scenario: TC_01_US_046:View the Support menu and submenus
    Given i m on Dashboard as a "astudent" with "arzu" email
    Then verify visibility and clickability "Support Link"
    Then Verifies the visibility and activation of the "Support Link Submenu"

    Scenario:TC_02_US_046: Create new support message
      Given i m on Dashboard as a "astudent" with "arzu" email
      When Click submenu of support "New" and verify new support created

    Scenario: TC_03_US_046: Filter messages and view messages "Courses Support" link on Support menu.
      Given i m on Dashboard as a "astudent" with "arzu" email
      Then verify visibility and clickability "Support Link"
      When Click "Courses Support" from submenu
      Then Verify summary support panel
      And Select as from date 01 "Apr 2024" and as to date 01 "Apr 2025"
      And Select other filter option and click "show result"

    Scenario: TC_04_US_046:Create new ticket and viewing, filtering and closing the created ticket
      Given i m on Dashboard as a "astudent" with "arzu" email
      Then verify visibility and clickability "Support Link"
      When Click "New" from submenu of Support
      Then Verify visibility of ticket message title
      When Click on the message,write reply message and display the reply message







