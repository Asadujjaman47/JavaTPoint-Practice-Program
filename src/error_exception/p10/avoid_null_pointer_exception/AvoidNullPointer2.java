package error_exception.p10.avoid_null_pointer_exception;

// avoid null pointer exception in Java
// Checking arguments of the method
public class AvoidNullPointer2 {
    static int value = 50;
    public static int getValue(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Arguments can not be null");
        }
        return value;
    }

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(getValue(s));
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException caught");
        }

        s = "JTP";
        try {
            System.out.println(getValue(s));
        }catch (IllegalArgumentException ex) {
            // TODO: handle exception
            System.out.println("IllegalArgumentException caught");
        }
    }
}
