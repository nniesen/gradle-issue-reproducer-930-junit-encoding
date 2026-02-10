package org

import spock.lang.Specification

class MessageSpec extends Specification {

    def testMessageSource(String languageCode, String startsWith) {
        expect: 'messageSource returns a value for the given language code and key'
        assert startsWith != null // irrelevant for reproducing regression

        where:
        languageCode | startsWith
        'en'         | 'As of '
        'fr'         | 'À compter du '
        'zh-TW'      | '截至 '
    }

    
    // Workaround for Gradle 9.3.0 and 9.3.1
    // Don't add startsWith to the test names. Java Strings are inherently UTF-16 and some chars cause issues with testcase names if not encoded to UTF-8.
    def "testWorkaroundMessageSource [languageCode: #languageCode, ##iterationIndex]"(String languageCode, String startsWith) {
        expect: 'messageSource returns a value for the given language code and key'
        assert startsWith != null // irrelevant for reproducing regression

        where:
        languageCode | startsWith
        'en'         | 'As of '
        'fr'         | 'À compter du '
        'zh-TW'      | '截至 '
    }
}
