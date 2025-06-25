Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username "standard_user" and password "secret_sauce"
    Then User should be redirected to the products page

  Scenario: Failed login with invalid credentials
    Given User is on the login page
    When User enters invalid username "invalid_user" and password "wrong_password"
    Then User should see an error message