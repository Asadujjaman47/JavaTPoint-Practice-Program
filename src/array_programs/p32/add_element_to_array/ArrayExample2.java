package array_programs.p32.add_element_to_array;

import java.util.ArrayList;
import java.util.Arrays;

// Using ArrayList
public class ArrayExample2 {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6};
        System.out.println("Array:"+Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array after adding element: "+Arrays.toString(arr));

    }
}
