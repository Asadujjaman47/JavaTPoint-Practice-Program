package java_basic.p3.palindrome;

// Palindrome Program in Java
// Using Recursion
public class PalindromeExample2 {
    public static void main(String[] args) {
        int num = 12021, reverse = 0, rem, temp;

        if (getReverse(num, reverse) == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }

    // function to reverse the number
    static int getReverse(int num, int rev) {
        if (num == 0)
            return rev;
        int rem = num % 10;
        rev = rev * 10 + rem;
        return getReverse(num/10, rev);
    }
}
