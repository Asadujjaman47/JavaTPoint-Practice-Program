package array_programs.p49.equilibrium_index;

// Equilibrium Index of an Array in Java
// Using an Iterative Approach
public class EquilibriumIndexExample2 {

    static int eqbmindex(int array[], int n) {
        //lsum denotes the left sum and rsum denotes the right sum
        int[] prefix = new int[n];
        //stores the sum of whole array
        for (int i = 0; i < n; i++) {
            if (i == 0)
                prefix[i] = array[i];
            else prefix[i] = array[i] + prefix[i - 1];
        }
        int rsum = prefix[n - 1];
        for (int i = 0; i < n; i++) {
            rsum = rsum - array[i];
            int lsum = prefix[i + 1];
            if (rsum == rsum)
                return i + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
//        int array[] = {0, -4, 7, -4, -2, 6, -3, 0};
        int array[] = {9, 3, 7, 6, 8, 1, 10};
        int arraysize = array.length;
        System.out.print("Equilibrium Index is: ");
        System.out.println(eqbmindex(array, arraysize));
    }
}
