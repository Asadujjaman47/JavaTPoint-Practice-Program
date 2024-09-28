package array_programs.p6.charecter_array;

import java.util.Arrays;

// Convert a String Array into Character Array
public class CharArrayDemo4 {
    public static void main(String[] args) {
        String value = "JavaTPoint"; // Enter String
        // Convert string to a char array
        char[] array = value.toCharArray(); // Conversion to character from string
        for (char c : array) {  // iterating array values
            System.out.println(c);
        }
    }
}
