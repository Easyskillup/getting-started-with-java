package demo.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionDemos {
    public static void main(String[] args) {

        // Function<T, R> -> Takes type of T as input and returns type of R as output
        Function<String, Integer> len = (str) -> str.length();
        System.out.println("Length of 'Welcome' is: " + len.apply("welcome"));

        // Predicate<T> -> returns a boolean value
        Predicate<Integer> evenOrOdd = (num) -> num % 2 == 0;
        System.out.println("Is 2 is odd or not?: " + evenOrOdd.test(2));

        // Chaining
        Predicate<String> startsWithA = (str) -> str.startsWith("A");
        Predicate<String> lengthIsOk = (str) -> str.length() >= 6;
        Predicate<String> combined = lengthIsOk.and(startsWithA);
        System.out.println("Ashish: " + combined.test("Ashish"));

        Function<Integer, Integer> square = (x) -> x * x;
        Function<Integer, Integer> divideBy2 = (x) -> x / 2;
        Function<Integer, Integer> combinedFunction = square.andThen(divideBy2).andThen(square);
        System.out.println("Square 10 and Divide By 2 and then Square: " + combinedFunction.apply(10));

    }
}
