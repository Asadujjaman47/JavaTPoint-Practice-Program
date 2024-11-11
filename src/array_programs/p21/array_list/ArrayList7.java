package array_programs.p21.array_list;

import java.util.ArrayList;
import java.util.Iterator;

// User-defined class objects in Java ArrayList
public class ArrayList7 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Asad", 25);
        Student s2 = new Student(102, "Akul", 26);
        Student s3 = new Student(103, "Arman", 20);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
