package singly_linked_list.p13.swap_first_last;

// Program to swap the last element of the singly linked list from the first one
public class Swap {
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

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if(head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null)
                current = current.next;

            // newNode will be added after last node of the list
            current.next = newNode;
        }
    }

    // swapLastWithFirst() will swap head node with the last node of the list
    public void swapLastWithFirst() {
        Node current = head, temp = null, index = null;

        // If list is empty, then display the list as it is
        if (head == null)
            return;

        // After the loop, current will point to last element and index will point to second last element
        while (current.next != null) {
            index = current;
            current = current.next;
        }

        // If list contains only one node, then display list as it is
        if (head == current)
            return;

        // If list contains only two nodes, then swap the head node with current node
        else if (head.next == current) {
            temp = head;
            // head will point to last node i.e current
            head = current;
            // node next to new head will be the last node
            head.next = temp;
            // Node next to last element will be null
            temp.next = null;
        }
        else {
            temp = head;
            // head will point to last node i.e current
            head = current;

            // Detach the list from previous head and add it after new head
            head.next = temp.next;

            // Previous head will become last node of the list
            index.next = temp;

            // Node next to last element will be null
            temp.next = null;
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

        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Swap sList = new Swap();

        // Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        System.out.println("Originals list: ");
        sList.display();

        // Swaps Last node with first node
        sList.swapLastWithFirst();

        System.out.println("List after swapping the first node with last: ");
        sList.display();
    }
}
