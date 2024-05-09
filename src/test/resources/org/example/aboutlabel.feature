Feature: Check the about label

  Background:
    Given the page is opened
    Given the 'Username' is filled with 'standard_user'
    And the 'Password' is filled with 'secret_sauce'
    Then the 'Login' button is clicked

    Scenario: The advertising text is appears
      Given the 'Menu' menubutton is clicked
      And the 'AboutMenu' menubutton is clicked
      Then 'The world relies on your code. Test on thousands of different device, browser, and OS configurations–anywhere, any time.' is exists