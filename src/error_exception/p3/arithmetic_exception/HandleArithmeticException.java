package error_exception.p3.arithmetic_exception;

// Handling Arithmetic Exception
public class HandleArithmeticException {
    void divide(int a, int b) {
        int res;
        try {
            // performing division and storing the result
            res = a / b;
            System.out.println("Division process has been done successfully");
            System.out.println("Result came after division is: " + res);
        }
        // handling the exception in the catch block
        catch (java.lang.ArithmeticException ex) {
            System.out.println("Should avoid dividing by 0 " + ex);
        }
    }

    // main method
    public static void main(String[] args) {
        // creating an object of the class ArithmeticException
        HandleArithmeticException obj = new HandleArithmeticException();
        obj.divide(1, 0);
    }
}
