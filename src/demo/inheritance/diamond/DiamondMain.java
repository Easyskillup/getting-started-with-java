package demo.inheritance.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
interface Parent1 {
    default void greet() {
        System.out.println("Greet from parent 1");
    }
}
interface Parent2 {
    default void greet() {
        System.out.println("Greet from parent 2");
    }
}
/**
 * When a class implements two interfaces with the same default method, it must override the method and
 * resolve the ambiguity.
 * Super keyword is generally used in classes, but can be used with interfaces to access the default methods.
 */
class Child implements Parent2, Parent1  {
    @Override
    public void greet() {
        Parent1.super.greet();
        Parent2.super.greet();
    }
}
