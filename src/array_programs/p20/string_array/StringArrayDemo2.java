package array_programs.p20.string_array;

import java.util.Arrays;

//By Creating a New Array
public class StringArrayDemo2 {
    public static void main(String[] args) {
        String[] sa = {"A", "B", "C"};
        System.out.println("Initial Array: " + Arrays.toString(sa));

        int length_Var = sa.length;
        String newElement = "D";

        String[] newArray = new String[length_Var + 1];
        for (int i = 0; i < sa.length; i++) {
            newArray[i] = sa[i];
        }

        newArray[newArray.length - 1] = newElement;

        sa = newArray;
        System.out.println("updated Array: " + Arrays.toString(sa));
    }
}
