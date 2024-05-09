Feature: Checking the search field
#NEM MÚKÖDIK
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

  Scenario Outline: One correct tipp is shown
    Given the 'Menu' button is clicked
    And the 'AboutMenu' button is clicked
    And the 'Search' button is clicked
    And the 'Search' is filled with '<keyword>'
    Then the result contains '<sample>'
    Examples:
      | keyword | sample   |
      | laptop  | Testing  |
      | battery | Mobile     |
      | light   | Lightbox |
      | sauce   | TestRail |


