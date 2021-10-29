package exercise2;

public class Spoon extends Cutlery{
    private double depthOfSpoonHead;
    private boolean isTeaSpoon;

    public Spoon(String material, int length, int weight, String brand, double depthOfSpoonHead, boolean isTeaSpoon) {
        super(material, length, weight, brand);
        this.depthOfSpoonHead = depthOfSpoonHead;
        this.isTeaSpoon = isTeaSpoon;
    }

    @Override
    public void callType() {
        System.out.println("This is a spoon");
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "depthOfSpoonHead=" + depthOfSpoonHead +
                ", isTeaSpoon=" + isTeaSpoon +
                "} " + super.toString();
    }
}
