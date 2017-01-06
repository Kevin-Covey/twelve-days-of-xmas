package com.quaildev.lean.tech

import spock.lang.Specification

class TrueLoveTest extends Specification {

    def trueLove = new TrueLove()

    def "my true love only gives presents during the twelve days of Christmas"() {
        setup:
        trueLove.dayOfChristmas = day

        expect:
        trueLove.hasGivenToMe().size() == 0

        where:
        day << [Integer.MIN_VALUE, -1, 0, 13, Integer.MAX_VALUE]
    }

    def "on the first day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 1

        expect:
        trueLove.hasGivenToMe() == [
                '1 partridge in a pear tree'
        ]
    }

    def "on the second day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 2

        expect:
        trueLove.hasGivenToMe() == [
                "2 partridges in a pear tree",
                "2 turtle doves"
        ]
    }

    def "on the third day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 3

        expect:
        trueLove.hasGivenToMe() == [
                "3 partridges in a pear tree",
                "4 turtle doves",
                "3 French hens"
        ]
    }

    def "on the fourth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 4

        expect:
        trueLove.hasGivenToMe() == [
                "4 partridges in a pear tree",
                "6 turtle doves",
                "6 French hens",
                "4 calling birds"
        ]
    }

    def "on the fifth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 5

        expect:
        trueLove.hasGivenToMe() == [
                "5 partridges in a pear tree",
                "8 turtle doves",
                "9 French hens",
                "8 calling birds",
                "5 golden rings"
        ]
    }

    def "on the sixth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 6

        expect:
        trueLove.hasGivenToMe() == [
                "6 partridges in a pear tree",
                "10 turtle doves",
                "12 French hens",
                "12 calling birds",
                "10 golden rings",
                "6 geese a-laying"
        ]
    }

    def "on the seventh day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 7

        expect:
        trueLove.hasGivenToMe() == [
                "7 partridges in a pear tree",
                "12 turtle doves",
                "15 French hens",
                "16 calling birds",
                "15 golden rings",
                "12 geese a-laying",
                "7 swans a-swimming"
        ]
    }

    def "on the eighth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 8

        expect:
        trueLove.hasGivenToMe() == [
                "8 partridges in a pear tree",
                "14 turtle doves",
                "18 French hens",
                "20 calling birds",
                "20 golden rings",
                "18 geese a-laying",
                "14 swans a-swimming",
                "8 maids a-milking"
        ]
    }

    def "on the ninth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 9

        expect:
        trueLove.hasGivenToMe() == [
                "9 partridges in a pear tree",
                "16 turtle doves",
                "21 French hens",
                "24 calling birds",
                "25 golden rings",
                "24 geese a-laying",
                "21 swans a-swimming",
                "16 maids a-milking",
                "9 ladies dancing"
        ]
    }

    def "on the tenth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 10

        expect:
        trueLove.hasGivenToMe() == [
                "10 partridges in a pear tree",
                "18 turtle doves",
                "24 French hens",
                "28 calling birds",
                "30 golden rings",
                "30 geese a-laying",
                "28 swans a-swimming",
                "24 maids a-milking",
                "18 ladies dancing",
                "10 lords a-leaping"
        ]
    }

    def "on the eleventh day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 11

        expect:
        trueLove.hasGivenToMe() == [
                "11 partridges in a pear tree",
                "20 turtle doves",
                "27 French hens",
                "32 calling birds",
                "35 golden rings",
                "36 geese a-laying",
                "35 swans a-swimming",
                "32 maids a-milking",
                "27 ladies dancing",
                "20 lords a-leaping",
                "11 pipers piping"
        ]
    }

    def "on the twelfth day of Christmas"() {
        setup:
        trueLove.dayOfChristmas = 12

        expect:
        trueLove.hasGivenToMe() == [
                "12 partridges in a pear tree",
                "22 turtle doves",
                "30 French hens",
                "36 calling birds",
                "40 golden rings",
                "42 geese a-laying",
                "42 swans a-swimming",
                "40 maids a-milking",
                "36 ladies dancing",
                "30 lords a-leaping",
                "22 pipers piping",
                "12 drummers drumming"
        ]
    }

}
