package java_basic.p16.number_positive_negative;

import java.util.Scanner;

// Check if a Number is Positive or Negative
// Using Bit Shift Operator
public class CheckPositiveOrNegativeExample5 {
    public static void main(String[] args) {

        int num;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check: ");
        // reading an input from the user
        num = sc.nextInt();
        // string array that contains result
        String[] result = {"Positive", "Negative"};
        // print the result
        System.out.println(result[(num >> 31) & 1]);
    }
}
