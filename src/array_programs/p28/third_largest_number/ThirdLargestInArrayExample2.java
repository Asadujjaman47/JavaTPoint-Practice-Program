package array_programs.p28.third_largest_number;

import java.util.Arrays;

// Find 3rd Largest Number in Array using Arrays
public class ThirdLargestInArrayExample2 {

    public static int getThirdLargest(int[] a, int total) {

        Arrays.sort(a);
        return a[total-3];
    }


    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Smallest: "+getThirdLargest(a,6));
        System.out.println("Smallest: "+getThirdLargest(b,7));
    }
}
