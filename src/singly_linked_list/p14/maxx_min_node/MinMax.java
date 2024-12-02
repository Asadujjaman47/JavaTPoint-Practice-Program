package singly_linked_list.p14.maxx_min_node;

// Program to find the maximum and minimum value node from a singly linked list
public class MinMax {
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

    // minNode() will find out the minimum value node in the list
    public void minNode() {
        Node current = head;
        int min;

        if (head == null) {
            System.out.println("List is empty");
        }

        // Initializing min with head node data
        min = head.data;

        while (current != null) {
            // If current node's data is smaller than min
            // Then, replace value of min with current node's data
            if (min > current.data)
                min = current.data;

            current = current.next;
        }
        System.out.println("Minimum value node in the list: " + min);
    }

    // maxNode() will find out the minimum value node in the list
    public void maxNode() {
        Node current = head;
        int max;

        if (head == null) {
            System.out.println("List is empty");
        }

        // Initializing min with head node data
        max = head.data;

        while (current != null) {
            // If current node's data is greater than max
            // Then, replace value of max with current node's data
            if (max < current.data)
                max = current.data;

            current = current.next;
        }
        System.out.println("Maximum value node in the list: " + max);
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

        MinMax sList = new MinMax();

        // Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        // Displays the nodes present in the list
        sList.display();

        // Display the minimum value node in the list
        sList.minNode();

        // Display the maximum value node in the list
        sList.maxNode();
    }
}
