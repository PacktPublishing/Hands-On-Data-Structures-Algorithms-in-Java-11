import java.lang.*;
import java.time.*;
import java.util.LinkedList;

public class QueueSearchDemo {

    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        LinkedList<String> fruit = new LinkedList<String>();

        fruit.add("Papaya");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Strawberry");
        fruit.add("Blueberry");
        fruit.add("Apple");
        fruit.add("Papaya");

        // [1] Action Print Queue
        System.out.println("\n[1] Action: Print Queue");
        System.out.println(fruit);

        // [2] Action Search for specific fruit
        String selectedFruit = "Papaya";
        System.out.println("\n[2] Action: Print Queue");
        for(int i=0; i < fruit.size(); i++) {
            if (fruit.get(i).equals(selectedFruit)) {
                System.out.println(selectedFruit + " found at index " + i);
            }
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

}
