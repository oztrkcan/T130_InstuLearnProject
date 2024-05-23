Feature: See products and purchase transactions on the home page.
  Background:
    Given i m on Dashboard with "batuhan.teacher@instulearn.com" email
  @batuhan
  Scenario: TC_01_US_035: Login to the site as an Instructor.
    Then I see the Link of My Profile in Dashboard sidebar.
    Then I see the Store and click.
    Then I see the Products text.
    Then I see the Search Box and search for "Book".
    Then I see Filters and I filter.
    Then I click the first product that appear.
    Then I see Add to Cart.
    Then I see Buy now and click.
    Then I buy the product.