package com.quaildev.lean.tech

class MyTrueLove {

    private static final List<Gift> GIFTS = [
            new Gift(1, "partridges in a pear tree"),
            new Gift(2, "turtle doves"),
            new Gift(3, "French hens"),
            new Gift(4, "calling birds"),
            new Gift(5, "golden rings"),
            new Gift(6, "geese a-laying"),
            new Gift(7, "swans a-swimming"),
            new Gift(8, "maids a-milking"),
            new Gift(9, "ladies dancing"),
            new Gift(10, "lords a-leaping"),
            new Gift(11, "pipers piping"),
            new Gift(12, "drummers drumming"),
    ]

    int dayOfChristmas

    void onDay(int day) {
        this.dayOfChristmas = day
    }

    List<String> hasGivenToMe() {
        if (isOneOfTheDaysOfChristmas()) {
            GIFTS.collect { it * numberOfDaysGiven(it) }.findAll { it.quantity > 0 }.collect { "$it" }
        } else {
            []
        }
    }

    private boolean isOneOfTheDaysOfChristmas() {
        (1..12).contains(dayOfChristmas)
    }

    private int numberOfDaysGiven(Gift giftGiven) {
        dayOfChristmas - GIFTS.indexOf(giftGiven)
    }

    @Override
    String toString() {
        "My true love on day $dayOfChristmas"
    }
}