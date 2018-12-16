import java.lang.*;
import java.time.*;
import java.util.*;
import java.util.Map.Entry;

public class HashMapSort {

    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Create a HashMap
        HashMap<String, String> players = new HashMap<>();

        // Add key-value pairs
        players.put("Kobe", "Bryant");
        players.put("Magic", "Johnson");
        players.put("Kareem", "Abdul-Jabbar");
        players.put("Wilt", "Chamberlain");
        players.put("James", "Worthy");
        players.put("Jerry", "West");
        players.put("Gail", "Goodrich");
        players.put("Shaquille", "O'Neal");
        players.put("Jamaal", "Wilkes");
        players.put("Elgin", "Baylor");

        // Output unsorted Hash Map Header
        System.out.println("\n- - - - - - - - - -");
        System.out.println("ORIGINAL / UNSORTED:");
        System.out.println("- - - - - - - - - -");
        // Output unsorted Hash Map Content as a List
        Set<Entry<String, String>> entries = players.entrySet();
        for(Entry<String, String> entry : entries)
        {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        TreeMap<String, String> sorted = new TreeMap<>(players);
        Set<Entry<String, String>> mappings = sorted.entrySet();

        // Output Sorted Hash Map Header
        System.out.println("\n- - - - - - - - - -");
        System.out.println("FIRST NAME SORT (Key):");
        System.out.println("- - - - - - - - - -");
        // Output Sorted Hash Map Content as a List
        for(Entry<String, String> mapping : mappings){
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }

        // lambda expression for comparison sort
        Comparator<Entry<String, String>> valueComparator = (e1, e2) -> {
            String v1 = e1.getValue();
            String v2 = e2.getValue();
            return v1.compareTo(v2);
        };

        List<Entry<String, String>> listOfEntries = new ArrayList<>(entries);

        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<>(listOfEntries.size());

        for(Entry<String, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        // Output Sorted Hash Map Header
        System.out.println("\n- - - - - - - - - -");
        System.out.println("LAST NAME (VALUE) SORT:");
        System.out.println("- - - - - - - - - -");
        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        // Output Sorted Hash Map Content as a List
        for(Entry<String, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getValue() + ", " + mapping.getKey());
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
