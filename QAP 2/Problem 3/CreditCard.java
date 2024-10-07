public class CreditCard {
    // Attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.balance = new Money(0);
        this.creditLimit = limit;
    }

    // Methods
    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    // Get Attributes from Person.java
    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (this.balance.add(amount).compareTo(this.creditLimit) > 0) {
            System.out.println("Credit Limit Exceeded!");
        } else {
            this.balance = this.balance.add(amount);
        }
    }

    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount);
    }
}
