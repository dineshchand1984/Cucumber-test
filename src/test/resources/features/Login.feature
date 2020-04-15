#Author: bit.wonders@gmail.com

@tag
Feature: Test target application

  @tag1
  Scenario: Test login functionality
    Given User wants to login to application
    And search for his work-items
    When User enters his username and password
    And clicks on submit
    Then User is logged into the application
    And User can see his work-items in his HOMEPAGE.
