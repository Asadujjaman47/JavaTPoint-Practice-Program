package error_and_exception.p6.exception_propagation;

import java.io.IOException;

// Java Exception Propagation
// Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class TestExceptionPropagation2 {
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}
