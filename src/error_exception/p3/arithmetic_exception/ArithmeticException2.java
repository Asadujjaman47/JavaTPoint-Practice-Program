package error_exception.p3.arithmetic_exception;

import java.math.BigDecimal;

// Arithmetic Exception in Java
// Non-Terminating Big Decimal
public class ArithmeticException2 {
    public static void main(String[] args) {
        // creating two objects of BigDecimal
        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal(17);

        // 11 / 17 = 0.6470588235294118
        a1 = a1.divide(a2);
        System.out.println(a1.toString());
    }
}
