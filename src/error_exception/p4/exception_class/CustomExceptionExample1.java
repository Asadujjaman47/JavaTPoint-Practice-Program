package error_exception.p4.exception_class;

import java.util.Scanner;

// Exception Class in Java

// create class InvalidAgeException by extending Exception class for create invalid age exception
@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    // // parameterized constructor that accepts only detail message
    public InvalidAgeException (String message) {
        // calling parent Exception class constructor
        super(message);
    }
}

// create CustomExceptionExample1 class that uses custom exception InvalidAgeException
public class CustomExceptionExample1 {

    // create method checkEligibility() to check whether the given is valid for exam or not
    static void checkEligibility (int age) throws InvalidAgeException {
        // use conditional statement to check age
        if (age < 18) {
            // we throw InvalidAgeException when the age is less than 18
            throw new InvalidAgeException("You are not eligible for the exam.");
        } else {
            System.out.println("You are eligible for the exam.");
        }
    }

    public static void main(String[] args) {
        // create scanner class object to take input from user
        Scanner scan = new Scanner(System.in);

        // declare variable age to store the user input
        int age;

        // take input from the user
        System.out.println("Please enter your age:");
        age = scan.nextInt();

        scan.close();

        try {
            // call method checkEligibility() to check whether the user is eligible for exam or not
            checkEligibility(age);
        } catch (InvalidAgeException exception) {
            System.out.println("We found an exception");

            // printing the message from InvalidAgeException object
            System.out.println(exception);
        }
    }
}
