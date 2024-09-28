package array_programs.p4.print_largest_element_in_array;

public class LargestElement_array {
    public static void main(String[] args) {

        // initialize array
        int[] arr = new int[] {25, 11, 7, 75, 56};
        // initialize max with first element of array;
        int max = arr[0];

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest element present in given array: " + max);
    }
}
