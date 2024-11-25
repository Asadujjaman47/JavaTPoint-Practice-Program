package array_programs.p43.plus_one_array;

import java.util.Arrays;

// Naive Approach Solution to The Problem
// Plus One to Array Problem in Java
public class PlusOneArray1 {

    // function to add 1 to the array
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n-1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 9};
        int[] ans = plusOne(arr);
        // prints the resultant array after adding 1 to MSB
        System.out.println(Arrays.toString(ans));
    }
}
