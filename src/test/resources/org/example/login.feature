Feature: Login to inventory

  Background:
    Given the page is opened


  Scenario: Successfully login Attempt
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    And the 'Login' button is clicked
    Then the display the 'Products'

