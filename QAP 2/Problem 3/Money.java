public class Money {
    // Attributes
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Methods
    public Money add(Money otherAmount) {
        this.dollars = dollars + otherAmount.dollars;
        this.cents = cents + otherAmount.cents;

        if (cents >= 100) {
            cents = cents - 100;
            dollars = dollars + 1;
        }
        return this;
}

    public Money subtract(Money otherAmount) {
        this.dollars = dollars - otherAmount.dollars;
        this.cents = cents - otherAmount.cents;

        if (cents < 0) {
            cents = cents + 100;
            dollars = dollars - 1;
        }
        return this;
    }

    public int compareTo(Money otherAmount) {
        if (this.dollars > otherAmount.dollars) {
            return 1;
        } else if (this.dollars < otherAmount.dollars) {
            return -1;
        } else {
            if (this.cents > otherAmount.cents) {
                return 1;
            } else if (this.cents < otherAmount.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public boolean equals(Money otherObject) {
        if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "$" + dollars + "." + cents;
    }
}