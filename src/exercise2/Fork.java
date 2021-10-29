package exercise2;

public class Fork extends Cutlery{
    private int amountOfPoints;

    public Fork(String material, int length, int weight, String brand, int amountOfPoints) {
        super(material, length, weight, brand);
        this.amountOfPoints = amountOfPoints;
    }

    @Override
    public void callType() {
        System.out.println("This is a fork");
    }


    @Override
    public String toString() {
        return "Fork{" +
                "amountOfPoints=" + amountOfPoints +
                "} " + super.toString();
    }
}
