package string.p2.separatet_individual_characters;

// Java Program to separate the Individual Characters from a String
public class IndividualCharacters {
    public static void main(String[] args) {
        String string  = "characters";

        // Display individual characters from given string
        System.out.println("Individual characters from given string: ");

        //Iterate through the string and display individual character
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
