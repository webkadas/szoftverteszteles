Feature: Checking the content of a div on the Login Screen

  Scenario Outline: After click on 'Add to Cart' the 'Remove' button displayed
    Given the page is opened
    Then the div contains the '<text>' and the result is '<result>'
    Examples:
      |  text| result|
      |  standard_user| true|
  |locked_out_user |true|
|                standard_user2|false    |
      |locked_out_user2 |false|

