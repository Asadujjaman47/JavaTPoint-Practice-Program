package array_programs.p39.slicing;

import java.util.Arrays;
import java.util.stream.IntStream;

// Array Slicing in Java
// By Using Java 8 Stream
public class SliceArrayExample3 {

    // creating a function to the slice of an array
    public static int[] findSlice(int[] array, int startIndex, int endIndex) {

        //getting the slice of an array and storing it in array slcarray[]
        //the range() method converts the elements into stream
        //getting the elments of the int stream using lambda expression
        //converting the mapped elements into sliced array using the toArray() method
        int[] slcarray = IntStream.range(startIndex, endIndex).map(i -> array[i]).toArray();

        // returns the slice of array
        return slcarray;
    }

    // main() method
    public static void main(String[] args) {
        //Get the array, startIndex and endIndex
        int[] array = {12, 45, 90, 55, 34, 100, 345, 897, 67, 123, 0, 789};
        int startIndex = 5, endIndex = 10;
        // Get the slice of the array
        int[] slicedArray = findSlice(array, startIndex, endIndex+1);
        // print the slice array
        System.out.println("Slice of array for the specified range is: "+Arrays.toString(slicedArray));
    }
}
