import java.lang.*;
import java.time.*;

public class _Template {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        /*

        Code Goes Here

        */

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
