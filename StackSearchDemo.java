import java.lang.*;
import java.time.*;
import java.util.Stack;

public class StackSearchDemo {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        Stack<String> licensePlates = new Stack<>();

        // Pushing 10 new car license plates on the stack
        licensePlates.push("HQ 9932"); // first in
        licensePlates.push("QWERTY");
        licensePlates.push("MH 3340");
        licensePlates.push("CCA 319");
        licensePlates.push("MIC 95L");
        licensePlates.push("FORTY");
        licensePlates.push("LIV2WIN");
        licensePlates.push("JAVA");
        licensePlates.push("NET PRG");
        licensePlates.push("NH 7283"); // Last in

        System.out.println("\nACTION 1: Print Stack:");
        System.out.println("Result: " + licensePlates);

        // Popping Last-In from the Stack
        System.out.println("\nACTION 2: Pop Last-In:");
        String lastCarIn = licensePlates.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Result: This car left: " + lastCarIn);
        System.out.println("Result: These cars remain: " + licensePlates);

        // Get Last-In w/o removing it
        System.out.println("\nACTION 3: Peek @ Top:");
        lastCarIn = licensePlates.peek();
        System.out.println("Result: New Last-In: " + lastCarIn);

        System.out.println("\nACTION 4: Print Stack:");
        System.out.println("Result: " + licensePlates);

        // Search for license plate (element of stack)
        System.out.println("\nACTION 5: Search:");
        String toFind = "JAVA";
        int plateIndexPosition = licensePlates.search(toFind);
        if (plateIndexPosition == -1) {
            System.out.println("Result: Plate not found.");
        }
        else {
            System.out.println("Result: The car with plate \"" + toFind
                    + "\" is at position " + plateIndexPosition + ".");
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("\nTime elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
