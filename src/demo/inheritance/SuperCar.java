package demo.inheritance;

public class SuperCar extends Car {

    /**
     * super keyword, allows us to refer the content in the base class.
     * super() allows us to call the base class constructor
     */
    public SuperCar() {
        System.out.println("SuperCar constructor 1.");
    }

    public SuperCar(String model) {
        super(model);
        System.out.println("SuperCar constructor 2.");
    }

    public void tuneEngine(){
        System.out.println("Tuning engine of " + super.getModel());
    }
}
