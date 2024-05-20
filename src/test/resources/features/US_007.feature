
Feature: I can review and purchase products on the Home Page
  Background:
    Given I am on Home Page as a visitor

  Scenario Outline: TC_01_US_007: I can see Store Products title in the Home Page
    Then I see the title of the Store Products and Slider on the Home Page
    Then I see  price, like score, add to cart icon on product cards on the Home Page
    When I click the "<product>" name on Product Store Card
    Then I see the details of the product I clicked on "<product>"
    Examples:
      | product  |
      | Painting tools  |
      | Advanced microscope |


  Scenario: TC_02_US_007: I can see adn click Store Products on the Home Page
    When I click one of Add to Card Button in Store Product Cards
    Then I see the product On the Shopping Card logo at the Header


  Scenario Outline: TC_03_US_007: I can see and click Store Products Category on the Home Page
    When I click "<category>" categories of ProductCards
    And I scroll the CategoryTitle Product Page
    Then I see the "<category>" category on Product Page
    Examples:
      |  category              |
      |     e-book             |
      |     Science Tools      |

  Scenario: TC_04_US_007: I can see and click All product Button in the Home Page
    And I scroll the Store Product Cards On Home Page
    When I click All Product Button on Home Page
    Then I see the "https://qa.instulearn.com/products" url
