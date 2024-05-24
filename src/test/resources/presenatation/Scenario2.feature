@se2
Feature: Review the instructors and create an appointment.

Scenario Outline:  I can create an appointment with Instructor.(TC12)
  Given I am on Home Page as a visitor
  When I click the Reserve a meeting for Instructors in the card
  And I reserve a Day and time which is not disabled
  And I select "<type>" of meeting
  And I click Group Meetings checkbox
  And I click Students Count in the capasities
  And I enter Description for Reserve Meeting
  When  I click Reserve a Meeting Button
  Then i see sucsessull message for Reserve a meeting

    Examples:
    |     type     |
    |  online      |
    |  In-person   |