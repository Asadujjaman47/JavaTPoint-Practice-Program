package array_programs.p20.string_array;

import java.util.Arrays;

// Sorting in String Array
public class StringArraySorting {
    public static void main(String[] args) {
        String[] colors = {"Cricket","Basketball","Football","Badminton","Tennis"};
        System.out.println("Entered Sports: " + Arrays.toString(colors));

        Arrays.sort(colors);
        System.out.println("Sorted Sports: " + Arrays.toString(colors));
    }
}
