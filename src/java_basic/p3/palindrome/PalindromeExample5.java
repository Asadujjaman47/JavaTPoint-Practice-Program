package java_basic.p3.palindrome;

import java.util.Scanner;

// Palindrome Program in Java
// Using toCharArray() Method
public class PalindromeExample5 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }

    // function to reverse the number
    private static boolean isPalindrome(String str) {
        char[] data = str.toCharArray();
        int i = 0;
        int j = data.length - 1;
        while (j > i) {
            if(data[i] != data[j])
                return false;
            ++i;
            --j;
        }
        return true;
    }
}
