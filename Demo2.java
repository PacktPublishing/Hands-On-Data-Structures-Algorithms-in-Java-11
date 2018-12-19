import java.time.*;

public class Demo2 {

    // This is our "Factorial" example #1

    public static void main(String[] args) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        int nbrToCompute = 10;
        System.out.println("\nThe factorial of " + nbrToCompute +
                " is " + factorial(nbrToCompute));

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    public static int factorial(int nTimes) {
        if (nTimes <= 0)
            return 1;
        else
            return (nTimes * factorial(nTimes - 1));
    }
}


