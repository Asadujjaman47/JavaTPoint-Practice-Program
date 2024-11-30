package java_basic.p13.sum_of_numbers;

import java.util.Scanner;

// Sum of Two Numbers in Java Using Method
// By Using User-defined Method
public class SumOfNumbers2 {
    public static void main(String args[]) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }

    //method that calculates the sum
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
