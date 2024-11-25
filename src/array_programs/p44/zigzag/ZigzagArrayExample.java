package array_programs.p44.zigzag;

import java.util.Arrays;

// Zigzag Array in Java

//if flag=0, the condition i<i+1must be satisfied
//if flag=1, the condition i>i+1 must be satisfied
//if not, then swap

public class ZigzagArrayExample {

    // function to onvert array in zigzag form
    public static void zigZag(int[] arr) {
        boolean flag = true;
        int temp = 0;

        for (int i = 0; i <= arr.length-2; i++) {
            if (flag) {
                // execute if element are in the order a > b > c
                if (arr[i] > arr[i+1]) {
                    // swapping logic
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else {
                // execute if elements are in the order a < b < c
                if (arr[i] < arr[i+1]) {
                    // swapping logic
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            if(flag == true)
                flag = false;
            else
                flag = true;
        }
    }

    public static void main(String[] args) {
        // array to be convert into zigzag from
        int[] arr = {2, 4, 5, 1, 7, 6, 8};
        zigZag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
