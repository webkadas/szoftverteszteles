Feature: Checking the prices

  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked


  Scenario Outline: Correct prices
    Given the '<product>' is clicked
    Then the '<price>' is correct
    Examples:
      | product             | price  |
      | Sauce Labs Backpack | $29.99 |
      | Sauce Labs Bike Light | $9.99 |
      | Sauce Labs Fleece Jacket | $49.99 |
      | Sauce Labs Bolt T-Shirt | $15.99 |
