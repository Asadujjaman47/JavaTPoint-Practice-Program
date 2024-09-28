package array_programs.p10.right_rotate_the_elements_of_array;

// right rotate the elements of the array

public class RotateRight {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // n determine the number of times an array should be rotated
        int n = 3;

        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Rotate the given array by n times toward right
        for (int i = 0; i < n; i++) {
            int j, last;
            // Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                // Shift element of array by one
                arr[j] = arr[j - 1];
            }

            // Last element of array will be added to the start of array
            arr[0] = last;
        }

        // Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
