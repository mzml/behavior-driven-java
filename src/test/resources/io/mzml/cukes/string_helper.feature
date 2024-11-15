Ability: String helper
  For building and manipulating strings

  Scenario Outline: Truncate A in first 2 positions of text
    Then the "<input>" should have the A removed from either positions and result in "<output>"
    Examples:
      | input | output |
      | AARS  | RS     |
      | CADA  | CDA    |
      | ACDC  | CDC    |
