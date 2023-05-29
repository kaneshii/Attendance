public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setPrice(300000.69);
        car.setSpeed(180);
        car.setTireType("goodyear");
        System.out.println("Toyota VIOS Color: " + car.getColor());
        System.out.println("Toyota VIOS Price: " + car.getPrice());
        System.out.println("Toyota VIOS Speed: " + car.getSpeed());
        System.out.println("Toyota VIOS Tire Type: " + car.getTireType());
        System.out.println();
        car.drive();
        car.stop();
        System.out.println();

        Plane plane = new Plane();
        plane.setColor("gray");
        plane.setPrice(179000.22);
        plane.setSpeed(220);
        plane.setwingSpan(12);
        System.out.println("U2 Spy Plane Color: " + plane.getColor());
        System.out.println("U2 Spy Plane Price: " + plane.getPrice());
        System.out.println("U2 Spy Plane Speed: " + plane.getSpeed());
        System.out.println("U2 Spy Plane Wing Span: " + plane.getwingSpan());
        System.out.println();
        plane.fly();
        plane.stop();
        System.out.println();

        Boat boat = new Boat();
        boat.setColor("white");
        boat.setPrice(777777.77);
        boat.setSpeed(90);
        boat.setmainSailColor("red");
        System.out.println("Fandango Yacht Color :" + boat.getColor());
        System.out.println("Fandango Yacht Price:" + boat.getPrice());
        System.out.println("Fandango Yacht Speed:" + boat.getSpeed());
        System.out.println("Fandango Yacht Main sail color:" + boat.getmainSailColor());
        System.out.println();
        boat.floating();
        boat.stop();
        System.out.println();
    }
}
