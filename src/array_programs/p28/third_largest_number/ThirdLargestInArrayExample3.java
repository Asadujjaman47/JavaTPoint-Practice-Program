package array_programs.p28.third_largest_number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Find 3rd Largest Number in Array using Collections
public class ThirdLargestInArrayExample3 {

    public static Integer getThirdLargest(Integer[] a, int total) {

        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total - 3);
        return element;
    }


    public static void main(String args[]){
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={44,66,99,77,33,22,55};
        System.out.println("Smallest: "+getThirdLargest(a,6));
        System.out.println("Smallest: "+getThirdLargest(b,7));
    }
}
