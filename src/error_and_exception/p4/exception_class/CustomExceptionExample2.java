package error_and_exception.p4.exception_class;

// Exception Class in Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// create class AlreadyExistException by extending Exception class for checking whether the language exists in the array list or not
@SuppressWarnings("serial")
class AlreadyExistException extends Exception {
    // parameterized constructor that accepts only detail message
    public AlreadyExistException (String message) {
        // calling parent Exception class constructor
        super(message);
    }
}

// create CustomExceptionExample2 class that uses custom exception AlreadyExistException
public class CustomExceptionExample2 {

    // create method checkExistence() to check whether the given language already exists in the list or not
    static void checkExistence (ArrayList<String> languages, String language)
            throws AlreadyExistException {
        // use conditional statement to check the existence of the language
        if (languages.contains(language)) {
            // we throw AlreadyExistException when the language is already exist in the list
            throw new AlreadyExistException(language + " is already exist in the list.");
        } else {
            languages.add(language);
            System.out.println(language + " is added to the ArrayList successfully.");
            for(int i = 0; i < languages.size(); i++) {
                System.out.println(languages.get(i));
            }
        }

    }

    public static void main(String[] args) {

        // declare ArrayList with some languages

        ArrayList<String> languages = new ArrayList<>
                (Arrays.asList("Java", "Python", "JavaScript"));

        // create scanner class object to take input from user
        Scanner scan = new Scanner(System.in);

        // declare variable lang to store the user inout
        String lang;

        // take input from the user
        System.out.println("Enter language to enter in the ArrayList:");
        lang = scan.nextLine();

        scan.close();

        try {
            // call method checkExistence() to check whether the language is already exist in the list or not
            checkExistence(languages, lang);
        } catch (AlreadyExistException exception) {
            System.out.println("We found an exception:");

            // printing the message from InvalidAgeException object
            System.out.println(exception);
        }
    }
}
