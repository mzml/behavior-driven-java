Ability: String helper
  For building and manipulating strings

  Scenario Outline: Truncate A in first 2 positions of text
    Given text with A in either first or second position
      | <text input> |
    Then the A should be removed from either positions
      | <output> |
    Examples:
      | text input | output |
      | AARS       | RS     |
      | CADA       | CDA    |
      | ACDC       | CDC    |
