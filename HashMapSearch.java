import java.lang.*;
import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapSearch {

    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create a HashMap
        Map<String, Integer> playerToJerseyMapping = new HashMap<>();

        // Add key-value pairs
        playerToJerseyMapping.put("Kobe", 8);
        playerToJerseyMapping.put("Magic", 32);
        playerToJerseyMapping.put("Kareem", 33);
        playerToJerseyMapping.put("Wilt", 13);
        playerToJerseyMapping.put("Chamberlain", 13);
        playerToJerseyMapping.put("Worthy", 42);
        playerToJerseyMapping.put("West", 44);
        playerToJerseyMapping.put("Goodrich", 25);
        playerToJerseyMapping.put("O'Neal", 34);
        playerToJerseyMapping.put("Wilkes", 52);
        playerToJerseyMapping.put("Baylor", 22);

        // See if HashMap is empty
        if (playerToJerseyMapping.isEmpty()) {
            System.out.println("Hash Map is Empty");
        } else {
                // Output HashMap
                System.out.println();
                System.out.println(playerToJerseyMapping);
                // Determine & Output Size
                System.out.println("Hash Map Size: " + playerToJerseyMapping.size());
        }

        // Search for specific key
        String theKey = "Kobe";
        if (playerToJerseyMapping.containsKey(theKey)) {
            System.out.println(theKey + " has jersey number " +
                    playerToJerseyMapping.get(theKey));
        } else {
            System.out.println(theKey + " was not found.");
        }

        // Search for specific value
        int theValue = 32;
        if (playerToJerseyMapping.containsValue(theValue)) {
            System.out.println("Jersey number " + theValue + " is already taken.");
        } else {
            System.out.println("Jersey Number " + theValue + " is available.");
        }
        // Search for specific value
        theValue = 24;
        if (playerToJerseyMapping.containsValue(theValue)) {
            System.out.println("Jersey number " + theValue + " is already taken.");
        } else {
            System.out.println("Jersey Number " + theValue + " is available.");
        }

        // Replace a value
        int newJerseyNumber = 24;
        playerToJerseyMapping.replace("Kobe", newJerseyNumber);

        // Remove a mapping
        playerToJerseyMapping.remove("Chamberlain");

        // Output HashMap
        System.out.println(playerToJerseyMapping);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
