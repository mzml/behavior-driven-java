Ability: Sum of non-adjacent numbers
  a function that returns the largest sum of non-adjacent numbers in a list
  # Numbers CAN'T be 0 or negative.

  Scenario: function returns sum
    Given a list [2, 4, 6, 2, 5]
        # we pick 2, 6, and 5
    Then it should return 13
    Given a list [5, 1, 1, 5]
        # we pick 5 and 5.
    Then it should return 10
