package array_programs.p46.unique_element;

import java.util.Arrays;

// Find unique elements in array Java
// By using sorting
public class UniqueElementsExample3 {
    public static void main(String[] args) {

        // creates an integer array having some duplicate elements
        int[] arrayWithDuplicates = {10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6};

        // perform sorting to sort arrayWithDuplicates
        Arrays.sort(arrayWithDuplicates);

        // calculate length of the sorted array
        int len = arrayWithDuplicates.length;

        // create an integer array to store distinct elements
        int[] distinctArray = new int[20];

        // integer variable to increment array index;
        int index = 0;

        // use for loop to traverse the arrayWithDuplicates
        for(int i = 0; i < len; i++) {
            // we will skip the index there are duplicate ahead
            while (i < len - 1 && arrayWithDuplicates[i] == arrayWithDuplicates[i+1])
                i++;

            // store element in the distinctArray
            distinctArray[index] = arrayWithDuplicates[i];
            index++;
        }

        // print distinctArray
        for (int i = 0; i < index; i++) {
            System.out.print(distinctArray[i] + " ");
        }
    }
}
