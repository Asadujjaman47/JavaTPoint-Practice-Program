package java_basic.p2.factorial;

import java.util.HashMap;
import java.util.Map;

// Factorial Program in Java
// Factorial Program Using Dynamic Programming in Java
// Memoization (Top-down DP) Approach:
public class FactorialExample4 {
    private static Map<Integer,Integer> memo = new HashMap<>();
    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n == 0 || n == 1)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);

        int result = n * factorial(n-1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
