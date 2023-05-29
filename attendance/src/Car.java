public class Car extends Vehicle{
    private String Name="ToyotaVIOS";

    private String tireType;

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getTireType() {
        return tireType;
    }

    public void drive() {
        System.out.println("Toyota VIOS is driving.");
    }
}
