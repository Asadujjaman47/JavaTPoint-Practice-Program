package string.p15.count_vowels_consonants;

// Java Program to count the total number of vowels and consonants in a string
public class CountVowelConsonant {
    public static void main(String[] args) {

        // Counter variable to store of vowles and consonant
        int vCount = 0, cCount = 0;

        // Declare a string
        String str = "This is a really simple sentence";

        // Converting entire string to lower case to reduce the comparisons
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            // Checks whether a charecter is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                // Increments the vowel counter
                vCount++;
            }
            // Checks whether a character is a consonant
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }

        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
