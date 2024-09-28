package array_programs.p15.jagged_array;

// Using array literals

public class JaggedArray {
    public static void main(String[] args) {

        // create a jagged array with three rows
        int[][] jaggedArray = {
                {1, 2, 3},  // first row has three columns
                {4, 5},     // second row has two columns
                {6, 7, 8, 9}   // third row has four column
        };

        // loop through each row of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {

            // loop through each column of the current row
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
