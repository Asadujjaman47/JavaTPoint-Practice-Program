package java_basic.p2.factorial;

// Factorial Program in Java
// Factorial Program Using Dynamic Programming in Java
// Tabulation (Bottom-up) Approach:
public class FactorialExample3 {
    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <=n; i++) {
            dp[i] = dp[i-1]*i;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
