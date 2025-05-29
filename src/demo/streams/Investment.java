package demo.streams;

import java.time.LocalDate;

public class Investment {
    private String investorName;
    private String instrumentType; // e.g., Stock, Mutual Fund, Bond
    private String instrumentName; // e.g., Apple, HDFC Equity Fund
    private double amountInvested;
    private LocalDate investmentDate;
    private double currentValue;

    public Investment(String investorName, String instrumentType, String instrumentName,
                      double amountInvested, LocalDate investmentDate, double currentValue) {
        this.investorName = investorName;
        this.instrumentType = instrumentType;
        this.instrumentName = instrumentName;
        this.amountInvested = amountInvested;
        this.investmentDate = investmentDate;
        this.currentValue = currentValue;
    }

    // Getters
    public String getInvestorName() { return investorName; }
    public String getInstrumentType() { return instrumentType; }
    public String getInstrumentName() { return instrumentName; }
    public double getAmountInvested() { return amountInvested; }
    public LocalDate getInvestmentDate() { return investmentDate; }
    public double getCurrentValue() { return currentValue; }

    @Override
    public String toString() {
        return "%s (%s) - Invested: %.2f, Current: %.2f".formatted(
                instrumentName, instrumentType, amountInvested, currentValue
        );
    }
}

