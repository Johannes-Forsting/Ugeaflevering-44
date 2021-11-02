package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMain {
    static ArrayList<Integer> numberArray = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            numberArray.add(i);
        }
        System.out.println(numberArray.toString());
        int numberToRemove = getInteger();
        removeNumbers(numberToRemove);
        System.out.println(numberArray.toString());
    }

    static void removeNumbers(int x){
        for (int i = 0; i < numberArray.size(); i++) {
            int number = numberArray.get(i);
            if(number % x == 0){
                numberArray.remove(i);
            }
        }
    }

    static int getInteger(){
        System.out.println("What number would you like to choose?");
        int choice;
        while (true){
            try{
                choice = scanner.nextInt();
                if(choice > 0 && choice <= 100){
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
