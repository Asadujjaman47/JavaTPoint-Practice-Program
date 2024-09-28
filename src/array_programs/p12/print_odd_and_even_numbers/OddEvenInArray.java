package array_programs.p12.print_odd_and_even_numbers;

public class OddEvenInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Even Numbers: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
