package com.quaildev.lean.tech

import spock.lang.Specification

class GiftTest extends Specification {

    def 'multiply multiplies quantity, retains description'() {
        setup:
        def originalGift = new Gift(2, "turtle doves")

        when:
        def newGift = originalGift * 5

        then:
        newGift.quantity == 10
        newGift.description == originalGift.description
    }

    def 'gifts with equal descriptions are considered equal'() {
        setup:
        def first = new Gift(1, 'gift')
        def second = new Gift(2, 'gift')

        expect:
        first == second
        second == first
    }

    def 'gifts with different descriptions are not equal'() {
        setup:
        def first = new Gift(1, 'thing')
        def second = new Gift(1, 'different thing')

        expect:
        first != second
        second != first
    }

    def 'toString() returns quantity and description'() {
        expect:
        new Gift(5, 'golden rings').toString() == '5 golden rings'
    }

    def 'toString() corrects for multiple partridges'() {
        setup:
        def singularPartridge = new Gift(1, 'partridges')
        def pluralPartridges = new Gift(many, 'partridges')

        expect:
        singularPartridge.toString() == '1 partridge'
        pluralPartridges.toString() == "$many partridges"

        where:
        many << (2..12)
    }

}
