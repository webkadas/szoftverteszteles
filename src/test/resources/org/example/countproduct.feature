Feature: Checking products
  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

    Scenario: Count of products more then 0
      Given the 'Menu' menubutton is clicked
      And the 'AllItems' menubutton is clicked
      Then the elements number more then '0'