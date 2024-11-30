package java_basic.p11.sum_of_natural_number;

// Find Sum of Natural Numbers
// Using Java while Loop
public class SumOfNaturalNumber2 {
    public static void main(String[] args) {
        {
            int num = 100, i = 1, sum = 0;
            //executes until the condition returns true
            while (i <= num) {
            //adding the value of i into sum variable
                sum = sum + i;
            //increments the value of i by 1
                i++;
            }
            //prints the sum
            System.out.println("Sum of First 100 Natural Numbers is = " + sum);
        }
    }
}