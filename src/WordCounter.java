import java.io.File;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) throws Exception {
        File file = new File("src/sampletext.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
           words += line.split(" ").length; //output how many words in each line
        }
        System.out.println("The file contains: " + words + " words.");
    }
}
