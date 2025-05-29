package demo.optionals;

import demo.oops.Student;

import java.util.Optional;

/**
 * Optional: Container object which may or may not hold a non null value.
 * Available in the java.util package
 */
public class WorkWithOptional {
    public static void main(String[] args) {
        print("Ashish");
        print("");
        print(null);

        if(getById(1).isEmpty()) {
            System.out.println("No data found");
        }
    }

    public static Optional<Student> getById(int rollNumber) {
        // Db access logic does not return a student for this id
        return Optional.empty();
    }

    /**
     * Optional.ofNullable()    : value could possible be null
     * optional.of()            : value could be empty but never null
     */
    static void print(String s) {
        Optional<String> optional = Optional.ofNullable(s);
//        System.out.println(optional.orElseThrow());
        if(optional.isEmpty()){
            System.out.println("No value");
            return;
        }
        System.out.println(optional.get());
    }
}
