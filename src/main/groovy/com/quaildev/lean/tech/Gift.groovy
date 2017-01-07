package com.quaildev.lean.tech

class Gift {
    int quantity
    String description

    Gift(int quantity, String description) {
        this.quantity = quantity
        this.description = description
    }

    Gift multiply(int numberOfDaysGiven) {
        new Gift(quantity * numberOfDaysGiven, description)
    }

    @Override
    boolean equals(Object other) {
        description == other.description
    }

    @Override
    String toString() {
        def asString = "$quantity $description"
        hasOnePartridge() ? asString.replace('partridges', 'partridge') : asString
    }

    private boolean hasOnePartridge() {
        description.contains("partridges") && quantity == 1
    }
}
