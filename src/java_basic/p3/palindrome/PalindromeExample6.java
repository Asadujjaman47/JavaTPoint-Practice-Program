package java_basic.p3.palindrome;

import java.util.Stack;

// Palindrome Program in Java
// Using Stack
public class PalindromeExample6 {
    public static void main(String[] args) {

        // Level would not have been palindrome if toLowerCase method was not used
        System.out.println(isPalindrome("Level".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("MADAM".toLowerCase()));
    }

    // function to reverse the number
    private static boolean isPalindrome(String str) {
        char[] data = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: data) {
            stack.push(c);
        }
        char[] data2 = new char[data.length];
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            data2[i] = stack.pop();
        }

        var reversed = new String(data2);
        return str.equals(reversed);
    }
}
