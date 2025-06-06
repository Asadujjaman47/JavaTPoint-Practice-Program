package java_basic.p2.factorial;

// Factorial Program in Java
// Factorial Program Using Recursion in Java
public class FactorialExample2 {
    static int factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int fact = 1;
        int number = 4; // It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
