package array_programs.p25.find_second_largest_number.find_largest_number;

// Java Program to find Second Largest Number in an Array
public class SecondLargestInArrayExample1 {

    public static int getLargest(int[] a, int total) {
        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;

        for(int i = 0; i < total; i++) {
            if(a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            if(a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        return secondLargest;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        int[] b = {44, 66, 99, 77, 33, 22, 55};

        System.out.println("Second argest: " + getLargest(a, 6));
        System.out.println("Largest: " + getLargest(b, 7));
    }
}
