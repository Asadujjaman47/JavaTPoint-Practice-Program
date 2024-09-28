package array_programs.p16.minimum_difference_subarrays;

//Approach: Using Constant Space

public class MinDiffSubArrays3 {


    // a method that computes the minimum difference
    // between two subarrays taken from the input array
    // inputArr whose size is n
    public int findMinDiff(int[] inputArr, int n) {

        int totalEleSum = 0;

        for (int k = 0; k < n; k++) {
            totalEleSum += inputArr[k];
        }

        // Assigning the maximum value of the Integer to the
        // variable minDifference
        // The variable minDifference contains the answer
        int minDifference = Integer.MAX_VALUE;

        // curSum stores the sum of the first subarray
        int curSum = 0;

        for (int k = 0; k <= n; k++) {

            // updating the sum of the current subarray,
            curSum += inputArr[k];

            // Updating the minDifference
            minDifference =  Math.min(minDifference, Math.abs(curSum - (totalEleSum - curSum)));
        }

        return minDifference;
    }


    public static void main(String[] args) {

        // Creating an object of the class MinDiffSubArrays
        MinDiffSubArrays3 obj = new MinDiffSubArrays3();

        int[] arr = {7, 6, 8, 1, 5};
        int size = arr.length;
        int ans = obj.findMinDiff(arr, size);

        System.out.println("For the input array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        System.out.println("The minimum difference between the two subarray is: " + ans + "\n");
    }
}
