package array_programs.p43.plus_one_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

// Plus One to Array Problem in Java
// Using Vector
public class PlusOneExample2 {

    // function to add one to the array
    static void plusOne(Vector<Integer> digits) {
        // initialize an index (digit of units)
        int index = digits.size() - 1;
        while (index >= 0 && digits.get(index) == 9) {
            // while the index is valid and the value at [index] == 9 set it as 0
            digits.set(index, 0);
            // decrement index by 1
            index -= 1;
        }

        // if index < 0 (if all digits were 9)
        if (index < 0) {
            // inserting 1 at the beginning of the vector
            digits.set(0, 1);
            // adding and extra zero to the end of the vector
            digits.add(digits.size(), 0);
        }
        // else increment the value at [index]
        else
            digits.set(index, digits.get(index) + 1);
    }

    public static void main(String[] args) {
        // creating an instance of the vector class and passing an array
        Vector<Integer> digits = new Vector<>(Arrays.asList(12, 45, 90, 39));
        plusOne(digits);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
