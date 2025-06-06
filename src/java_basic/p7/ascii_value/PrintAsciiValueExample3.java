package java_basic.p7.ascii_value;

// Print ASCII Value in Java
// Using Type-Casting
public class PrintAsciiValueExample3 {
    public static void main(String[] args) {
        // character whose ASCII value to be found
        char ch1 = 'a';
        char ch2 = 'b';
        // variable that stores the integer value of the character
        int asciiValue1 = (int)ch1;
        int asciiValue2 = (int)ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciiValue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciiValue2);
    }
}
