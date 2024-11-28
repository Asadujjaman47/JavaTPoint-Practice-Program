package java_basic.p4.reverse_string;

// Reverse String in Java
// By Using Reverse Iteration
public class StringFormatter2 {
    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for(int i = ch.length-1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("this is a string!"));
    }
}
