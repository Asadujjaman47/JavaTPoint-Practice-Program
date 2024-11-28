package java_basic.p4.reverse_string;

// Reverse String in Java
// By Using StringBuilder / StringBuffer Class
public class StringFormatter {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("this is a string!"));
    }
}
