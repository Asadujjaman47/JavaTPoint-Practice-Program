package java_basic.p1.fibonacci;


// Fibonacci Series in Java
// Fibonacci Series in Java Using Recursion
public class FibonacciExample2 {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void printFibonaccu(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonaccu(count-1);
        }
    }
    public static void main(String[] args) {
        int count = 10;

        System.out.print(n1 + " " + n2); // print 0 and 1
        printFibonaccu(count-2); // n-2 because 2 numbers are already printed
    }
}
