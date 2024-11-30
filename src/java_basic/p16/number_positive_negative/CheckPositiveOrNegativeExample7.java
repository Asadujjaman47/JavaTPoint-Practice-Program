package java_basic.p16.number_positive_negative;

import java.util.ArrayList;

// Check if a Number is Positive or Negative
// Using Logic
public class CheckPositiveOrNegativeExample7 {
    public static void main(String[] args) {
        System.out.println(positiveOrNegative(111));
        System.out.println(positiveOrNegative(-444));
    }

    //method to check the number positive or negative
    public static String positiveOrNegative(int n) {
    //array of result that contains string Negative, Zero, and Positive
        String[] results = {"Negative", "Zero", "Positive"};
    //logic to check if the number is positive or negative and return the string as result
        return results[1 + (1 + ((n + 1) % n) * ((n - 1) % n)) / n];
    }
}
