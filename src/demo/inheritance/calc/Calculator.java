package demo.inheritance.calc;

public interface Calculator {

    static int add(int a, int b) {
        return validate(a, b) ? a + b : 0;
    }

    static int multiply(int a, int b) {
        return validate(a, b) ? a * b : 0;
    }

    /**
     * Share logic among static methods in an interface
     */
    private static boolean validate(int a, int b) {
        return a >= 0 && b >= 0;
    }
}

/**
 * Can have only one abstract method, can have default methods, static methods, private methods
 * Primarily used for Lambdas expressions or blocks
 */
@FunctionalInterface
interface Test {
    boolean check();

    private void info4() {}

    static void info3() {}

    default void info(){}

    default void info2(){}
}
