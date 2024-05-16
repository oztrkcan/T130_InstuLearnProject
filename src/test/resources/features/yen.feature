@wip
  Feature: yeni
    Scenario:yeni
      Given i click on login link on Login page
      And i enter "muammer.teacher@instulearn.com" for login
      And i enter "Learn.2504" password for login
      When i click on the login Button for login
      Then i must be login
    @wip
    Scenario: new new
      Given i m on Dashboard with "muammer.teacher@instulearn.com" email

    Scenario: new
      Given i m on Dashboard as a "teacher" with "alican" email

  @wip
    Scenario: new
      Given i m on Dashboard as a "student" with "muammer" email


    Scenario Outline: new
      Given i m on Dashboard as a "teacher" with "<person>" email
      Examples:
      | person    |
      | alican    |
      | batuhan    |
      | ahmet   |
      | arzu   |
      | banu    |
      | burak      |
      | derya      |
      | kubra      |
      | nehir   |
      | muammer   |
      | orkun   |
      | ugur   |