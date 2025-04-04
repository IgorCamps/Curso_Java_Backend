package EstudosDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2025-02-13T01:30:26");
        Instant d06 = Instant.parse("2025-02-13T01:30:26Z");


        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " +nextWeekLocalDate);

        LocalDateTime pastWeekLocalTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalTime = d05.plusDays(7);

        System.out.println("pastWeekLocalTime = " + pastWeekLocalTime);
        System.out.println("nextWeekLocalTime = " + nextWeekLocalTime);


        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0 , 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}
