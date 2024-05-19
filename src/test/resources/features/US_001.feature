
  Feature:  I would like to be able to access the main page of the site.

    Scenario: TC_01_US_001: The home page must be accessible when entering the URL.
      Given I am on Home Page as a visitor

    Scenario:TC_02_US_001: When entering the site, make sure that the title is 'Home | InstuLearn'.(ingilizce kisa aciklamasi)
      Given I am on Home Page as a visitor
      Then  I see the title of Home Page "Home | InstuLearn"
