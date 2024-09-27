package array_programs.p1.sort_element_ascending_order;

// Java Program to sort the elements of an array in ascending order

public class SortAsc {
    public static void main(String[] args) {

        // initialize array
        int[] arr = new int[] {5, 2, 8, 7, 1};
        int temp = 0;

        // Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sort the array in ascending order
        for(int i = 0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
