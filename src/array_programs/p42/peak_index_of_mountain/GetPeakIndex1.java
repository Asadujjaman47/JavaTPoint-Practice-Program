package array_programs.p42.peak_index_of_mountain;

// Peak Index of Mountain Array Problem in Java
// Using Binary Search
public class GetPeakIndex1 {

    // user-defined function that finds the index of the mountain array
    public static int findPeakIndex(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low < high) {
            mid = low + (high - low)/2;

            // compares mid of the array with the next element
            if (array[mid] >= array[mid+1]) {
                // if the above condition is true, sets:
                high = mid;
            }

            // if the condition becomes false
            // array[mid] >= array[mid+1] sets
            else {
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] mountainArray = {4, 2, 7, 9, 8, 3, 1};
        int peakindex = findPeakIndex(mountainArray);
        System.out.println("The peak index of the mountain array is: " + peakindex);
    }
}
