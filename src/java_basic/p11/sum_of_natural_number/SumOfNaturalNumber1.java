package java_basic.p11.sum_of_natural_number;

// Find Sum of Natural Numbers
// Using Java for Loop
public class SumOfNaturalNumber1 {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
        //executes until the condition returns true
        for (i = 1; i <= num; ++i) {
        //adding the value of i into sum variable
            sum = sum + i;
        }
        //prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
