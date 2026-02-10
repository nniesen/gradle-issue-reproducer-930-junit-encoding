package org

import spock.lang.Specification

class MessageSpec extends Specification {

    def "should create a simple message"() {
        given: "a message text"
        def messageText = "Hello, World!"

        when: "we process the message"
        def result = messageText.toUpperCase()

        then: "the message should be converted to uppercase"
        result == "HELLO, WORLD!"
    }
}
