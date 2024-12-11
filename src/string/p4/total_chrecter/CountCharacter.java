package string.p4.total_chrecter;

// Java Program to count the total number of characters in a string
public class CountCharacter {
    public static void main(String[] args) {
        String string = "The best of both worlds";
        int count = 0;

        // Counts each character except spacej
        for (int i =0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }

        // Display the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}
