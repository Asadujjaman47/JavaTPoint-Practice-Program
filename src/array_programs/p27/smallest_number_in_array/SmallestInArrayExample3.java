package array_programs.p27.smallest_number_in_array;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Find Smallest Number in Array using Collections
public class SmallestInArrayExample3 {

    public static Integer getSmallest(Integer[] a, int total) {

        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(0);
        return element;
    }


    public static void main(String args[]){
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={44,66,99,77,33,22,55};
        System.out.println("Smallest: "+getSmallest(a,6));
        System.out.println("Smallest: "+getSmallest(b,7));
    }
}
