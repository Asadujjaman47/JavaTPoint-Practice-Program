package array_programs.p14.copy_all_elements_to_another_array;

public class CopyArray {
    public static void main(String[] args) {
        // Initialize array
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        // Create another array
        int[] arr2 = new int[arr1.length];

        // Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
