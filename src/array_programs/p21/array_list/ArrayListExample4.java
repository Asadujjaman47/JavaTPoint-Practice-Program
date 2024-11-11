package array_programs.p21.array_list;

import java.util.ArrayList;

// Get and Set ArrayList
public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // accessing the element
        System.out.println("Returning element: " + list.get(1));

        // changing the element
        list.set(1, "Dates");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
