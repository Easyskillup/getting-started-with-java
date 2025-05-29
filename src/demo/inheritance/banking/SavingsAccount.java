package demo.inheritance.banking;

public class SavingsAccount extends BankAccount {
    // final variables must be initialized when they are declared, or with a constructor
    private final double interest;
    public SavingsAccount(String accountHolder, double balance, double interest) {
        super(accountHolder, balance);
        this.interest = interest;
    }

    /**
     * Method overriding
     * Use the @Override annotation
     * Overridden methods cannot be less permissive.
     */
    @Override
    public void calculateInterest() {
        double savingsInterest = getBalance() * interest;
        System.out.println("Savings interest : $ " + savingsInterest);
    }

}
