import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.*;
import java.time.*;
import java.util.Scanner;

public class Finite {
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

        // Implement the Finite Automata String Matching Algorithm
        String thePattern = "ipsum"; // text to search for
        char[] tChar = fullText.toCharArray();
        char[] pChar = thePattern.toCharArray();
        findStringMatch(pChar, tChar);

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
    }

    // function to get the next state
    static int getNextState(char[] p, int lenPattern, int state, int x) {
        if (state < lenPattern && x == p[state])
            return state + 1;
        int nextState, i;

        for (nextState = state; nextState > 0; nextState--) {
            if (p[nextState - 1] == x) {
                for (i = 0; i < nextState - 1; i++)
                    if (p[i] != p[state - nextState + 1 + i])
                        break;
                if (i == nextState - 1)
                    return nextState;
            }
        }
        return 0;
    }

    static void createFiniteAutomata(char[] p, int lenPattern, int faTable[][]) {
        int state, x;
        for (state = 0; state <= lenPattern; ++state)
            for (x = 0; x < 256; ++x)
                faTable[state][x] = getNextState(p, lenPattern, state, x);
    }

    static void findStringMatch(char[] p, char[] t) {
        int lenPattern = p.length;
        int lenText = t.length;

        int[][] faTable = new int[lenPattern+1][256];

        createFiniteAutomata(p, lenPattern, faTable);

        // Process text over faTable
        int i, state=0;
        for (i = 0; i < lenText; i++) {
            state = faTable[state][t[i]];
            if (state == lenPattern)
                System.out.println("Substring found at index " + (i-lenPattern+1) + ".");
        }
    }
}