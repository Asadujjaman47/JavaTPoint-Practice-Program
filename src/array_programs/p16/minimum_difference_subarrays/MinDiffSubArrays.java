package array_programs.p16.minimum_difference_subarrays;

//Approach: Brute Force

public class MinDiffSubArrays {

    int minDiff = Integer.MAX_VALUE;

    // a method that computes the minimum difference
    // between two subarrays taken from the input array
    // inputArr whose size is n
    public void findMinDiff(int[] inputArr, int firstSubArrSum, int i, int n, int total) {
        // handling the base case
        if (i >= n)
            return;

        if (firstSubArrSum != 0) {
            int secondSubArrSum = total - firstSubArrSum;
            minDiff = Math.min(minDiff, Math.abs(secondSubArrSum - firstSubArrSum));
        }

        // including the element inputArr[i] in the firstSubArrSum
        findMinDiff(inputArr, firstSubArrSum + inputArr[i], i + 1, n, total);

        // excluding the element inputArr[i] in the firstSubArrSum
        findMinDiff(inputArr, firstSubArrSum, i + 1, n, total);
    }

    // a method that finds the sum of element
    // of the array arr[]
    public int findSumEle(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        // Creating an object of the class MinDiffSubArrays
        MinDiffSubArrays obj = new MinDiffSubArrays();

        int[] arr = {7, 6, 8, 1, 5};
        int size = arr.length;
        obj.findMinDiff(arr, 0, 0, size, obj.findSumEle(arr, size));
        int ans = obj.minDiff;

        System.out.println("For the input array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        System.out.println("The minimum difference between the two subarray is: " + ans + "\n");
    }
}
