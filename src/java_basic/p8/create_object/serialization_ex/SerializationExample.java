package java_basic.p8.create_object.serialization_ex;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Creating the object
            Employee emp = new Employee(198054, "Asad");
            // Creates a stream and writes the object
            FileOutputStream fout = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
            // closes the output stream
            out.close();
            System.out.println("Successfully Created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
