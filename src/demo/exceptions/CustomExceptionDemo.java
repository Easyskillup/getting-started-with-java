package demo.exceptions;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        User arun = new User("Arun", 18);
        User anoop = new User("Anoop", 16);
        // handling the exception
        try {
            arun.register();
            anoop.register();
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // declare that this function is going to raise InvalidAgeException
    // can be done with the help of throws keyword
    public void register() throws InvalidAgeException {
        if (age >= 18) {
            System.out.println(name + " is successfully registered.");
        } else {
            // raise a custom exception
            // use the throw keyword to raise an object of an exception
            throw new InvalidAgeException(name + " is only " + age + " years old. Have to be at least 18 to register.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}