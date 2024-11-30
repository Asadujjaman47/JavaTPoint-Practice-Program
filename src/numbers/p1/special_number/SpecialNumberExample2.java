package numbers.p1.special_number;

import java.util.Scanner;

// Special Number in Java
// Special Number Within a Range
public class SpecialNumberExample2 {
    //Array with factorials of 0 to 9
    static int factorial[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean hasSpecial = false;
//Enter the range values
        System.out.print("Enter the lower range: ");
//reads the lower range
        int lower_range = in.nextInt();
        System.out.print("Enter the upper range: ");
//reads the upper range
        int upper_range = in.nextInt();
//iterates over the given range
        for (int i = lower_range; i <= upper_range; i++) {
//use isSpecial() method to check if it is special
            if (isSpecialNumber(i)) {
//prints the special number
                System.out.print(i + "\t");
                hasSpecial = true;
            }
        }
//executes if the specified range does not have any special number
        if (!hasSpecial)
            System.out.println("No special numbers found.");
    }

    //function checks if the number is special or not, if special returns true
    private static boolean isSpecialNumber(int n) {
        int digit, sum = 0, temp = n;
//Extract digits and sum their factorial
        while (temp != 0) {
//find digits
            digit = temp % 10;
//finds sum of factorials
            sum = sum + factorial[digit];
//removes the last digit from the number
            temp = temp / 10;
        }
//returns true if sum==n, else returns false
        return sum == n;
    }
}

