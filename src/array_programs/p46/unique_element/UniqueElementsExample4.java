package array_programs.p46.unique_element;

import java.util.Arrays;
import java.util.HashSet;

// Find unique elements in array Java
// By using hashing
public class UniqueElementsExample4 {
    public static void main(String[] args) {

        // creates an integer array having some duplicate elements
        int[] arrayWithDuplicates = {10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6};

        // calculate length of the arrayWithDuplicates
        int len = arrayWithDuplicates.length;

        // Creates an empty hashset to store distinct elements
        HashSet<Integer> hashSet = new HashSet<>();

        // traverse the arrayWithDuplicates array to store elements in the hashset
        for (int i = 0; i < len; i++) {
            // check whether the element is present in the hashset or not.
            //  If it is not present in the hashset, add in it
            if (!hashSet.contains(arrayWithDuplicates[i])) {
                hashSet.add(arrayWithDuplicates[i]);
            }
        }
        // print hash set that contains distinct element
        System.out.println(hashSet);
    }
}
