@browser
Feature: Inventory Category
  As a web store administrator 
  I want to manage inventory categories
  So that I can get inventories organized

  @sanity
  Scenario: Add inventory category
    Given a user has already login
    Then the user can add inventory category