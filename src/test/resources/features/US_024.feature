
  Feature:I would like to have a page where I can manage my meetings

    Background:
    Given i m on Dashboard with "banu.teacher@instulearn.com" email
      And I click Meeting Link on the Dashboard Sidebar

    Scenario: TC_01>US_024 'My Bookings', 'My Requests', 'Settings' links should be visible and active
      Then I can see the My reservations Link on the Sidebar
      Then I can see the Request Link on the Sidebar
      Then I can see the Settings Link on the Sidebar


      Scenario Outline: TC_02>US_024 Meeting statistics information should be visible on the page
        When I click My Reservations Link on the Sidebar
        Then I see the title of 'Meeting statistics
        And I send date "2024-01-01" as a from and "2024-06-06"  as a to
        And I select a "<day>" , "<instructors>" , "<status>" for filter Meetings
        And I can click Show only open meetings checkbox
        When I click Show Result

        Examples:
        |  day               |  |   instructors         | |    status          |
        |     All Days       |  |  All instructors      | |    All             |


    Scenario Outline: TC_03>US_024 Meeting statistics information should be visible on the page
      When I click Reques Link on the Sidebar
      Then I see the title of 'Meeting statistics
      And I send date "2024-01-01" as a from and "2024-06-06"  as a to
      And I select a "<day>" , "<status>" for filter Request
      And I can click Show only open meetings checkbox
      When I click Show Result

      Examples:
        |  day               | |    status          |
        |     All Days       | |    All             |

    @ban
    Scenario Outline:TC_04>US_024 Meeting statistics information should be visible on the page
      And I click Settings Link on the Sidebar
      And I click toggle Dropdown Menu the 3 one and click Add Time Button on Settings
      And I click Am-Pm checkbox
      And I set the time ab "<ab>" to "<to>" for the meeting
      And I send a "its a description" descripton for meeting
      When I click Save button

      Examples:
    |     ab              | |        to             |
    |     5:15              | |       8:45          |
    |     2:55              | |       4:15          |





