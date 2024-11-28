package java_basic.p5.reverse_number;

// Reverse a Number in Java
// Reverse a number using for loop
public class ReverseNumberExample2 {
    public static void main(String[] args) {
        int number = 123456, reverse = 0;
        //we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
