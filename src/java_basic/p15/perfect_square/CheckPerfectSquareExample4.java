package java_basic.p15.perfect_square;

import java.util.Scanner;

// Check if a Given Number is Perfect Square
public class CheckPerfectSquareExample4 {

    public static void main(String[] args) {
        //creating Scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //taking an integer as input
        int number = sc.nextInt();
        //calculates the square root of the number
        double x = Math.sqrt(number);
        //typecast the root from double to int
        if (x == (int) x) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
