package array_programs.p2.print_the_elements_of_an_array;

// Program to print the elements of an array

public class PrintArray {
    public static void main(String[] args) {

        // initialize array
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");
        // Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
