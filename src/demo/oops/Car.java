package demo.oops;

import java.time.LocalDate;

/**
 * Models a real world entity. A class contains Attributes[Properties] and Behaviours[Methods].
 * A class by itself doesn't do anything. A class can be considered as a custom DataType. Also be considered
 * as a container for state and behaviour.
 */
public class Car  {
    // Properties or attributes of a class
    private String model;
    private String make;
    private int cubicCapacity;
    private LocalDate manufacturedDate;

    /**
     * To define a method in java
     * <access-specifier> <access-modifier> return-type methodName(<parameter-list>) { }
     * <p>
     * access-specifiers:   public, private, protected, default-access/package-friendly
     * public:              within the class, within the package, outside the package
     * private:             within the class
     * protected:           class and subclasses
     * default:             package level access
     * <b></b>
     * access-modifier:     abstract, final, static
     * <b></b>
     * getters/accessors and setters/mutators, method that will access the value from the private property and write
     * the new value into the property
     * <b></b>
     * private String name;
     * public String getName() { }
     * public void setName(String name) { }
     * <b></b>
     * Constructor:         special methods, with the same name as the class, no return type
     * executed when an object is created, used to initialize properties of a class
     * mandatory to have a constructor, if not provided java will add a default constructor
     */

    public Car() {
        printDetails();
        System.out.println("Car class constructor");
    }

//    public static Car getInstance() {
//        return new Car();
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public void printDetails() {
        // All local variables must be initialized before use.
        int x = 0;
        System.out.println("Car details:");
        System.out.println("Make: " + make + " Model: " + model + " CC: " + cubicCapacity);
        System.out.println(x);
    }
}
