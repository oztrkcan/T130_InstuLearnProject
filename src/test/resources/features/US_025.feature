
Feature: Creating and editing quizzes as an Instructor
  Background:
    Given i m on Dashboard with "batuhan.teacher@instulearn.com" email

  Scenario: TC_01_US_025: Login to the site as an Instructor.
    Then I see the Link of My Profile in Dashboard sidebar.

  Scenario: TC_02_US_025: View the Quizzes title and contents in the Dashboard.
    And I click on the Quizzes title in the Dashboard.
    Then I click on the New quiz link under the Quizzes heading and go to the relevant page.
    Then I click on the List link under the Quizzes heading and go to the relevant page.
    Then I click on the Results link under the Quizzes heading and go to the relevant page.
    Then I click on the My results link under the Quizzes heading and go to the relevant page.
    Then I click on the Not Participated link under the Quizzes heading and go to the relevant page.

  Scenario: TC_03_US_025: Create a new quiz and answers under the New Quiz heading.
    And I click on the Quizzes title in the Dashboard.
    Then I click on the New quiz link under the Quizzes heading and go to the relevant page.
    Then I fill "Quiz 01" the Quiz title.
    Then I fill "60" the Time title.
    Then I fill "2" the Number of attempts title.
    Then I fill "55" the Pass mark title.
    Then I fill "10" the Expiry days title.
    Then I click the Display questions randomly button.
    Then I click the Certificate included button.
    Then I click the Active quiz button.
    Then I click the Create button.
    Then I click the Save button.
    When I verify the text Item added successfully.







  Scenario: TC_04_US_025:
    Then