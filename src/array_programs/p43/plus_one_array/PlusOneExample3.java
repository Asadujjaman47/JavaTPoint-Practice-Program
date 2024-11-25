package array_programs.p43.plus_one_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;


// Plus One to Array Problem in Java
public class PlusOneExample3 {

    // function to add one to the array
    public static void plusOne(Vector<Integer> digits, int n) {

        //revers the given array so that we can begin traversing from back
        Collections.reverse(digits);
        //defining a variable to store carry
        int carry = 0;
        for (int i = 0; i < n; i++) {
            //initially carry is 0, it is the base case
            if (i == 0)
                digits.set(i, digits.get(i) + 1 + carry);
            //if carry is not equal to zero, add it to the array element at that position
            else if (carry != 0)
                digits.set(i, digits.get(i) + carry);
            //now to get carry, i.e. if digits[i]>9 we get the value at tens place in carry or else if digits[i]<9 carry will be 0
            carry = digits.get(i) / 10;
            //now if carry is not equal to 0, so at that index, we should keep the value present at the ones place so we do digits[i]%10
            if (carry != 0) digits.set(i, digits.get(i) % 10);
        }
        //after doing all that if carry is still there which means one more element is needed to be added to the array
        if (carry != 0)
            digits.set(digits.size() - 1, carry);
        //again, revere the array so that we can get the original array
        Collections.reverse(digits);
    }

    public static void main(String[] args) {

        //creating an instance of the vector class and passing an array
        Vector<Integer> digits = new Vector<Integer>(Arrays.asList(9, 9, 9, 9, 9));
        //determines the size of the array
        int n = digits.size();
        //function calling
        plusOne(digits, n);
        for (int i = 0; i < n; i++) {
            //prints the array after adding 1 to the array
            System.out.print(digits.get(i) + " ");
        }
    }
}