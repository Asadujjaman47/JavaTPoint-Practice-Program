package java_basic.p16.number_positive_negative;

import java.util.Scanner;

// Check if a Number is Positive or Negative
// Using Math.signum() Method
public class CheckPositiveOrNegativeExample3 {
    public static void main(String[] args) {

        double num, result;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        // reading an input from the user
        num = sc.nextDouble();
        // invoking signnum() method of the Math class
        result = Math.signum(num);
        // print the result
        System.out.println(result);
    }
}
