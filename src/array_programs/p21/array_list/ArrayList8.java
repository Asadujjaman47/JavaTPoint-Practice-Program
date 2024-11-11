package array_programs.p21.array_list;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

// Java ArrayList Serialization and Deserialization Example
public class ArrayList8 {
    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("Asad");
        al.add("Akul");
        al.add("Arman");

        try {

            // Serialization
//            FileOutputStream fos = new FileOutputStream("file");
            FileOutputStream fos = new FileOutputStream("src/array_programs/p21/array_list/file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();

            // Deserialization
            FileInputStream fis = new FileInputStream("src/array_programs/p21/array_list/file");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
