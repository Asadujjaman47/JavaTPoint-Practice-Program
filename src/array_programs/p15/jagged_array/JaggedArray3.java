package array_programs.p15.jagged_array;

// Using Java 8 streams

import java.util.Arrays;

public class JaggedArray3 {
    public static void main(String[] args) {

        // create a jagged array with three rows
        int[][] jaggedArray = {
                {1, 2, 3},  // first row has three columns
                {4, 5},     // second row has two columns
                {6, 7, 8, 9}   // third row has four column
        };

        // loop through each row of the jagged array using streams
        Arrays.stream(jaggedArray)
                .forEach(row -> {
                    // loop through each element of the current row using streams
                    Arrays.stream(row)
                            .forEach(element -> System.out.print(element + " "));

                    // move to the next line for the next row
                    System.out.println();
                });
    }
}
