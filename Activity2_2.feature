@activity2_2
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario Outline: Testing with Data from Scenario
    Given User is on Login Table page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message Table
    And Close the Table Browser
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |