package string.p16.palindrome_partitioning;

// Palindrome Partitioning Problem in Java
// Using Recursion
public class PalinPartition {

    // method for checking whether the string str is palindrome or not
    public boolean isPalindrome(String str, int x, int y) {
        while (x < y) {
            if (str.charAt(x) != str.charAt(y))
                return false;

            x = x+1;
            y = y-1;
        }
        return true;
    }

    public int minPalPartition(String str, int x, int y) {
        // if the string contains only one element or the
        // string is palindrome then there is not cut required
        // hence, the number if minimum cut is zero
        if (x >= y || isPalindrome(str, x, y)) {
            return 0;
        }

        // for storing the number of minimum cut
        int answer = Integer.MAX_VALUE;
        int count;

        // for each value m we need place a cut and then
        // we try to minimize the number of cuts applied
        for (int m = x; m < y; m++) {
            count = minPalPartition(str, x, m) +
                    minPalPartition(str, m+1, y) +
                    1;

            answer = Math.min(answer, count);
        }

        return answer;
    }
    // main method
    public static void main(String[] argvs) {

// string for which the number of palindrome partitioning cuts is computed
        String s = "pmpmmmpmmpmpmp";

// computing the size of the string
        int size = s.length();

// creating an object of the class PalinPartition
        PalinPartition obj = new PalinPartition();

// invoking the method minPalPartition
        int minCut = obj.minPalPartition(s, 0, size - 1);

        System.out.println("For the string '" + s + "' the number of minimum cuts is: " + minCut);

// string for which the number of palindrome partitioning cuts is computed
        s = "pqrstu";

// computing the size of the string
        size = s.length();

// invoking the method makeSquare
        minCut = obj.minPalPartition(s, 0, size - 1);

        System.out.println("For the string '" + s + "' the number of minimum cuts is: " + minCut);

// string for which the number of palindrome partitioning cuts is computed
        s = "pmptuiutpmp";

// computing the size of the string
        size = s.length();

// invoking the method makeSquare
        minCut = obj.minPalPartition(s, 0, size - 1);

        System.out.println("For the string '" + s + "' the number of minimum cuts is: " + minCut);

    }
}
