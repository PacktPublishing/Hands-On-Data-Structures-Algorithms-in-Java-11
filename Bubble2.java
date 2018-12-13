import java.lang.*;
import java.time.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Bubble2 {
    public static void main(String args[]) throws FileNotFoundException {
        // Save current date-time in UTC
        Instant start = Instant.now();

        // Obtain text to be searched
        String fullText = "";
        FileReader myReader = new FileReader(new File("/Users/edljr/Dropbox (three19)/Java/IdeaProjects/StringDemonstration/src/sourcefile.txt"));
        Scanner scan = new Scanner(myReader);
        while(scan.hasNextLine()) {
            fullText = fullText + scan.nextLine();
        }
        scan.close();

        // Prepare String for sorting
        String charactersToSort = fullText;
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
        for (i = 0; i < stringSize; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println();


        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
