package array_programs.p21.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Iterating Collection through remaining ways
public class ArrayListExample6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println("Traversing list through List Iterator: ");
        // Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println("Traversing list through for loop.");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through forEach() method: ");
        // The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a -> { // Here, we are using lambda expression
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> { // Here, we are using lambda expression
            System.out.println(a);
        });
    }
}
