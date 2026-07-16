import java.time.LocalTime;

public class TimeBefore530 {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println("Current Time : " + now);

        System.out.println("Before 5 Hours 30 Minutes : "
                + now.minusHours(5).minusMinutes(30));

    }
}