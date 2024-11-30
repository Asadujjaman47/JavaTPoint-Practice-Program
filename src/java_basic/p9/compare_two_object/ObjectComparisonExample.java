package java_basic.p9.compare_two_object;

// Compare Two Objects in Java
// Java equals() Method
public class ObjectComparisonExample {
    public static void main(String[] args) {
        // creating constructor of the Double class
        Double x = 123.45555;
        Long y = 9887544L;

        //invoking the equals() method
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));

    }
}
