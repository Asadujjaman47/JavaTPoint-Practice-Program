package java_basic.p16.number_positive_negative;

import java.util.ArrayList;

// Check if a Number is Positive or Negative
// Using ArrayList Class
public class CheckPositiveOrNegativeExample6 {
    public static void main(String[] args) {

        // invoking method and prints the corresponding result
        // parsing a positive value as a parameter
        System.out.println(positiveOrNegative(42));
        // parsing zero as a parameter
        System.out.println(positiveOrNegative(0));
        //parsing a negative value as a parameter
        System.out.println(positiveOrNegative(-190));
        System.out.println(positiveOrNegative(0));
        //parsing a negative value as a parameter
        System.out.println(positiveOrNegative(-190));
    }

    // method to check if the number is positive or negative
    public static String positiveOrNegative(int n) {
        // object of the ArrayList class
        ArrayList<String> resultList = new ArrayList<>();
        // if n is 0, the response is Zero
        // adds zero to the list
        resultList.add("Zero");
        //the loop populates the ArrayList with elements "Positive" for n elements
        for (int i = 0; i < n; i++) {
            // adds result to the list
            resultList.add("Positive");
        }
        String result = "";
        // try-catch block for the get() method because it throws IndexOutOfBoundsException
        try {
            //the get() method returns the element at the specified position in this list
            result = resultList.get(n);
        } catch (Exception e) {
            // If the index is out of bounds, it must be negative
            result = "Negative";
        }
        // returns the result
        return result;
    }
}
