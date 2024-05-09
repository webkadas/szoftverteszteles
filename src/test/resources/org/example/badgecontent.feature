Feature: Checking the content of cart's badge
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

    Scenario: Same number as the number of added products
      Given the 'Sauce Labs Backpack' label  is clicked
      And the 'AddToCart' button is clicked
      And the 'BackToProduct' button is clicked
      And the 'Sauce Labs Bike Light' label is clicked
      And the 'AddToCart' button is clicked
      And the 'BackToProduct' button is clicked
      And the 'Sauce Labs Bolt T-Shirt' label is clicked
      And the 'AddToCart' button is clicked
      And the 'BackToProduct' button is clicked
      Then the Badge content is '3'