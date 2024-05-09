Feature: Description Contains Keywords

  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

  Scenario Outline: Contains Keywords
    Given the '<product>' is clicked
    Then the description contains '<keyword>'
    Examples:
      | product                  | keyword     |
      | Sauce Labs Bike Light    | battery     |
      | Sauce Labs Backpack      | laptop      |
      | Sauce Labs Bolt T-Shirt  | 100%        |
      | Sauce Labs Fleece Jacket | quarter-zip |
