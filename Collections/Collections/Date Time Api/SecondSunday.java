import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(1);

        LocalDate secondSunday = date.with(
                TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of Next Month : " + secondSunday);

    }
}