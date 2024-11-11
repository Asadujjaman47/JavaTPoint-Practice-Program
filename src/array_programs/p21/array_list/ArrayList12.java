package array_programs.p21.array_list;

import java.util.ArrayList;
import java.util.Iterator;

// Java ArrayList example of isEmpty() method
public class ArrayList12 {
    public static void main(String[] args) {

        // Create the first ArrayList
        ArrayList<String> al = new ArrayList<>();

        // Check is the ArrayList is empty
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

       // Display a message after insertion
        System.out.println("After Insertion: ");
        // Check if thr ArrayList is empty after insertion
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

    }
}
