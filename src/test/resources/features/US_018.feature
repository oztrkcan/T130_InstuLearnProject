
  Feature: Testing the visibility and effectiveness of the footer section

    Background:
      Given I am on Home Page as a visitor


      Scenario Outline: Test to View the Items in the Footer and Verify Their Activities
        And goes down to the footer section of the page
        Then Verifies visibility of "<Additional Link>" link in footer section and clicks
        When Verifies that the opened page is the relevant "<url>"

        Examples:
        |Additional Link        | url                                             |
        |- About us              |https://qa.instulearn.com/pages/about           |
        |- Contact us            |https://qa.instulearn.com/contact               |
        |- Certificate validation|https://qa.instulearn.com/certificate_validation|
        |- Terms & rules         |https://qa.instulearn.com/pages/terms           |

      Scenario:Testing to display media icons and other icons with the stick in the footer section
        And goes down to the footer section of the page
        Then Verifies that displays social media icons and other icons

    @ahme
      Scenario:Newsletter subscription creation test
        And goes down to the footer section of the page
        Then Verifies that a newsletter subscription has been created
