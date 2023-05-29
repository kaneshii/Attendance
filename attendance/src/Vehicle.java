class Vehicle {
    private int speed;
    private String color;
    private double price;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}