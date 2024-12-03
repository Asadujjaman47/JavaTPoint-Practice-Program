package circular_linked_list.p3.search;

// Java program to search an element in a Circular Linked List
public class SearchNode {

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
    public void add (int data) {

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

    // Searches for a node in the list
    public void search(int element) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        // Checks whether list is empty
        if (head == null)
            System.out.println("List is empty");
        else {
            do {
                // Compares element to be found with each node present in the list
                if (current.data == element) {
                    flag = true;
                    break;
                }
                current = current.next;
                i++;
            } while (current != head);

            if (flag)
                System.out.println("Element is present in the list at the posiiton: " +i);
            else
                System.out.println("Element is not present in the list");
        }

    }

//    Displays all the nodes in the list
    public void display() {
        Node current = head;
        if (head == null)
            System.out.println("List is empty");

        else {
            do {
                // Prints each node by incrementing pointer
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SearchNode cl = new SearchNode();
        // Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);

        // Displays all the nodes present in the list
        cl.display();

        cl.search(2);
        //Search for node in the list
        cl.search(7);
    }
}
