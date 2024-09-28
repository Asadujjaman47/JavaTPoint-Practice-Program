package array_programs.p13.remove_duplicate_element;

// Remove Duplicate Element in Array using separate index
// And array is sorted:
public class RemoveDuplicateInArray2 {

    public static int removeDuplicateElements(int[] arr, int n) {
        if(n == 0 || n == 1)
            return n;

        int j = 0;  // for next element
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
