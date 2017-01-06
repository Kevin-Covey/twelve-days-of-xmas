package com.quaildev.lean.tech

class TrueLove {

    private static final List<Gift> gifts = [
            new Gift(1, "partridge in a pear tree"),
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

    List<String> hasGivenToMe() {
        if (!(1..12).contains(dayOfChristmas)) return []
        return gifts
                .collect { new Gift((dayOfChristmas - gifts.indexOf(it)) * it.quantity, it.description) }
                .findAll { it.quantity > 0 }
                .collect { "$it" }
    }

    @Override
    String toString() {
        "Day of Christmas: $dayOfChristmas"
    }
}

class Gift {
    int quantity
    String description

    Gift(int quantity, String description) {
        this.quantity = quantity
        this.description = description
    }

    @Override
    boolean equals(Object other) {
        description == other.description
    }

    @Override
    String toString() {
        def asString = "$quantity $description"
        return hasManyPartridges() ? asString.replace("partridge", "partridges") : asString
    }

    private boolean hasManyPartridges() {
        description.contains("partridge") && quantity > 1
    }
}