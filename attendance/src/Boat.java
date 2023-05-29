public class Boat extends Vehicle{
    private String Name="Fandango Yacht";

    private String mainSailColor;

    public void setmainSailColor(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }

    public String getmainSailColor() {
        return mainSailColor;
    }

    public void floating() {
        System.out.println("Fandango Yacht is floating");
    }
    
}
