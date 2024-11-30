package java_basic.p8.create_object.deserialization_ex;

import java.io.Serializable;

public class Employee implements Serializable {
    int empid;
    String empname;

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
}
