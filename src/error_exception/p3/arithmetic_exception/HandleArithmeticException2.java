package error_exception.p3.arithmetic_exception;

import java.math.BigDecimal;

public class HandleArithmeticException2 {

// main method
public static void main(String[] args) {

// creating two objects of BigDecimal
            BigDecimal a1 = new BigDecimal(11);
            BigDecimal a2 = new BigDecimal(17);
            try {
// 11 / 17 = 0.6470588235294118...
                a1 = a1.divide(a2);
                System.out.println(a1.toString());
            }
// handling the exception in the catch block
            catch (java.lang.ArithmeticException ex) {
                System.out.println("Should avoid dividing by an integer that leads to non-terminating decimal expansion. " + ex);
            }
        }
}