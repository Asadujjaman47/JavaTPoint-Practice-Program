package java_basic.p1.fibonacci;


// Fibonacci Series in Java
// Fibonacci Series in Java Without Using Recursion
public class FibonacciExample1 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);  // printing 0 and 1

        for (i=2; i < count; i++) {
            n3 = n1+n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
