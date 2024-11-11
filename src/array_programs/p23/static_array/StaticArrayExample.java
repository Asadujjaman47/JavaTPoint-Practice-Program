package array_programs.p23.static_array;

// Static Array in Java
public class StaticArrayExample {
    private static String[] array;

    static {
        array = new String[2];
        array[0] = "Welcome to";
        array[1] = "Java";
    }

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
