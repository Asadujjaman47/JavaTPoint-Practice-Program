package array_programs.p24.find_largest_number;

// Find Largest Number in Array using Arrays
public class LargestInArrayExample1 {

    public static int getLargest(int[] a, int total) {
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < total; i++) {
            if(a[i] > mx) {
                mx = a[i];
            }
        }

        return mx;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 2};
        int[] b = {44, 66, 99, 77, 33, 22, 55};

        System.out.println("Largest: " + getLargest(a, 6));
        System.out.println("Largest: " + getLargest(b, 7));
    }
}
