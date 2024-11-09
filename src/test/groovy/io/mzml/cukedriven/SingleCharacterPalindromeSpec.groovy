package io.mzml.cukedriven

import spock.lang.Specification

class SingleCharacterPalindromeSpec extends Specification {
    def "check if string can be a palindrome if one character was removed"() {
        expect:
        SingleCharacterPalindrome.solve("abba") == "OK"
        SingleCharacterPalindrome.solve("abbaa") == "remove one"
        SingleCharacterPalindrome.solve("abbaab") == "not possible"

    }
}