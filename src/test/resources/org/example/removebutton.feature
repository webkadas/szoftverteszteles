Feature: Checking the content of cart's badge
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

    Scenario: After click on 'Add to Cart' the 'Remove' button displayed
      Given the 'Sauce Labs Backpack' label is clicked
      And the 'AddToCart' button is clicked
      Then the 'Remove' button is displayed
