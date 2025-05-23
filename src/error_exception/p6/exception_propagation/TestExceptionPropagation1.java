package error_exception.p6.exception_propagation;

// Java Exception Propagation
// Note: By default Unchecked Exceptions are forwarded in calling chain (propagated).
public class TestExceptionPropagation1 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation1 obj=new TestExceptionPropagation1();
        obj.p();
        System.out.println("normal flow...");
    }
}
