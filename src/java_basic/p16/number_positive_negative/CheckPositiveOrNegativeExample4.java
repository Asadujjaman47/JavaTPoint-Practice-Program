package java_basic.p16.number_positive_negative;

import java.util.Scanner;

// Check if a Number is Positive or Negative
// Using Integer.signum() Method
public class CheckPositiveOrNegativeExample4 {
    public static void main(String[] args) {

        int num, result;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        // reading an input from the user
        num = sc.nextInt();
        // invoking signnum() method of the Math class
        result = Integer.signum(num);
        // print the result
        System.out.println(result);
    }
}
