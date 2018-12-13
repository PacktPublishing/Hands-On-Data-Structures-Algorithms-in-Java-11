import java.lang.*;
import java.time.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class NaiveStringMatching {
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

        // Implement the Naive String Matching Algorithm
        String thePattern = "ipsum"; // text to search for
        char[] aText = fullText.toCharArray();
        char[] aPattern = thePattern.toCharArray();

        int lenText = aText.length;
        int lenPattern = aPattern.length;

        for (int i = 0; i < lenText - lenPattern; i++) {

            int matchCount = 0;
            for (int j = 0; j < lenPattern; j++) {

                if (aPattern[j] != aText[i + j]) {
                    break; // pattern mismatch
                }
                matchCount++;
            }
            if (matchCount == lenPattern) {
                System.out.println("Pattern found at " + (i + 1) + " position " + (i + 1) + " (shift = " + i + ").");
                break;
            }
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
