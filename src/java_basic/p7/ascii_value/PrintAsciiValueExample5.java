package java_basic.p7.ascii_value;

import java.util.Scanner;

// Print ASCII Value in Java
// Using Type-Casting
// Prints the ASCII value (0 to 255)
public class PrintAsciiValueExample5 {
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.println("The ASCII value of " + (char)i + " = " + i);
        }
    }
}
