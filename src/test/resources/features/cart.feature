Feature: Shopping Cart Functionality

  Background:
    Given User is on the login page
    When User enters valid username "standard_user" and password "secret_sauce"
    Then User should be redirected to the products page

  Scenario: Add product to cart
    When User adds "Sauce Labs Backpack" to cart
    Then Product should appear in cart
    And Cart badge should show "1"

  Scenario: Complete logout process
    When User clicks on menu button
    And User clicks on logout
    Then User should be redirected to login page