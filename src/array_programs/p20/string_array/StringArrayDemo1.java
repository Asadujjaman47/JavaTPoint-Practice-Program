package array_programs.p20.string_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Using ArrayList
public class StringArrayDemo1 {
    public static void main(String[] args) {

        // Defining a Sting Array
        String sa[] =  { "A", "B", "C", "D", "E", "F" };

        System.out.println("Initial Array: " + Arrays.toString(sa));

        String ne = "G"; // Define new element to add
        List<String> l = new ArrayList<>(
                Arrays.asList(sa)); // Convert Array to ArrayList
        l.add(ne); // Add new element in ArrayList
        sa = l.toArray(sa); // Revert Conversion from ArrayList to Array
        // print the new Array
        System.out.println("Array with added Value:\n"
                            + Arrays.toString(sa));

    }

}
