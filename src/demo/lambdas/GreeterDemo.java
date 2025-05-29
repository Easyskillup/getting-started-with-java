package demo.lambdas;

@FunctionalInterface // can have only one abstract method
interface Greeting {
    void greet();
}

@FunctionalInterface
interface Printer<T> {
    void print(T t);
}

@FunctionalInterface
interface Operator<T, R> {
    R oper(T t);
}

public class GreeterDemo {
    public static void main(String[] args) {
        // FunctionalInterface lambdaVar = lambda_expression ->
        /**
         * Return type, argument type these all; are inferred from the functional interface's abstract method
         * (parameters) -> expression
         * (parameters) -> {
         *   // LAMBDA_BLOCK
         * };
         */
        Greeting welcome = () -> {
            System.out.println("Welcome to Java....");
        };
        Greeting hello = () -> System.out.println("Hello from Java....");
        Greeting hi = () -> System.out.println("Hi");
        welcome.greet();
        hello.greet();

        Printer<String> strPrinter = (str) -> System.out.println(str);
        Printer<Integer> numPrinter = (num) -> System.out.println(num);

        Operator<String, Integer> len = (str) -> str.length();

    }
}

class Hello implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello from Java...");
    }
}

class Welcome implements Greeting {
    @Override
    public void greet() {
        System.out.println("Welcome from Java...");
    }
}


