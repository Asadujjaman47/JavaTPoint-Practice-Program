package doubly_linked_list.p11.insert_beginning;

// Program to insert a new node at the beginning of the doubly linked list.
public class InsertStart {

    // Represent a node of the doubly linked list
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    int size = 0;
    // Represent the head and tail of the doubly linked list
    Node head, tail = null;

    // addNode() will add a node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // nextNode's previous will point to tail
            newNode.previous = tail;
            // newNode will become new tail
            tail = newNode;
            // As it is last node, tail's next will point to null
            tail.next = null;
        }
        // Size will count the number of nodes present in the list
        size++;
    }

    // addAtStart() wil add a node to the starting of the list
    public void addAtStart(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            // Both head and tail wail point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        // Add newNode as new head of the list
        else {
            // head's previous node will be newNode
            head.previous = newNode;
            // newNode's next node will be head;
            newNode.next = head;
            // newNode's previous will point to null
            newNode.previous = null;
            // newNode will become new head
            head = newNode;
        }
    }

    // display() will print out the nodes of the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Adding a node to the start of the list: ");
        while (current != null) {
            // Prints each node by incrementing the pointer

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertStart dList = new InsertStart();

        //Adding 1 to the list
        dList.addAtStart(1);
        dList.display();
        //Adding 2 to the list
        dList.addAtStart(2);
        dList.display();
        //Adding 3 to the list
        dList.addAtStart(3);
        dList.display();
        //Adding 4 to the list
        dList.addAtStart(4);
        dList.display();
        //Adding 5 to the list
        dList.addAtStart(5);
        dList.display();

    }
}
