package demo.streams;

import java.time.LocalDate;
import java.util.List;

public class InvestmentTracker {
    public static void main(String[] args) {
        List<Investment> portfolio = List.of(
                new Investment("Alice", "Stock", "Apple", 10000,
                        LocalDate.of(2020, 1, 1), 18000),
                new Investment("Alice", "Mutual Fund", "HDFC Equity Fund",
                        15000, LocalDate.of(2019, 6, 1), 21000),
                new Investment("Bob", "Stock", "Tesla", 12000,
                        LocalDate.of(2021, 5, 1), 25000),
                new Investment("Alice", "Bond", "GOI Bond", 5000,
                        LocalDate.of(2018, 4, 1), 6000),
                new Investment("Bob", "Mutual Fund", "SBI Bluechip Fund",
                        20000, LocalDate.of(2020, 10, 1), 27000)
        );

        // 1. Get total current value for Alice
        // 2. List all instruments with return > 50%
        // 3. Group investments by type and count
        // 4. Average ROI per instrument type
        // 5. Find the most profitable investment
    }
}
