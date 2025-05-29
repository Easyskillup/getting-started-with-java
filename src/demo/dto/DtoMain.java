package demo.dto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DtoMain {
    public static void main(String[] args) {
        Batch batch1 = new Batch(
                "B001",
                LocalDate.now(),
                LocalDate.now().plus(30, ChronoUnit.DAYS),
                30,
                new String[]{"Ashish"},
                new String[]{"OOP", "Java"}
        );

        BatchRecord batchRecord = new BatchRecord(
                "B001",
                LocalDate.now(),
                LocalDate.now().plus(30, ChronoUnit.DAYS),
                30,
                new String[]{"Ashish"},
                new String[]{"OOP", "Java"}
        );

        System.out.println(batchRecord);

    }
}
