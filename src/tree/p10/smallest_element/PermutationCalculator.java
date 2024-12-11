package tree.p10.smallest_element;

import java.util.Scanner;

public class PermutationCalculator {

    // Function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the length of the string
        int n = input.length();

        // Calculate and display the total number of permutations
        long permutations = factorial(n);
        System.out.println("Total number of permutations: " + permutations);

        scanner.close();
    }
}
