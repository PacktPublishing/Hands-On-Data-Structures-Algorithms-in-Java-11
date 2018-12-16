import java.lang.*;
import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create a HashMap
        Map<String, Integer> playerToJerseyMapping = new HashMap<>();

        // Add key-value pairs
        playerToJerseyMapping.put("Kobe", 24);
        playerToJerseyMapping.put("Magic", 32);
        playerToJerseyMapping.put("Kareem", 33);
        playerToJerseyMapping.put("Chamberlain", 13);

        playerToJerseyMapping.putIfAbsent("Worthy", 42);
        playerToJerseyMapping.putIfAbsent("West", 44);

        playerToJerseyMapping.put("West", 88);
        playerToJerseyMapping.putIfAbsent("West", 99);

        playerToJerseyMapping.put("Baylor", null);
        playerToJerseyMapping.put(null, 22);
        playerToJerseyMapping.put(null, null);

        // Output HashMap
        System.out.println();
        System.out.println(playerToJerseyMapping);
        System.out.println();

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
