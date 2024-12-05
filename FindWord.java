import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScan = new Scanner(System.in);
        
        String searchString = inputScan.next(); 
        String patternString = inputScan.next(); 
        String fileString = inputScan.next(); 
        
        inputScan.close();

    // ---------- logic ---------------
        if (!searchString.equals("search")) {
            System.out.println("What are you doing?!");
        }
        else {
            File file = new File(fileString);
           
            Scanner fileScanner = new Scanner(file);
           
            int n = 0;
            int linenr = 0;
            while (fileScanner.hasNextLine()) {
                linenr++;

                
                String line = fileScanner.nextLine();
                
                if (line.contains(patternString)) {
                    String[] words = line.split(" ");
                    for (String word : words) {
                        if (word.equals(patternString)) {
                            System.out.println("Occurrence: "+ n + " " + "Line number:" + linenr + "\n" + line + "\n");
                            n++;
                        }
                    }
                }
                
            }
            System.out.println("Number of occurances: " + n);

        }
    }
}