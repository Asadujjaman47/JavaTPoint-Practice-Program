package array_programs.p22.array_of_object;

public class Product {
    int pro_id;
    String pro_name;

    // Product class constructor

    public Product(int pro_id, String pro_name) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
    }

    public void display() {
        System.out.println("Product Id = " + pro_id + " " + " Product Name = " + pro_name);
        System.out.println();
    }
}
