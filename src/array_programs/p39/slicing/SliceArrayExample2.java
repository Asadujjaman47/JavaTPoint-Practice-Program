package array_programs.p39.slicing;

import java.util.Arrays;

// Array Slicing in Java
// By Using the copyOfRange() Method
public class SliceArrayExample2 {

    // creating a function to the slice of an array
    public static int[] slice(int[] array, int startIndex, int endIndex) {
        // Get the slice of the Array
        int[] slicedArray = Arrays.copyOfRange(array, startIndex, endIndex);

        // returns the slice
        return slicedArray;
    }

    // main() method
    public static void main(String[] args) {
        // array from which we will find the slice
        int[] array = {11, 23, 56, 90, 111, 901, 251, 800, 843};
        int startIndex = 2, endIndex = 6;
        // Get the slice of the array
        int[] slicedArray = slice(array, startIndex, endIndex+1);
        // print the slice array
        System.out.println("Slice of Array: " + Arrays.toString(slicedArray));
    }
}
