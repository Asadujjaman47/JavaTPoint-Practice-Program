package array_programs.p18.dynamic_array;

// Dynamic Array in Java

public class InitializeDynamicArray {
    public static void main(String[] args) {
        // declaring array
        int array[];
        // initialize an array
        array = new int[6];
        // adding elements to the array
        array[0] = 34;
        array[1] = 90;
        array[2] = 12;
        array[3] = 22;
        array[4] = 9;
        array[5] = 27;
        System.out.println("Elements of Array are: ");
        // iteration over the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
