package error_exception.p1.throw_exception;

// Throwing Unchecked Exception
public class TestThrow1 {

    // function to check if person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Person is not eligible to vote");
        else
            System.out.println("Person is eligible to vote!");
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
