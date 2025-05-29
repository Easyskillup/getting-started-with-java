package demo.inheritance;

public class Vehicle {

    private String model;

    public Vehicle() {
        System.out.println("Vehicle constructor 1.");
    }

    // this keyword, refers to the current instance of the class
    public Vehicle(String model) {
        this.model = model;
        System.out.println("Vehicle constructor 2.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println(model + " starting.");
    }

    public void stop() {
        System.out.println(model + " stopping.");
    }
}
