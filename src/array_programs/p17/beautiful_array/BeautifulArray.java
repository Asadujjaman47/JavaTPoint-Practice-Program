package array_programs.p17.beautiful_array;

//Approach / Algorithm: Using sorting

import java.util.Arrays;

public class BeautifulArray {

    // a method that checks whether the input array inputArr[]
    // is beautiful or not
    public boolean isBeautiful(int[] inputArr) {
        // computing the size of the inputArr array
        int size = inputArr.length;

        int auxArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            // each element of the input array has to be within
            // the range 1 to size
            if (inputArr[i] >= 1 && inputArr[i] <= size) {
                // coping elements to the input array
                auxArr[i] = inputArr[i];
            } else {
                // if the control reaches here, then it means
                // there is at least one element in the input array
                // that has gone out of the range. Hence, we can return false;
                return false;
            }
        }

        // sorting the auxiliary array
        Arrays.sort(auxArr);

        for (int i = 0; i < size; i++) {

            // checking whether the arrangement of the elements
            // in the input array matches with the auxArr or not
            if (inputArr[i] == auxArr[i]) {
                if (i == size - 1)
                    // reaching here means the arrangement of each element of the input array
                    // exactly matches with the arrangement of elements in the auxArr, i.e.,
                    // elements are arranged in ascending order. Hence, we can return false
                    return false;
            }

            // checking for repeated elements
            if (i != 0 && auxArr[i] == auxArr[i - 1])
                return false;
        }

        // all the conditions are satisfied. Hence,
        // the input array is beautiful, and we can return true
        return true;
    }

    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BeautifulArray obj = new BeautifulArray();

        int s = inputArr.length;

        System.out.print("The following input array is: \n{");
        for (int i = 0; i < s; i++) {
            System.out.print(inputArr[i] + " ");
        }
        System.out.print("} ");

        if (obj.isBeautiful(inputArr))
            System.out.println(" is beautiful");
        else
            System.out.println("is not beautiful");

        System.out.println();

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
