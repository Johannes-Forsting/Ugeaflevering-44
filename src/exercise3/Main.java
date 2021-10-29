package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordsInCSVFile = new ArrayList<String>();
        File f = new File("resources/words.csv");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                wordsInCSVFile.add(line);
            }
        }
        catch (FileNotFoundException e){
        }
        System.out.println(wordsInCSVFile.toString());
        int lengthOfCSVFile = wordsInCSVFile.size();
        System.out.println("There are " + lengthOfCSVFile + " words in the csv file");
    }
}
