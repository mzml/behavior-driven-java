import spock.lang.Specification

class SpockTest extends Specification {
    def "one plus one should equal two"() {
        given: 'a false equivalence'
        1 + 1 == 1

        expect:
        1 + 1 == 2
    }
}