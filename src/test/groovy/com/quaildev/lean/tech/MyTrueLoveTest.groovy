package com.quaildev.lean.tech

import spock.lang.Specification

import static java.lang.Integer.MAX_VALUE
import static java.lang.Integer.MIN_VALUE

class MyTrueLoveTest extends Specification {

    def myTrueLove = new MyTrueLove()

    def 'my true love only gives presents during the twelve days of Christmas'() {
        setup:
        myTrueLove.onDay day

        expect:
        myTrueLove.hasGivenToMe().isEmpty()

        where:
        day << [MIN_VALUE, -1, 0, 13, MAX_VALUE]
    }

    def 'on the first day of Christmas'() {
        setup:
        myTrueLove.onDay 1

        expect:
        myTrueLove.hasGivenToMe() == [
                '1 partridge in a pear tree'
        ]
    }

    def 'on the second day of Christmas'() {
        setup:
        myTrueLove.onDay 2

        expect:
        myTrueLove.hasGivenToMe() == [
                "2 partridges in a pear tree",
                "2 turtle doves"
        ]
    }

    def 'on the third day of Christmas'() {
        setup:
        myTrueLove.onDay 3

        expect:
        myTrueLove.hasGivenToMe() == [
                "3 partridges in a pear tree",
                "4 turtle doves",
                "3 French hens"
        ]
    }

    def 'on the fourth day of Christmas'() {
        setup:
        myTrueLove.onDay 4

        expect:
        myTrueLove.hasGivenToMe() == [
                "4 partridges in a pear tree",
                "6 turtle doves",
                "6 French hens",
                "4 calling birds"
        ]
    }

    def 'on the fifth day of Christmas'() {
        setup:
        myTrueLove.onDay 5

        expect:
        myTrueLove.hasGivenToMe() == [
                "5 partridges in a pear tree",
                "8 turtle doves",
                "9 French hens",
                "8 calling birds",
                "5 golden rings"
        ]
    }

    def 'on the sixth day of Christmas'() {
        setup:
        myTrueLove.onDay 6

        expect:
        myTrueLove.hasGivenToMe() == [
                "6 partridges in a pear tree",
                "10 turtle doves",
                "12 French hens",
                "12 calling birds",
                "10 golden rings",
                "6 geese a-laying"
        ]
    }

    def 'on the seventh day of Christmas'() {
        setup:
        myTrueLove.onDay 7

        expect:
        myTrueLove.hasGivenToMe() == [
                "7 partridges in a pear tree",
                "12 turtle doves",
                "15 French hens",
                "16 calling birds",
                "15 golden rings",
                "12 geese a-laying",
                "7 swans a-swimming"
        ]
    }

    def 'on the eighth day of Christmas'() {
        setup:
        myTrueLove.onDay 8

        expect:
        myTrueLove.hasGivenToMe() == [
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

    def 'on the ninth day of Christmas'() {
        setup:
        myTrueLove.onDay 9

        expect:
        myTrueLove.hasGivenToMe() == [
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

    def 'on the tenth day of Christmas'() {
        setup:
        myTrueLove.onDay 10

        expect:
        myTrueLove.hasGivenToMe() == [
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

    def 'on the eleventh day of Christmas'() {
        setup:
        myTrueLove.onDay 11

        expect:
        myTrueLove.hasGivenToMe() == [
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

    def 'on the twelfth day of Christmas'() {
        setup:
        myTrueLove.onDay 12

        expect:
        myTrueLove.hasGivenToMe() == [
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
