@browser
Feature: User Login
  As a system administrator 
  I want to know that users can log in the web application without problem
  So that I can be sure login mechanism works fine

  @system
  Scenario Outline: Successful user login
    Given the user with login id <LOGIN_NAME>
    Then the user can log in without problem
    And the user can logout

    Examples:
      | LOGIN_NAME |
      | user       |
      | admin      |