package demo.dto;

import java.time.LocalDate;

/**
 * Records in Java
 * record <recordName> () {}
 * This will automatically create a constructor, getters, equals, hashCode, toString()
 * All the properties in the record are final
 * Records classes are implicitly final so they cannot be extended
 */
public record BatchRecord(
        String batchCode,
        LocalDate startDate,
        LocalDate endDate,
        int duration,
        String[] mentors,
        String[] topics
) {
}
