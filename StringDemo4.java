import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class StringDemo4 {
    public static void main(String [ ] args) throws FileNotFoundException {
        String fullText = "";
        try {

            FileReader myReader = new FileReader(new File("/Users/edljr/Dropbox (three19)/Java/IdeaProjects/StringDemonstration/src/sourcefile.txt"));
            Scanner scan = new Scanner(myReader);
            while(scan.hasNextLine()){
                fullText = fullText + scan.nextLine();
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something when wrong.");
            e.printStackTrace();
        }
        System.out.println(fullText);
    }
}


