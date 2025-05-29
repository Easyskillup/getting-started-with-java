package demo.inheritance.banking;

public class BankTestMain {

    public static void main(String[] args) {
        // Runtime polymorphism
        /**
         * Virtual Method Invocation, how Java dynamically determines at runtime which method to call
         * while working with inheritance and overriding.
         */
        BankAccount account = new SavingsAccount("James", 10000.0, 0.04);

        account.displayBalance();
        account.calculateInterest();

        System.out.println("--------------------");

        account = new FixedDepositAccount("John", 12000.0, 48, 0.07);

        account.displayBalance();
        account.calculateInterest();
    }
}
