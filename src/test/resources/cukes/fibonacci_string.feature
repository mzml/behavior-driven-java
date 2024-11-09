Ability: fibonacci string
  form the nth fibonacci string
  # f0 = '0'
  # f1 = '01'
  # f2 = '010' = f1 + f0
  # f3 = '01001' = f2 + f1

  Scenario Outline: the <n>th fibonacci string is formed
    Then the <n>th fibonacci returns <string>
    Examples:
      | n | string                  |
      | 0 | "0"                     |
      | 1 | "01"                    |
      | 2 | "010"                   |
      | 3 | "01001"                 |
      | 4 | "01001010"              |
      | 5 | "0100101001001"         |
      | 6 | "010010100100101001010" |