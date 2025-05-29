package demo.inheritance.banking;

public class FixedDepositAccount extends BankAccount {
    private int months;
    private final double interest;

    public FixedDepositAccount(String accountHolder, double balance, int months, double interest) {
        super(accountHolder, balance);
        this.months = months;
        this.interest = interest;
    }

    /**
     * Method overriding: Redefine the base class methods in the child class.
     */
    @Override
    public void calculateInterest() {
        double fdInterest = getBalance() * interest * (months / 12);
        System.out.println("FD interest for " + months + " months : $ " + fdInterest);
    }
}
