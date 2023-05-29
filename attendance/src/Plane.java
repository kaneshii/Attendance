public class Plane extends Vehicle {
    private String Name="U2 Spy Plane";

    private int wingSpan;

    public void setwingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getwingSpan() {
        return wingSpan;
    }

    public void fly() {
        System.out.println("U2 Spy Plane is flying");
    }
}
