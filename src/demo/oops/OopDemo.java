package demo.oops;

import java.time.LocalDate;

/**
 * OOPs: Object-Oriented Programming
 * Class - used to model real world entities, that share some common attributes, blueprints for objects
 * Object
 * Polymorphism
 * Abstraction
 * Encapsulation
 * Inheritance
 */
public class OopDemo {
    public static void main(String[] args) {
        /**
         * Create an object of the class we use the new keyword. You can access the properties and methods of an
         * object using . operator.
         * Class objectName = new ClassConstructor()
         * Object creation process
         *  1. Memory allocation
         *  2. Property initialization with default values
         *  3. Constructor execution
         *  4. Reference is returned to the object
         */
        Car hondaCity = new Car(); // Car() -> calling the Car() constructor method
//        Car hondaCity = Car.getInstance();

        hondaCity.setMake("Honda");
        hondaCity.setModel("City");
        hondaCity.setCubicCapacity(1500);
        hondaCity.setManufacturedDate(LocalDate.now());

//        hondaCity.printDetails();

        System.out.println(Student.syllabusCode);
        new Student();

    }
}
