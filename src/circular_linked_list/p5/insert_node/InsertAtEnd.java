package circular_linked_list.p5.insert_node;

// Java program to insert a new node at the end of the Circular Linked List
public class InsertAtEnd {

    // Represents the node of list
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Declaring head and tail pointer as null
    public Node head = null;
    public Node tail = null;

    // The function will add the new node at the end of the list.
    public void addAtEnd (int data) {

        // Create new node
        Node newNode = new Node(data);

        // Check if the list is empty
        if (head == null) {
            // If list is empty, both head and tail would point to new node
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            // tail wll point to new node
            tail.next = newNode;
            // New node will become new tail.
            tail = newNode;
            // Since, it is circular linked list tail will point to head
            tail.next = head;
        }
    }

//    Displays all the nodes in the list
    public void display() {
        Node current = head;
        if (head == null)
            System.out.println("List is empty");

        else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                // Prints each node by incrementing pointer
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InsertAtEnd cl = new InsertAtEnd();
        //Adding 1 to the list
        cl.addAtEnd(1);
        cl.display();
        //Adding 2 to the list
        cl.addAtEnd(2);
        cl.display();
        //Adding 3 to the list
        cl.addAtEnd(3);
        cl.display();
        //Adding 4 to the list
        cl.addAtEnd(4);
        cl.display();
    }
}
