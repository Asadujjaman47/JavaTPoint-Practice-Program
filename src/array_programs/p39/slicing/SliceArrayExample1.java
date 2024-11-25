package array_programs.p39.slicing;

import java.util.Arrays;

// Array Slicing in Java
// By Copying Elements
public class SliceArrayExample1 {

    // creating a function to the slice of an array
    public static int[] getSlice(int[] array, int startIndex, int endIndex) {
        // Get the slice of the Array
        int[] slicedArray = new int[endIndex - startIndex];

        // copying array element from the original array
        // to the newly created sliced array
        for (int i = 0; i < slicedArray.length; i++) {
            slicedArray[i] = array[startIndex+i];
        }

        // returns the slice of an array
        return slicedArray;
    }

    // main() method
    public static void main(String[] args) {
        // array from which we will find the slice
        int[] array = {23, 56, 78, 22, 45, 90, 67, 91, 0, 31};
        // start index abd end index denotes the part of the original array to be slice
        int startIndex = 3, endIndex = 8;
        // Get the slice of the array
        int[] slicedArray = getSlice(array, startIndex, endIndex+1);
        // print the slice array
        System.out.println("Slice of Array: " + Arrays.toString(slicedArray));
    }
}
