package exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cutlery> cutleryDrawer = new ArrayList<Cutlery>();
        cutleryDrawer.add(new Knife("Iron", 14, 20, "Royal Copenhagen", 4, false));
        cutleryDrawer.add(new Knife("Wood", 13, 5, "OutdoorStuff", 1, false));
        cutleryDrawer.add(new Spoon("Aluminium", 12, 14, "IKEA", 2.3, false));
        cutleryDrawer.add(new Spoon("Aluminium", 5, 7, "IKEA", 1.5, true));
        cutleryDrawer.add(new Fork("Iron", 10, 17, "Imerco", 3));
        cutleryDrawer.add(new Fork("Plastic", 11, 6, "Idémøbler", 4));
        System.out.println("In the drawer there is a total of " + Cutlery.getAmountOfCutlery() + " pieces of cutlery.");
        seeInsideDrawer(cutleryDrawer);
    }

    //metode som indtager et ArrayList af cutlery (Altså enten, knife, fork, spoon eller cutlery) og printer toString ud af hvert element.
    static void seeInsideDrawer(ArrayList<Cutlery> drawer){
        System.out.println("Inside your cutlery drawer you have theese items:");
        for (int i = 0; i < drawer.size(); i++) {
            System.out.println(drawer.get(i));
        }

    }
}
