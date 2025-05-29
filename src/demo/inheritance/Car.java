package demo.inheritance;

/**
 * Inheritance, a fundamental OOP principle. Lets us create a new class based on an existing
 * class. We use the extends keyword to inherit from another class.
 * In java one class clan only extend from one another class, single inheritance.
 * Constructor execution happens from base to derived.
 * Use super keyword to access the base class content.
 * Private methods, fields and constructors are not inherited.
 * Allows us to reuse the code, in multiple classes, make changes to the code.
 * Allows us to extend the class, by adding new features.
 * Allows us to use subclass objects as super class types.
 */
public class Car extends Vehicle {
    public Car() {
        System.out.println("Car class constructor 1.");
    }
    public Car(String model) {
        super(model);
        System.out.println("Car class constructor 2.");
    }

    public void playMusic() {
        System.out.println("Playing music on " + super.getModel());
    }
}
