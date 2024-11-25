package array_programs.p46.unique_element;

import java.util.HashMap;

// Find unique elements in array Java
// By using nested loop
public class UniqueElementsExample2 {
    public static void main(String[] args) {

        // creates an integer array having some duplicate elements
        int[] arrayWithDuplicates = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };
        int len = arrayWithDuplicates.length;

        // create an integer array to store distinct elements
        int[] distinctArray = new int[20];

        // integer variable to increment array index
        int index = 0;

        // outermost loop to take element one by one from the leftmost side
        for (int i = 0; i < len; i ++ ){
            int flag = 0;
            // innermost loop to make comparison between elements and skip duplicate elements
            for (int j = 0; j < i; j++) {
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    flag = 1;
                    break;
                }
            }

            // store or print the element if it is not present in the distinctArray
            if (flag == 0) {
                distinctArray[index] = arrayWithDuplicates[i];
                index++;
            }
        }

        // print distinctArray
        for (int i = 0; i < index; i++) {
            System.out.print(distinctArray[i] + " ");
        }
    }

}
