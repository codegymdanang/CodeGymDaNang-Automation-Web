@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Home Page
  In order for customer to find what they are looking for more efficiently
  As a seller
  I want buyers to be able to see for the home page

  Scenario: Home Page
    Given I am on the web page
    When I enter my email
    And I click get username button
    Then I should see the username
