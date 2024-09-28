package array_programs.p15.jagged_array;

// Dynamic jagged array

import java.util.Scanner;

public class JaggedArray4 {
    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the number of sub-arrays
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scanner.nextInt();

        // Declare the jagged array with the number of sub-arrays
        int[][] jaggedArray = new int[numberOfArrays][];

        // Loop through each sub-array to allocate memory and get user input for each element
        for (int i = 0; i < numberOfArrays; i++) {
            // Prompt the user to enter the size of the current sub-array
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scanner.nextInt();

            // Allocate memory to the current sub-array
            jaggedArray[i] = new int[sizeOfSubArray];

            // Loop through each element of the current sub-array to get user input
            for (int j = 0; j < sizeOfSubArray; j++) {
                System.out.print("Enter the element at index " + j + " of sub-array " + (i + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("The jagged array is: ");
        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner object
        scanner.close();
    }
}
