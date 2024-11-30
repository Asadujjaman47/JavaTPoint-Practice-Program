package java_basic.p16.number_positive_negative;

// Check if a Number is Positive or Negative
// Using Relational Operator
public class CheckPositiveOrNegativeExample1 {
    public static void main(String[] args) {
        //number to be check
        int num = 912;
        //checks the number is greater than 0 or not
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        //checks the number is less than 0 or not
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        //executes when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }
    }

}
