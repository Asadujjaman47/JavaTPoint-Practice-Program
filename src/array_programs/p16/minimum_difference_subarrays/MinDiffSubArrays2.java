package array_programs.p16.minimum_difference_subarrays;

//Approach: Using PrefixSum

public class MinDiffSubArrays2 {

    // a method that computes the minimum difference
    // between two subarrays taken from the input array
    // inputArr whose size is n
    public int findMinDiff(int inputArr[], int n) {

        // Allocating the memory for the prefix array prefixArr
        int prefixArr[] = new int[n];

        for (int k = 0; k < n; k++) {
            prefixArr[k] = inputArr[k];
        }

        // As mentioned in the algorithm,
        // prefixArr[j] is the sum of elements
        // from 0 to j of the input array.
        for (int j = 1; j < n; j++) {
            prefixArr[j] = prefixArr[j - 1] + prefixArr[j];
        }

        // Assigning the maximum value of the Integer to the
        // variable minDifference.
        // The variable minDifference contains the answer
        int minDifference = Integer.MAX_VALUE;

        for (int k = 0; k <= n - 2; k++) {

            // firstSubArrSum keeps the first subarray sum.
            int firstSubArrSum = prefixArr[k];

            // secondSubArrSum keeps the second subarray sum.
            int secondSubArrSum = prefixArr[n - 1] - prefixArr[k];

            // Updating the minDifference
            minDifference = Math.min(minDifference, Math.abs(firstSubArrSum - secondSubArrSum));
        }
        return minDifference;
    }

    // main method
    public static void main(String argvs[]) {
        // Creating an object of the class MinDiffSubArrays
        MinDiffSubArrays2 obj = new MinDiffSubArrays2();
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
