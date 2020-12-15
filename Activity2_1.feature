@activity2_1
Feature: Login Test

  
  Scenario: Testing Login
    Given User is on Login page parameterization
    When User enters parameterization "admin" and "password"
    Then Read the page title and confirmation message parameterization
    And Close the parameterization Browser