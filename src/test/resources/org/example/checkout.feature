Feature: Checking Checkout

  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

  Scenario Outline: Input fields display the correct data
    Given the 'Cart' button is clicked
    And the 'Checkout' button is clicked
    And the 'Firstname' is filled with '<firstName>'
    And the 'Lastname' is filled with '<lastName>'
    And the 'Postalcode' is filled with '<postalCode>'
    And the 'Continue' button is clicked
    Then the message is '<errorMessage>'
    Examples:
      | firstName | lastName  | postalCode | errorMessage                   |
      |           |           |            | Error: First Name is required  |
      | something |           |            | Error: Last Name is required   |
      | something | something |            | Error: Postal Code is required |
      | something |           | something  | Error: Last Name is required   |




