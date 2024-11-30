package java_basic.p15.perfect_square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Check if a Given Number is Perfect Square
public class CheckPerfectSquareExample5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter an integer: ");
        //reading a number form the user
        int n = Integer.parseInt(reader.readLine());
        //finds the square root of the number and type-cast the square root in to int
        int sqrt = (int) Math.sqrt(n);
        //comparing the square of the sqrt with the number
        if (sqrt * sqrt == n) {
            System.out.println(n + " is a perfect square number.");
        } else {
            System.out.println(n + " is not a perfect square number.");
        }
    }
}
