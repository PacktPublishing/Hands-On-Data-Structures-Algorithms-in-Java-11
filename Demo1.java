import java.time.*;

public class Demo1 {

    // This is our "Print Text" example
    public static void main(String[] args) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        int nbrTimes = 800;
        printText(nbrTimes);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    public static void printText(int nTimes) {
        if (nTimes > 0) {
            System.out.println("Print number " + nTimes);
            printText(nTimes - 1);
        }
    }
}
