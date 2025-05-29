package demo.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exceptions are unforeseen or unwanted situations that arise in a program execution.
 * These are divided broadly into
 * 1. Error         : System issues that cannot be handled
 * 2. Exception     : Are program/runtime issues that needs to be tackled
 * <p>
 * Both exception and error are derived the Throwable class
 * java.lang.Throwable
 * --java.lang.Error        : base class for all errors
 * --java.lang.Exception    : base class for all exceptions
 * <p>
 * Exceptions are again classified into
 * 1. Checked       : Are those which are checked during the compile time, use try..catch or declare them with throws
 * 2. Unchecked     : Are not checked at compile time, arises only during the runtime
 * <p>
 * Handle Rule
 * You can handle the exception in your own code using the try..catch..finally blocks.
 * try      : encloses the statements that can raise an exception
 * catch    : catch the exceptions raise in try
 * finally  : execute code irrespective of exception
 * <p>
 * Declare Rule
 * You can declare the exception to be thrown and let the calling methods handle it.
 * <p>
 * Method call
 * main() -> a() -> b()
 * <p>
 * Exception propagation
 * main() <- a() <- b()
 */
public class ExceptionHandlingMain {
    public static void main(String[] args) {
        int n1, n2, q;
        n1 = 0;
        n2 = 0;
        q = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to divide two numbers.");
        try {
            System.out.println("Enter first number: ");
            n1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            n2 = scanner.nextInt();
            q = n1 / n2;
            System.out.println("Quotient = " + q);
        } catch (ArithmeticException | InputMismatchException e) {
            System.err.println("Division by zero or Wrong Input: " + e.getMessage());
        }  finally {
            System.out.println("Program completed.");
        }
    }
}
