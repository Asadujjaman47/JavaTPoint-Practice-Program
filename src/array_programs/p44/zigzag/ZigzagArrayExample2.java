package array_programs.p44.zigzag;

import java.util.Arrays;
import java.util.Scanner;

// Zigzag Array in Java

//if flag=0, the condition i<i+1must be satisfied
//if flag=1, the condition i>i+1 must be satisfied
//if not, then swap

public class ZigzagArrayExample2 {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // function to onvert array in zigzag form
    public static void zigzagArray(int[] arr, int n) {
        boolean flag = true;
        int temp = 0;

        for (int i = 0; i <= n-2; i++) {
            if (flag) {
                // execute if element are in the order a > b > c
                if (arr[i] > arr[i+1]) {
                    // swapping logic
                    swap(arr, i, i+1);
                }
            }
            else {
                // execute if elements are in the order a < b < c
                if (arr[i] < arr[i+1]) {
                    // swapping logic
                    swap(arr, i, i+1);
                }
            }

            flag = !flag;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaring an array to store the elements
        int[] array;
        //size of the array
        int length = 0;

        System.out.print("Enter the number of elements in array: ");
        length = sc.nextInt();
        //mapping the size of the array
        array = new int[length];
        System.out.print("Enter the " + length + " elements: ");
        //reads the array elements from the user
        for (int i = 0; i < length; i++)
        {
            array[i] = sc.nextInt();
        }

        //function that converts an array into zigzag form
        System.out.print("\nThe zigzag Array is: \n");
        //function calling
        zigzagArray(array, length);

        //iterate over the array
        for (int i = 0; i < length; i++)
            //prints the zigzag array
            System.out.print(+array[i] + "  ");
        System.out.print("\n");
    }
}
