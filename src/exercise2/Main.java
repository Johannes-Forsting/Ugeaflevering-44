package exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cutlery> cutleryDrawer = new ArrayList<Cutlery>();
        Cutlery knife1 = new Knife("Iron", 14, 20, "Royal Copenhagen", 4, false);
        Cutlery knife2 = new Knife("Wood", 13, 5, "OutdoorStuff", 1, false);
        Cutlery spoon1 = new Spoon("Aluminium", 12, 14, "IKEA", 2.3, false);
        Cutlery spoon2 = new Spoon("Aluminium", 5, 7, "IKEA", 1.5, true);
        Cutlery fork1 = new Fork("Iron", 10, 17, "Imerco", 3);
        Cutlery fork2 = new Fork("Plastic", 11, 6, "Idémøbler", 4);
        cutleryDrawer.add(knife1);
        cutleryDrawer.add(knife2);
        cutleryDrawer.add(spoon1);
        cutleryDrawer.add(spoon2);
        cutleryDrawer.add(fork1);
        cutleryDrawer.add(fork2);

        seeInsideDrawer(cutleryDrawer);
    }

    static void seeInsideDrawer(ArrayList<Cutlery> drawer){
        System.out.println("Inside your cutlery drawer you have theese items:");
        for (int i = 0; i < drawer.size(); i++) {
            System.out.println(drawer.get(i));
        }

    }
}
