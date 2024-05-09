Feature: Checking the format of prices
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

  Scenario Outline: Correct prices
    Given the '<product>' is clicked
    Then the price format is correct
    Examples:
      | product             |
      | Sauce Labs Backpack |
      | Sauce Labs Bike Light |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Bolt T-Shirt |
