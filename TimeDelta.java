import java.lang.*;
import java.time.*;

public class TimeDelta {
    public static void main(String args[])
    {
        // Output current date-time in UTC
        Instant start = Instant.now ();
        String outputStart = start.toString ();

        String strS = "matryoshka";
        String strC = "try";
        boolean isFound = strS.indexOf(strC) !=-1? true: false;
        if (isFound) {
            System.out.println("Substring found!");
        } else
            System.out.println("SubString not found.");

        System.out.println("Source String Length: " + strS.length());
        System.out.println("Pattern String Length: " + strC.length());

        // Output current date-time in UTC
        Instant end = Instant.now ();
        String outputEnd = end.toString ();

        long delta = Duration.between(start, end).toMillis();
        System.out.println("\n");
        System.out.println("Start Time: " + outputStart);
        System.out.println("End Time: " + outputEnd);
        System.out.println("Time elapsed: " + delta + " milliseconds.");
    }
}
