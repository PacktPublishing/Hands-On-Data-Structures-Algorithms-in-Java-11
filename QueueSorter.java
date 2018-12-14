import java.lang.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class QueueSorter {

    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Creating a Priority Queue
        PriorityQueue<String> pqStrings = new PriorityQueue<>();

        // Adding elements to our Priority Queue (Planets)
        pqStrings.add("Venus");
        pqStrings.add("Saturn");
        pqStrings.add("Earth");
        pqStrings.add("Uranus");
        pqStrings.add("Neptune");
        pqStrings.add("Mars");
        pqStrings.add("Jupiter");
        pqStrings.add("Mecury");

        // Creating a Priority Queue
        PriorityQueue<Integer> pqIntegers = new PriorityQueue<>();

        // Adding elements to our Priority Queue (Integers)
        pqIntegers.add(345);
        pqIntegers.add(243);
        pqIntegers.add(651);
        pqIntegers.add(111);
        pqIntegers.add(599);
        pqIntegers.add(792);
        pqIntegers.add(828);
        pqIntegers.add(465);

        // Print the Priority Queues
        System.out.println();
        System.out.println(pqStrings);
        System.out.println(pqIntegers);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }
}