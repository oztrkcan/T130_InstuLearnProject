
Feature: Creating and editing quizzes as an Instructor
  Background:
    Given i m on Dashboard with "batuhan.teacher@instulearn.com" email

  Scenario: TC_01_US_025: Login to the site as an Instructor.
    Then I see the Link of My Profile in Dashboard sidebar.

  Scenario: TC_02_US_025: View the Quizzes title and contents in the Dashboard.
    And Click on the Quizzes title in the Dashboard.
    Then Click on the New quiz link under the Quizzes heading and go to the relevant page.
    Then Click on the List link under the Quizzes heading and go to the relevant page.
    Then Click on the Results link under the Quizzes heading and go to the relevant page.
    Then Click on the My results link under the Quizzes heading and go to the relevant page.
    Then Click on the Not Participated link under the Quizzes heading and go to the relevant page.
  @batuhan
  Scenario: TC_03_US_025: Create a new quiz and answers under the New Quiz heading.
    And Click on the Quizzes title in the Dashboard.
    Then Click on the New quiz link under the Quizzes heading and go to the relevant page.
    Then Fill "Quiz 01" the Quiz title.
    Then Fill "60" the Time title.
    Then Fill "2" the Number of attempts title.
    Then Fill "55" the Pass mark title.
    Then Fill "10" the Expiry days title.
    Then Click the Display questions randomly button.
    Then Click the Certificate included button.
    Then Click the Active quiz button.
    Then Click the Create button.
    Then Click the Save button.
    When Verify the text Item added successfully.







  Scenario: TC_04_US_025:
    Then