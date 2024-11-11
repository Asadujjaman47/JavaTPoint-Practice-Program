package array_programs.p16.minimum_difference_subarrays;

//Approach: Using Constant Space

public class MinDiffSubArrays3 {

    // a method that computes the minimum difference
    // between two subarrays taken from the input array
    // inputArr whose size is n
    public int findMinDiff(int inputArr[], int n) {
        int totalEleSum = 0;

        for (int k = 0; k < n; k++) {
            totalEleSum = totalEleSum + inputArr[k];
        }

        // Assigning the maximum value of the Integer to the
        // variable minDifference.
        // The variable minDifference contains the answer
        int minDifference = Integer.MAX_VALUE;

        // currSum stores the sum of the first subarray.
        int currSum = 0;

        for (int k = 0; k < n - 1; k++) {

        // updating the sum of the current subarray.
            currSum = currSum + inputArr[k];

        // the minimum difference has to be minimum
            minDifference = Math.min(minDifference, Math.abs(currSum - (totalEleSum - currSum)));
        }
        return minDifference;
    }

    // main method
    public static void main(String argvs[]) {

        // Creating an object of the class MinDiffSubArrays
        MinDiffSubArrays3 obj = new MinDiffSubArrays3();

        // input 1
        int arr[] = {7, 6, 8, 1, 5};
        int size = arr.length;
        int ans = obj.findMinDiff(arr, size);

        System.out.println("For the input array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        System.out.println("The minimum difference between the two subarrays is: " + ans + "\n");
        // input 2
        int arr1[] = {2, 4, 8, 9, 5, 7, 3, 6, 1};
        size = arr1.length;
        ans = obj.findMinDiff(arr1, size);

        System.out.println("For the input array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr1[k] + " ");
        }
        System.out.println();

        System.out.println("The minimum difference between the two subarrays is: " + ans + "\n");
        // input 3
        int arr2[] = {3, 3, 3, 3, 3};
        size = arr2.length;
        ans = obj.findMinDiff(arr2, size);

        System.out.println("For the input array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.println();

        System.out.println("The minimum difference between the two subarrays is: " + ans + "\n");
    }
}
