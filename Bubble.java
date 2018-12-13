import java.lang.*;
import java.time.*;

public class Bubble {
    public static void main(String args[]) {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Prepare String for sorting
        String charactersToSort = "trfyo";
        int i, j;
        char tChar; // temp char used for swapping
        int arraySize = 0;
        int stringSize = charactersToSort.length();
        char charArray[] = new char[stringSize];

        for (i = 0; i < stringSize; i++) {
            charArray[i] = charactersToSort.charAt(i);
            arraySize++;
        }

        // Bubble Sort Implementation
        for (i=0; i < (arraySize - 1); ++i){
            for  (j=i+1; j > 0; --j) {
                if (charArray[j] < charArray[j-1]) {
                    // swap left and right values
                    tChar = charArray[j];
                    charArray[j] = charArray[j-1];
                    charArray[j-1] = tChar;
                }
            }
        }
        System.out.print("Result: ");
        for (i = 0; i <stringSize; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
