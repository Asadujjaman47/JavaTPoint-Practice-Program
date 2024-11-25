package array_programs.p42.peak_index_of_mountain;

// Peak Index of Mountain Array Problem in Java
// Using Linear Search
public class PeakIndex2 {

    public static void main(String[] args) {

        PeakIndex2 pi = new PeakIndex2();
        int index = pi.findPeakIndex(new int[] {4, 6, 9, 11, 45, 40, 20, 1});
        System.out.println("The peak index of the mountain array is: " + index);
    }

    // user-defined function that finds the peak index of the mountain array
    public int findPeakIndex(int[] A) {
        if (A == null || A.length < 3) return -1;
        int previous = A[0];
        for (int i = 1; i < A.length-1; i++) {
            if(previous < A[i] && A[i+1] < A[i]) {
                return i;
            }
        }
        return -1;
    }
}
