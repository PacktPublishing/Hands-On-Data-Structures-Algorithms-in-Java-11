import java.time.*;

public class Demo4 {

    // This is our "Fibonacci Sequence" example

    static int nFirst = 0;
    static int nSecond = 1;
    static int nThird = 0;

    public static void main(String[] args) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        int nCount = 200;

        System.out.println();
        System.out.print(nFirst + "\t" + nSecond);
        calcuateFibonacci(nCount-2);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    static void calcuateFibonacci(int nCount) {
        if (nCount > 0) {
            nThird = nFirst + nSecond;
            nFirst = nSecond;
            nSecond = nThird;
            System.out.print("\t" + nThird);
            calcuateFibonacci(nCount - 1);
        }
    }
}
