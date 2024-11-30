package numbers.p5.lucky_number;

import java.util.Scanner;

// Lucky Number in Java
public class LuckyNumberExample2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
//reading an integer from the user that represents the number of elements
        int n = sc.nextInt();
//creates an array of n
        int arr[] = new int[n];
//assigning the value of n into elements
        int elements = n;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        } //end of for loop
        int del = 1;
        System.out.println("\nLucky Number Operation:\n");
        while (del < n) {
            for (int i = del; i < n; i += del) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                } //end of for loop
                n--;
            } //end of for loop
            del++;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            } //end of for loop
            System.out.println();
        } //end of while loop
        System.out.print("\nHence, the Lucky Numbers Less than " + elements + " are: ");
        for (int i = 0; i < n; i++) {
//prints the lucky numbers
            System.out.print(arr[i] + " ");
        } //end of for loop
    }

}
