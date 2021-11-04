package exercise2;

public class Cutlery {
    private String material;
    private int length;
    private int weight;
    private String brand;
    private static int amountOfCutlery;

    public Cutlery(String material, int length, int weight, String brand) {
        this.material = material;
        this.length = length;
        this.weight = weight;
        this.brand = brand;
        amountOfCutlery++;
    }

    public void callType(){

    }

    public static int getAmountOfCutlery() {
        return amountOfCutlery;
    }

    @Override
    public String toString() {
        return "Cutlery{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
