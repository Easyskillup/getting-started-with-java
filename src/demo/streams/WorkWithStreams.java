package demo.streams;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Streams API allows you to create Streams which can perform aggregate operations on large amounts of data.
 * Introduced from Java 8. Stream is a channel that contains a sequence of data. You can process this data in a
 * sequential or parallel manner.
 * Streams support terminal and intermediate operational.
 * Ance a Terminal operation is complete the stream is closed for good. forEach()
 * Intermediate operations work on the stream and returns a new stream with that result. filter(), map()
 */
public class WorkWithStreams {

    static Stream<Integer> getNumbers() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void main(String[] args) {
        Stream<Integer> numbers = getNumbers();
        // forEach(): [terminal] iterate over each element and perform some action, generally print it.
        Consumer<Integer> print = (num) -> System.out.print(num + " ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        numbers = getNumbers();
        System.out.println(numbers.count());
        System.out.println();

        System.out.println("All even numbers");
        numbers = getNumbers();
        numbers.filter(num -> num % 2 == 0).forEach(print);
        System.out.println();
    }
}
