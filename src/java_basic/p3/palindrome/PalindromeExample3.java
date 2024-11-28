package java_basic.p3.palindrome;

// Palindrome Program in Java
// Using StringBuilder Class
public class PalindromeExample3 {
    public static void main(String[] args) {
        // convert these strings to either lowercase or uppercase to create consistency
        System.out.println(isPalindrome("radar".toLowerCase()));

        // Naman would not have been palindrome if toLowerCase() method was not used
        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }

    // function to reverse the number
    private static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}
