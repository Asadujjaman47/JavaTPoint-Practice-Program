package error_exception.p10.avoid_null_pointer_exception;

// avoid null pointer exception in Java
// Using Ternary operator
public class AvoidNullPointer {
    public static void main(String[] args) {
        String str = null;
        String msg = (str == null) ? "null value" : str.concat("JTP");
        System.out.println(msg);

        str = "Javatpoint";
        msg = (str == null) ? "null value" : str.concat("JTP");
        System.out.println(msg);
    }
}
