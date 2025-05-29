package demo.inheritance.banking;

/**
 * Abstract classes can have both abstract and non abstract methods.
 * Abstract classes cannot be instantiated. They can be used in inheritance.
 * All abstract methods must be overridden while inheriting.
 */
public abstract class BankAccount {

    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * abstract methods are incomplete methods, they have a definition, but no method body.
     * they can only be defined in an abstract class
     */
    protected abstract void calculateInterest();

    public void displayBalance() {
        System.out.println(accountHolder + "'s balance: $" + balance);
    }
}
