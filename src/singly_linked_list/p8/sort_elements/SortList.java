package singly_linked_list.p8.sort_elements;

// Program to sort the elements of the singly linked list
public class SortList {

    // Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if(head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    // sortList() will sort nodes of the list in ascending oder
    public void sortList() {
        // Node current will point to head
        Node current = head, index = null;
        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater than index's node data, swap the data between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SortList sList = new SortList();

        // Add nodes to the list
        sList.addNode(9);
        sList.addNode(7);
        sList.addNode(2);
        sList.addNode(5);
        sList.addNode(4);

        // Displays the nodes present in the list
        System.out.println("Original list: ");
        sList.display();

        // Sorting list
        sList.sortList();

        // Displaying sorted list
        System.out.println("Sorted list: ");
        sList.display();
    }
}
