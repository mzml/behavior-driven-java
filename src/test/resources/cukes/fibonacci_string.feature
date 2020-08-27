Ability: fibonacci string
  form the nth fibonacci string
  # f0 = '0'
  # f1 = '01'
  # f2 = '010' = f1 + f0
  # f3 = '01001' = f2 + f1

  Scenario Outline: the nth fibonacci string is formed
    Then the <nth> fibonacci returns <string>
    Examples:
      | nth | string          |
      | 0   | "0"             |
      | 1   | "01"            |
      | 2   | "010"           |
      | 3   | "01001"         |
      | 4   | "01001010"      |
      | 5   | "0100101001001" |