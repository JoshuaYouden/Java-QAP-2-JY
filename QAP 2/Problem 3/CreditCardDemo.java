public class CreditCardDemo {
    public static void main(String[] args) {
        final Money limit = new Money(1000);
        final Money first_Amount = new Money(200);
        final Money second_Amount = new Money(10.02);
        final Money third_Amount = new Money(25);
        final Money fourth_Amount = new Money(990);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, limit);

        System.out.println();

        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());

        System.out.println();

        System.out.println("Attempting to charge: " + first_Amount);
        visa.charge(first_Amount);
        System.out.println("Balance: " + visa.getBalance().subtract(first_Amount));

        System.out.println("Attempting to charge: " + second_Amount);
        visa.charge(second_Amount);
        System.out.println("Balance: " + visa.getBalance().subtract(second_Amount));

        System.out.println("Attempting to pay: " + third_Amount);
        visa.payment(third_Amount);
        System.out.println("Balance: " + visa.getBalance().subtract(third_Amount));

        System.out.println("Attempting to charge: " + fourth_Amount);
        visa.charge(fourth_Amount);
        System.out.println("Balance: " + visa.getBalance().subtract(fourth_Amount));
}
}
