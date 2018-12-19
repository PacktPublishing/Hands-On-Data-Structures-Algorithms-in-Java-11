import java.time.*;

public class Demo3 {

    // This is our "Factorial" example #2

    public static void main(String[] args) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        System.out.println();
        for (int nbrToCompute = 1; nbrToCompute <16; nbrToCompute++) {
            System.out.println("The factorial of " + nbrToCompute +
                    " is " + factorial(nbrToCompute));
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    public static int factorial(int nTimes) {
        if (nTimes <= 0)
            return 1;
        else
            return (nTimes * factorial(nTimes - 1));
    }
}


