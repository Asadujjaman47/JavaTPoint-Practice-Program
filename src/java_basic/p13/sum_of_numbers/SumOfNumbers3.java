package java_basic.p13.sum_of_numbers;

import java.util.Scanner;

// Sum of Two Numbers in Java Using Method
// By Using Integer.sum() Method
public class SumOfNumbers3 {
    public static void main(String args[]) {
        int x = 33, y = 55, a = -15, b = -23, sum, s;
        sum=Integer.sum(x, y);
        //returns the sum of x and y
        System.out.println("The sum of x and y is: " +sum);
        s=Integer.sum(a, b);
        System.out.println("The sum of x and y is: " +s);
    }
}
