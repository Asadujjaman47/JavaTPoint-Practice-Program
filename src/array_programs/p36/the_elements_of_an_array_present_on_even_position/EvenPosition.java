package array_programs.p36.the_elements_of_an_array_present_on_even_position;

// Program to print the elements of an array present on even position
public class EvenPosition {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("Element of given array present on even position");
        ;
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
