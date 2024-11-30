package java_basic.p13.sum_of_numbers;

//Sum of Two Numbers Using Command Line Arguments in Java
public class SumOfNumbers4 {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]); //first arguments
        int y = Integer.parseInt(args[1]); //second arguments
        int sum = x + y;
        System.out.println("The sum of x and y is: " +sum);
    }
}
