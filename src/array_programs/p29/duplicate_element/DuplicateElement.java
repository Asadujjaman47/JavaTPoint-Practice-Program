package array_programs.p29.duplicate_element;

// Program to print the duplicate elements of an array
public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
