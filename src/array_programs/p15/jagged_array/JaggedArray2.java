package array_programs.p15.jagged_array;

// Using nested loops

public class JaggedArray2 {
    public static void main(String[] args) {

        // create a 2-D jagged array with 4 rows
        int[][] jaggedArray = new int[4][];

        // Set the number of columns for each row
        jaggedArray[0] = new int[1];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[4];

        // Fill the array with values starting from 1
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value;
                value++;
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
