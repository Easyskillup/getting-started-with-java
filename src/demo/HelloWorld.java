package demo;

// camelCase:   hellWorld
// PascalCase:  HelloWorld
// package a.b.c.d;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from inteliJ");

    }
}

/**
 * Identifier naming conventions and rules
 * Identifier is name given to a package, a class, a method or a variable
 *
 * Rules
 * Must start with a letter, or _, or $		name, _name, $name [allowed]
 * Cannot start with a number			    1Name [not allowed]
 * Cannot have spaces in between
 * Can have numbers, letters, _, $
 * Cannot have keywords
 * Case sensitive					        name, Name are two different variables
 *
 * Conventions
 * class names follow PascalCase			StudentDetails, AccountManager
 * variable names follow camelCase			studentName, trainerSpecialities
 * methods follow camelCase
 * packages follow lowercase			    demo, student, accounts
 * constants use UPPER_CASE			        INTEREST_RATE
 */
