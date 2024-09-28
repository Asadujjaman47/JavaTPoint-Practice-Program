package array_programs.p7.take_array_input;

// Two-dimensional array input

import java.util.Scanner;

public class ArrayInputExample2 {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        m = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        n = sc.nextInt();

        int[][] array = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}