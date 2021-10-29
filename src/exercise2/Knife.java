package exercise2;

public class Knife extends Cutlery{
    private int sharpNess;
    private boolean isBreadKnife;

    public Knife(String material, int length, int weight, String brand, int sharpNess, boolean isBreadKnife) {
        super(material, length, weight, brand);
        this.sharpNess = sharpNess;
        this.isBreadKnife = isBreadKnife;
    }

    @Override
    public void callType() {
        System.out.println("This is a knife");
    }


    @Override
    public String toString() {
        return "Knife{" +
                "sharpNess=" + sharpNess +
                ", isBreadKnife=" + isBreadKnife +
                "} " + super.toString();
    }
}
