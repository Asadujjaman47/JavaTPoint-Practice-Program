package array_programs.p47.count_occurance;


import java.util.HashMap;

// Java Program to Count the Occurrences of Each Character
// Using Java HashMap
public class CountOccuranceOfChar3 {

    public static void main(String[] args) {
        String str = "google";
        // HashMap char as a key and occurrence as a value
        HashMap <Character, Integer> charCount = new HashMap<>();
        for (int i = str.length()-1; i >= 0; i--) {
            if(charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else {
                charCount.put(str.charAt(i), 1);
            }
        }

        System.out.println(charCount);
    }
}
