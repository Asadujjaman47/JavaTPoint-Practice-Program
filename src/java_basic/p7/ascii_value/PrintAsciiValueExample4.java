package java_basic.p7.ascii_value;

import java.util.Scanner;

// Print ASCII Value in Java
// Using Type-Casting
public class PrintAsciiValueExample4 {
    public static void main(String[] args) {

        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);

        char chr = sc.next().charAt(0);
        int asciiValue = chr;

        System.out.println("The ASCII value of " + chr + " is: " + asciiValue);
    }
}
