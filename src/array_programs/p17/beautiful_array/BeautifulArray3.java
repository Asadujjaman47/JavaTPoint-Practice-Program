package array_programs.p17.beautiful_array;

//Approach: Using Sum of n Natural Numbers

import java.util.HashMap;

public class BeautifulArray3 {

    // a method that checks whether the input array inputArr[]
    // ia beautiful or not
    public boolean isBeautiful(int[] inputArr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int size = inputArr.length;

        int sumOfnNaturalNo = ((size*(size+1)))/2;

        boolean isAscending = true;

        int sumOfinputArrEle = 0;
        for(int i = 0; i < size; i++) {
            sumOfinputArrEle += inputArr[i];

            // checking whether the arrangement of the elements
            // in the input array is the ascending order or not
            if ( i != 0 && inputArr[i] < inputArr[i-1]) {
                isAscending = false;
            }
        }

        if(!isAscending && (sumOfinputArrEle == sumOfnNaturalNo)) {
            return true;
        }

        return false;
    }

    // main method
    public static void main(String[] args) {

        // input 1
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // creating an object of the class BeautifulArray3
        BeautifulArray3 obj = new BeautifulArray3();

        int s = inputArr.length;
        System.out.print("The following input array is: \n{");
        for (int i = 0; i < s; i++) {
            System.out.print(inputArr[i] + " ");
        }
        System.out.print("}");

        if (obj.isBeautiful(inputArr))
            System.out.println(" is beautiful");
        else
            System.out.println(" is not beautiful");
        System.out.println("\n");

        // input 2
        int inputArr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 19, 10};

        s = inputArr1.length;

        System.out.print("The following input array is: \n{ ");
        for (int i = 0; i < s; i++) {
            System.out.print(inputArr1[i] + " ");
        }

        System.out.print("}");
        if (obj.isBeautiful(inputArr1)) {
            System.out.println(" is beautiful.");
        } else {
            System.out.println(" is not beautiful.");
        }

        System.out.println(" \n");


        // input 3
        int inputArr2[] = {1, 2, 3, 4, 5, 6, 7, 9, 9, 10};

        s = inputArr2.length;

        System.out.print("The following input array is: \n{ ");
        for (int i = 0; i < s; i++) {
            System.out.print(inputArr2[i] + " ");
        }

        System.out.print("}");
        if (obj.isBeautiful(inputArr2)) {
            System.out.println(" is beautiful.");
        } else {
            System.out.println(" is not beautiful.");
        }

        System.out.println(" \n");


        // input 3
        int inputArr3[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9};

        s = inputArr3.length;

        System.out.print("The following input array is: \n{ ");
        for (int i = 0; i < s; i++) {
            System.out.print(inputArr3[i] + " ");
        }

        System.out.print("}");
        if (obj.isBeautiful(inputArr3)) {
            System.out.println(" is beautiful.");
        } else {
            System.out.println(" is not beautiful.");
        }
    }
}
