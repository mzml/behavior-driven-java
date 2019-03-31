Feature: Magic Numbers
  a list of numbers and a number k
  return whether any two numbers from the list add up to k

  Scenario: find the magic number
    Given [10, 15, 3, 7] and k of 17
    Then it should be true since 10 + 7 is 17.