package array_programs.p21.array_list;

import java.util.ArrayList;

// Iterating ArrayList using For-each loop
public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
