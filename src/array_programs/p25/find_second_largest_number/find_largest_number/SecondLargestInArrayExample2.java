package array_programs.p25.find_second_largest_number.find_largest_number;

import java.util.Arrays;

// Find 2nd Largest Number in Array using Arrays
public class SecondLargestInArrayExample2 {

    public static int getLargest(int[] a, int total) {

        Arrays.sort(a);
        return a[total-2];
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        int[] b = {44, 66, 99, 77, 33, 22, 55};

        System.out.println("Largest: " + getLargest(a, 6));
        System.out.println("Largest: " + getLargest(b, 7));
    }
}
