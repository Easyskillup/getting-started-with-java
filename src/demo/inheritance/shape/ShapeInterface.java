package demo.inheritance.shape;

import java.io.Serializable;

/**
 * Interfaces are purely abstract structures, all methods defined in it are
 * by default abstract and public.
 * From java v8 if you want to define a method with body in a interface, you can sue default
 * or static methods.
 * we use implements keyword to inherit from interfaces, and multiple interfaces can be implemented
 * into a single class
 */
public interface ShapeInterface {
    double getArea();
    double getPerimeter();
    void draw();
    default void hello() {
        System.out.println("hello from interface");
    }
}

class Circle implements ShapeInterface, Serializable {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
