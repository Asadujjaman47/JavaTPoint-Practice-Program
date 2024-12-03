package doubly_linked_list.p3.insert_end;

//  Java program to insert a new node at the end of the Doubly Linked List
public class InsertEnd {

    // Represent a node of the doubly linked list
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Represent the head and tail of the doubly linked list
    Node head, tail = null;

    // addAtEnd() will add a node to the end of the list
    public void addAtEnd(int data) {
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
    }

    // display() will print out the nodes of the list
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            // Prints each node by incrementing the pointer

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertEnd dList = new InsertEnd();
        //Adding 1 to the list
        dList.addAtEnd(1);
        dList.display();
        //Adding 2 to the list
        dList.addAtEnd(2);
        dList.display();
        //Adding 3 to the list
        dList.addAtEnd(3);
        dList.display();
        //Adding 4 to the list
        dList.addAtEnd(4);
        dList.display();
        //Adding 5 to the list
        dList.addAtEnd(5);
        dList.display();
    }
}
