import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.*;
import java.time.*;
import java.util.Scanner;

public class RabinKarp {
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
        int lenText = fullText.length();
        int lenPattern = thePattern.length();
        int hT = 0; // text hash value
        int hP = 0; // pattern hash value
        int h = 1;
        int a = 256;
        int p = 139;
        int i, j;

        // setting the h value
        for (i=0; i < lenPattern-1; i++)
            h = (h*a)%p;

        // here we determine the initial hash values
        for (i=0; i< lenPattern; i++) {
            hP = (a*hP + thePattern.charAt(i))%p;
            hT = (a*hT + fullText.charAt(i))%p;
        }

        // Shift the pattern to the right
        for (i=0; i<= lenText; i++) {
            if (hP == hT) {
                for (j = 0; j < lenPattern; j++) {
                    if (fullText.charAt(i+j) != thePattern.charAt(j))
                        break;
                }
                if (j == lenPattern)
                    System.out.println("Your search string was found at index " + i + ".");
            }
            if (i < lenText-lenPattern) {
                hT = (a*(hT - fullText.charAt(i) * h) + fullText.charAt(i+lenPattern))%p;

                // make hT positive if found to be negative
                if (hT < 0)
                    hT = (hT + p);
            }
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
