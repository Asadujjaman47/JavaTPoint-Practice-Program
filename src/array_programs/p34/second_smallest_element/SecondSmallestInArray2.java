package array_programs.p34.second_smallest_element;

import java.util.Arrays;

// Find 2nd Smallest Number in Array using Arrays
public class SecondSmallestInArray2 {

    public static int getSecondSmallest(int[] a, int total){
        Arrays.sort(a);
        return a[1];
    }
    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Second Smallest: "+getSecondSmallest(a,6));
        System.out.println("Second Smallest: "+getSecondSmallest(b,7));
    }
}
