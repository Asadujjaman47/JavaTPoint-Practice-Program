package string.p6.determine_rotation;

// Java Program to determine whether one string is a rotation of another
public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde", str2  = "deabc";

        if (str1.length() != str2.length()) {
            System.out.println("Second string is not a rotation of first string");
        }
        else {
            // Concatenate str1 with str2 and store it in str1
            str1 = str1.concat(str2);
            // Check whether str2 is present in str1
            if (str1.indexOf(str2) != -1)
                System.out.println("Second string is a rotation of first string");
            else
                System.out.println("Second string is not a rotation of first string");
        }
    }
}
