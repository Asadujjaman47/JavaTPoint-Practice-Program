package array_programs.p8.print_smallest_element_in_array;

public class SmallestElement_array {
    public static void main(String[] args) {

        // initialize array
        int[] arr = new int[] {25, 11, 7, 75, 56};
        // initialize min with first element of array;
        int min = arr[0];

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Compare elements of array with min
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest element present in given array: " + min);
    }
}
