package demo.inheritance.payment;

/**
 * Interfaces are purely abstract, by default all methods are public and abstract.
 * Interfaces support multiple inheritance. Any variable declared in an interface is public static and final.
 * Enhancements from version 8
 * 1. Default methods               : default keyword, a method with a body
 * 2. Static methods                : static methods in interfaces, utility methods
 * 3. private methods v9
 * 4. Functional Interfaces         : are interfaces with only one abstract method, @FunctionalInterface
 * 5. Lambdas and Streams API
 */
public interface PaymentGateway {

    void processPayment(double amount);

    boolean authenticate(String token);

    static double convertToCurrency(String targetCurrency, String localCurrency, double amount) {
        return 0.0;
    }

    /**
     * default methods can have an implementation, can have multiple default methods in one interface
     * they can be inherited as such, or overridden by the classes
     */
    default String info() {
        log("");
        return "Payment processor";
    }

    /**
     * Can be used to share common business logic among default methods
     */
    private void log(String message) {

    }
}

class UpiGateway implements  PaymentGateway {
    @Override
    public void processPayment(double amount) {
        PaymentGateway.convertToCurrency("USD", "INR", amount);
    }

    @Override
    public boolean authenticate(String token) {
        return false;
    }
}

class DebitCardGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
    }

    @Override
    public boolean authenticate(String token) {
        return false;
    }


}

class CreditCardGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {

    }

    @Override
    public boolean authenticate(String token) {
        return false;
    }
}

