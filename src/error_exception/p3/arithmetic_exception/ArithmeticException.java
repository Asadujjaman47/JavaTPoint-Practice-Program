package error_exception.p3.arithmetic_exception;

// Arithmetic Exception in Java
// Example of Arithmetic Exception Occurrence
// Divide By 0
public class ArithmeticException extends Throwable {
    void divide(int a, int b) {
        // performing division and storing the result
        int res = a / b;
        System.out.println("Division process has been done successfully");
        System.out.println("Result came after division is: " + res);
    }

    // main method
    public static void main(String[] args) {
        // creating an object of the class ArithmeticException
        ArithmeticException obj = new ArithmeticException();
        obj.divide(1, 0);
    }
}
