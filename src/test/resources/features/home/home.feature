@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Home Page
  In order for customer to buy a car
  As a seller
  I want buyers to register a form

  Scenario: Home Page
    Given I am on the registration 
    When I enter my phone number
    And I enter my fullname
    And I enter my email
    And I enter my username
    And I enter password
    And I enter repassword
    And I click Agree Button
    And I click Registration 
    Then I should see the welcome
