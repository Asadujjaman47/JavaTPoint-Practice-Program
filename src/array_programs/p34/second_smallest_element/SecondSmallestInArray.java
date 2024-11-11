package array_programs.p34.second_smallest_element;

// Java Program to find Second Smallest Number in an Array
public class SecondSmallestInArray {

    public static int getSecondSmallest(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Second smallest: "+getSecondSmallest(a,6));
        System.out.println("Second smallest: "+getSecondSmallest(b,7));
    }
}
