import io.mzml.cukedriven.SingleCharacterPalindrome
import spock.lang.Specification

class SingleCharacterPalindromeSpec extends Specification {
    def "check if string can be a palindrome if one character was removed"() {
        expect:
            SingleCharacterPalindrome.solve("abba") == "ok"
            SingleCharacterPalindrome.solve("abbaa") == "removed one"
            SingleCharacterPalindrome.solve("abbaab") == "not possible"

    }
}