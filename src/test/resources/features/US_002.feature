
  Feature: As a visitor, I would like to have easy links on the top bar of the home page so that I can easily navigate around the site. (kisalt)

    Background:
      Given I am on Home Page as a visitor

    Scenario: TC_01_US_002: Easy links (Categories, Home, Courses, Instructors, Store, Forums) should be displayed on the top bar of the site. (kisalt)
      Then I see Categories link on Header
      Then I see  Home link on Header

    Scenario: TC_02_US_002: Easy links (Categories, Home, Courses, Instructors, Store, Forums) should be displayed on the top bar of the site. (kisalt)

    Scenario: TC_03_US_002: Easy links (Categories, Home, Courses, Instructors, Store, Forums) should be displayed on the top bar of the site. (kisalt)

    Scenario: TC_04_US_002: Easy links (Categories, Home, Courses, Instructors, Store, Forums) should be displayed on the top bar of the site. (kisalt)

    @der
    Scenario: TC_05_US_002: Easy links (Categories, Home, Courses, Instructors, Store, Forums) should be displayed on the top bar of the site. (kisalt)
      Then I see Search Box  on Home Page body
      When  I enter a "bunu gondercegiz" at the Search box
      And I click Search Button
      Then I see the results of my search "bunu gondercegiz"

