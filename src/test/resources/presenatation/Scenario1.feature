@se1
Feature: I can review and purchase products on the Home Page

  Scenario Outline: I can add  Products title at to Card in the Home Page
    Given I am on Home Page as a visitor
    Then I see the title of the Store Products and Slider on the Home Page
    Then I see  price, like score, add to cart icon on product cards on the Home Page
    When I click the "<product>" name on Product Store Card
    Then I see the details of the product I clicked on "<product>"
    Examples:
      | product  |
      | Painting tools  |
      | Advanced microscope |