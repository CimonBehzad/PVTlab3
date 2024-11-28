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
            while (fileScanner.hasNextLine()) {
                
                String line = fileScanner.nextLine();
                
                if(line.contains(patternString)){
                    System.out.println("Occurancek: " + n + " " + line + "\n");
                    n++;
                }
                
            }
            System.out.println("Number of occurances: " + n);

        }
    }
}