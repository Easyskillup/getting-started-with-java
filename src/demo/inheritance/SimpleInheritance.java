package demo.inheritance;

public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Vehicle");
        Vehicle v = new Vehicle();
        v.setModel("Pickup");
        v.start();
        v.stop();
        System.out.println();

        System.out.println("Car");
        Car c = new Car("Innova");
//        c.setModel("Innova");
        c.start();
        c.playMusic();
        c.stop();
        System.out.println();

        System.out.println("Super Car");
        SuperCar sc = new SuperCar("Mclaren");
//        sc.setModel("Aventador");
        sc.start();
        sc.tuneEngine();
        sc.stop();
    }
}
