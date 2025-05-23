package array_programs.p34.second_smallest_element;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Find 2nd Smallest Number in Array using Collections
public class SecondSmallestInArray3 {

    public static int getSecondSmallest(Integer[] a, int total){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(1);
        return element;
    }

    public static void main(String args[]){
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={44,66,99,77,33,22,55};
        System.out.println("Second Smallest: "+getSecondSmallest(a,6));
        System.out.println("Second Smallest: "+getSecondSmallest(b,7));
    }
}
