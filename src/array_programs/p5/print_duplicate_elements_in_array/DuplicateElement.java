package array_programs.p5.print_duplicate_elements_in_array;

public class DuplicateElement {
    public static void main(String[] args) {

        // initialize array
        int[] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
