
  Feature: Review the instructors and create an appointment.

    Background:
      Given I am on Home Page as a visitor

    Scenario: TC_01_US_012: All Instructors button should be visible and active.
      Then I can see Instructors on Home Page body
      When I click on All Instructors Button
      Then I access Intructors Page

    Scenario: TC_02_US_012 :The slider with instructor information cards should be visible
      Then I can click slider cards of Instructor

    Scenario: TC_03_US_12 : I can review the instructors name and rating score.
      Then I can see the name Of Instructors in the card
      Then I can see the rating score of Instrcotrs in the card
      Then I can see the Reserve a Meeting button in the card

      @mua
    Scenario Outline: TC_04_US_12 : I can create an appointment with Instructor.
      When I click the Reserve a meeting for Instructors in the card
      And I reserve a Day and time which is not disabled
      And I select "<type>" of meeting





      Examples:
      | type         |
      |  online      |
      |  In-person   |
