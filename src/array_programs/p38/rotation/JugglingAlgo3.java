package array_programs.p38.rotation;

// By Using Juggling Algorithm
public class JugglingAlgo3 {

    // function that rotates (left) the array of size n by d
    void rotateLeft(int array[], int d, int n) {
        // execute if d >= n;
        d = d % n;
        int i, j = 0, k, temp;
        // calling gcd() function to determine the GCD of n and d
        int gcd = gcd(d, n);
        for (i = 0; i < gcd; i++) {
            // moves the i-th values of the blocks
            temp = array[j];
            j = i;

            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;

                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
    }

    // function to determine the GCD of a and b
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    //function to print array
    void printArray(int array[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String args[]) {
        JugglingAlgo3 arf = new JugglingAlgo3();
        //array to rotate
        int array[] = {19, 25, 22, 67, -90, 77, -11, -20, 76};
        System.out.println("Array before rotation: ");
        arf.printArray(array, 9);
        System.out.println("\n");
        arf.rotateLeft(array, 2, 9);
        System.out.println("Array after left rotation: ");
        arf.printArray(array, 9);
    }
}
