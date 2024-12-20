package array_programs.p30.passing_array_to_function;

import java.util.Scanner;

// Calculating the maximum and minimum values of a given array.
public class array {

    public int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array ::");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        array m = new array();
        System.out.println("Maximum value in the array is::" + m.max(arr));
        System.out.println("Minimum value in the array is::" + m.min(arr));
    }
}
