package doubly_linked_list.p8.search_element;

// Java program to search an element in a doubly linked list
public class SearchList {

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
    }

    // searchNode() will search a given node in the list
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;
        // Node current will point to head
        Node current = head;

        // Check whether the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            // Compare value to be searched with each node in the list
            if (current.data == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(flag)
            System.out.println("Node is present in the list at the position: " + i);
        else
            System.out.println("Node is not present in the list");
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

        SearchList dList = new SearchList();
        // Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        // Display the nodes present in the list
        dList.display();

        //Search for node 4 in the list
        dList.searchNode(4);
        //Search for node 9 in the list
        dList.searchNode(9);
    }
}
