package demo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    /**
     * Java DateTime API, introduced from version 8.
     * LocalDate            Date without time
     * LocalTime            Time without date
     * LocalDateTime        Date and time
     * Duration             Time based values [hours, minutes, seconds]
     * ZoneId               Represents a time zone
     * ZonedDateTime        Date and time with timezone
     * Period               Date based values [day, week, year]
     * DateTimeFormatter    Parsing and Formatting of Date & time objects
     */

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);

        LocalDate startDate = LocalDate.of(2025, 5, 20);
        LocalDate endDate = LocalDate.of(2025, 6, 9);
        Period period = Period.between(startDate, endDate);

        System.out.println("Period: " + period.getDays());

        LocalTime startTime = LocalTime.of(11, 30, 00);
        LocalTime endTime = LocalTime.of(13, 30, 00);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Duration: Hours: " + duration.toHours() + " minutes : " + duration.toMinutes());

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm a");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm a");

        System.out.println(currentDate);
        // format method returns a string based on the date format
        System.out.println("Formatted Date: " + currentDate.format(dateFormat));
        System.out.println("Formatted DateTime: " + currentDateTime.format(dateTimeFormat));

        System.out.println("Reminder Date: " + currentDate.plusDays(30).format(dateFormat));
        System.out.println("Current Time: " + currentTime.format(timeFormat));
        System.out.println("End Time: " + currentTime.plusHours(2).plusMinutes(30).format(timeFormat));

        ZoneId usZone = ZoneId.of("America/New_York");
        ZoneId parisZone = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedUSDateTime = ZonedDateTime.now(usZone);
        System.out.println("US New York: " + zonedUSDateTime.format(dateTimeFormat));
        System.out.println("Europe Paris: " + ZonedDateTime.now(parisZone).format(dateTimeFormat));

    }

}
