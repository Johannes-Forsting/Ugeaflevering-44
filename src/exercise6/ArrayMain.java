package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMain {
    static ArrayList<Integer> numberArray = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Tilføjer alle tal fra 1-100 til ArrayListen.
        for (int i = 1; i <= 100; i++) {
            numberArray.add(i);
        }
        System.out.println(numberArray.toString());
        int numberToRemove = getInteger(1, 100);
        removeNumbers(numberToRemove);
        System.out.println(numberArray.toString());
    }

    //Metode som bruger lineær søgning til at tjekke om parametren går op i nogle tal i ArrayListen.
    //I tilfælde af et tal gør dette, bliver tallet fjernet fra listen.
    static void removeNumbers(int x){
        for (int i = 0; i < numberArray.size(); i++) {
            int number = numberArray.get(i);
            if(number % x == 0){
                numberArray.remove(i);
            }
        }
    }


    //Metode som returnere en int, og gør at den kun godtager et tal mellem min og max.
    //Samtidig crasher den ikke hvis man indtaster andet end en integer.
    static int getInteger(int min, int max){
        System.out.println("What number would you like to choose?");
        int choice;
        while (true){
            try{
                choice = scanner.nextInt();
                if(choice >= min && choice <= max){
                    break;
                }
            }
            catch (Exception e){
                scanner.nextLine();
                System.out.println("Only type in 1 number please");
            }
        }
        return choice;
    }
}
