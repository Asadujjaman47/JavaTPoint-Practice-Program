package array_programs.p21.array_list;

import java.util.ArrayList;
import java.util.List;

// Java ArrayList Example: Book
public class ArrayListExample13 {
    public static void main(String[] args) {

        // Creating list of Book
        List<Book> list = new ArrayList<>();

        // Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        // Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Traversing list
        for(Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
