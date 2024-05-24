
  Feature: Verification test that the opened courses can be controlled

    Background: 
      Given i click on login link on Login page
      Then i enter "gulmek@instulearn.com" for login
      And i enter "Learn.2504" password for login
      Then i click on the login Button for login


      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "New" heading in the dashboard sidebar
        When Choose the Course Type "Video course"
        When Validates the elements in the new page
        Then Enters "Healty and Spor Course" into the Title text box
        And Verifies that the desired "The subject of this course is healthy and sports" has been entered in the Description text-box
        Then Uploads "photo/goldenBridge.jpg" to thumbnail box
        Then Uploads "photo/sporphoto.jpg" to Cover Image box
        Then Enters "What you will learn from this course; 1-Healthy life 2-How to do sports 3-Healthy nutrition" into the Description textbox
        And scrolls to the bottom of the page
        And Verifies that displays and effective buttons in basic information page
        And Clicks the "Next" button
        Then Enters that "10" students in the capacity box
        And Enters that "60" duration
        Then Verifies that displays and effective floating buttons in extra information page
        Then Enters "healthy" in the Tagbox
        When Choose the Category "Health Coaching"
        And Clicks the "Next" button
        Then Verifies that displays and effective buttons in pricing page
        Then "60" in the Access Period Box, "20" in the Price Box, and "15" in the Organization Price Box is entred.
        And scrolls to the bottom of the page
        And Clicks the "Next" button
        Then Adds section "Nutrition" from the content page
        And Clicks the "Next" button
        Then Verfies prerequisites page
        And Clicks the "Next" button
        Then Verifies FQA page
        And Clicks the "Next" button
        Then Verifies Quiz & Certification page
        And Clicks the "Publish" button


      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "My courses" heading in the dashboard sidebar
        When Verifies the visibility of opened courses in My courses page


      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "Invited courses" heading in the dashboard sidebar
        When Verifies the visibility of not opened courses


      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "My purchases" heading in the dashboard sidebar
        When Verifies the visibility of opened courses in My purchases
    @ahme
      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "My course comments" heading in the dashboard sidebar
        When Validates elements on the page
        Then Selects the start "2024-05-23" and end "2024-05-24" date
        Then Enters user "Ahmet Gülmek" and course "Healty and Spor Course" does filtering
        When Verifies visibility of comments in the "My course comments"

      Scenario:
        Then Verifies and clicks the visibility of the "Courses" link under the "My comments" heading in the dashboard sidebar
        When Validates elements on the page
        Then Selects the start "2024-05-23" and end "2024-05-24" date
        And Clicks the "Show Results" button
        When Verifies visibility of comments in the "My comments"


