package error_exception.p3.arithmetic_exception;

import java.math.BigDecimal;

// Arithmetic Exception in Java
public class ArithmeticException3 {
    // main method
    public static void main(String[] args) {
        // creating two objects of BigDecimal
        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal(17);

        // 11 / 17 = 0.6470588235294118...
        // rounding up to decimal places
        a1 = a1.divide(a2, 6, BigDecimal.ROUND_DOWN);
        System.out.println(a1.toString());
    }
}
