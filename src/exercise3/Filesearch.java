package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filesearch {
    public static void main(String[] args) {
        //Opretter et tomt ArrayList af Strings og en File datatype med min csv fil fra resource mappen.
        ArrayList<String> wordsInCSVFile = new ArrayList<String>();
        File f = new File("resources/words.csv");

        //Et while loop som forsætter så længe der er linjer i dokumentet, og indsætter hver enkelt linje som en String i Arraylisten.
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                wordsInCSVFile.add(line);
            }
        }
        catch (FileNotFoundException e){
        }

        //Printer alle ordene ud og får antallet af dem, som jeg også printer ud.
        System.out.println(wordsInCSVFile.toString());
        int lengthOfCSVFile = wordsInCSVFile.size();
        System.out.println("There are " + lengthOfCSVFile + " words in the csv file");
    }
}
