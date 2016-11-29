@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Home Page
  In order for customer to find what they are looking for more efficiently
  As a seller
  I want buyers to be able to see for the home page

  Scenario: Home Page
    Given I want to buy a wool scarf
    When I go to home page
    Then I should see the wool scarf
