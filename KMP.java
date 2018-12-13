import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.*;
import java.time.*;
import java.util.Scanner;

public class KMP {
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
        String thePattern = "ipsum"; // text to search for
        // Implement KMP String Matching Algorithm
        int M = thePattern.length();
        int N = fullText.length();
        int i = 1;
        int j = 0;
        int len = 0;

        // create suffix array
        int[] suffix = new int[M];
        suffix[0] = 0;

        // Pre-compute the pattern
        while (i < M) {
            if (thePattern.charAt(i) == thePattern.charAt(len)) {
                len++;
                suffix[i] = len;
                i++;
            }
            else
            {
                if (len != 0) {
                    len = suffix[len - 1];
                }
                else
                {
                    suffix[i] = len;
                    i++;
                }
            }
        }

        while (i < N) {
            if (thePattern.charAt(j) == fullText.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = suffix[j - 1];
            }

            else if (i < N && thePattern.charAt(j) != fullText.charAt(i)) {
                if (j != 0)
                    j = suffix[j - 1];
                else
                    i = i + 1;
            }
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }
}
