package array_programs.p46.unique_element;

import java.util.HashMap;

// Find unique elements in array Java
// By using hashmap's key
public class UniqueElementsExample1 {
    public static void main(String[] args) {

        // creates an integer array having some duplicate elements
        int[] arrayWithDuplicates = {10, 2, 5, 3, 9, 22, 4, 3, 1, 6};

        // create a hashmap having integer type of key-value
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // use for loop to pull elements of array to hashmap's key
        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashMap.put(arrayWithDuplicates[j], j);
        }

        // use hashmap.KeySet() for printing all keys of hashmap using it's keySet() method
        System.out.println(hashMap.keySet());
    }

}
