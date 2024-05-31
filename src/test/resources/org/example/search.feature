Feature: Checking the search field
#NEM MÚKÖDIK
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

  Scenario: One correct tipp is shown
    Given the 'Menu' menu button is clicked
    And the 'AboutMenu' menu button is clicked
    Then the 'Search' button is clicked


