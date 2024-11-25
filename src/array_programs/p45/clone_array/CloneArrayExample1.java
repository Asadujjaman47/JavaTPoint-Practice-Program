package array_programs.p45.clone_array;

import java.util.Scanner;

// By Copying Array Elements
public class CloneArrayExample1 {
    public static void main(String[] args)
    {
        // declare originalArray and cloneArray variables
        int originalArray[];
        int cloneArray[];
        int size;
        // create Scanner class object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        size = sc.nextInt();
        // initialize both the array with the given size
        originalArray = new int[size];
        cloneArray = new int[size];
        System.out.println("Enter elements of the original array:");
        //take input from user to fill originalArray
        for(int i = 0; i < size; i++) {
            originalArray[i] = sc.nextInt();
        }

        // close scanner class object
        sc.close();
        // use for loop to copy elements from originalArray to cloneArray
        for (int i = 0; i < originalArray.length; i++) {
            cloneArray[i] = originalArray[i];
        }
        // display elements of the original array
        System.out.println("Elements of the original array:");

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        // display elements of the cloned array
        System.out.println("\n\nElements of the clone array:");

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
