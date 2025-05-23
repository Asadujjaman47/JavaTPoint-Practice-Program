package array_programs.p27.smallest_number_in_array;


import java.util.Arrays;

// Find Smallest Number in Array using Arrays
public class SmallestInArrayExample2 {

    public static int getSmallest(int[] a, int total) {

        Arrays.sort(a);
        return a[0];
    }


    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Smallest: "+getSmallest(a,6));
        System.out.println("Smallest: "+getSmallest(b,7));
    }
}
