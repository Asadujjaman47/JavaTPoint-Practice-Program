package tree.p10.smallest_element;

// Java program to find the smallest element in a tree
public class SmallestNode {

    // Represent a node of the Binary Search Tree
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            // Assign data to the new node, set left and right child to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Represent the root of binary tree
    public Node root;

    public SmallestNode() {
        root = null;
    }

    // smallestElement() will find out the smallest node in the binary tree
    public int smallestElement(Node temp) {
        // Check whether tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            int leftMin, rightMin;
            // Min will store temp's data
            int min = temp.data;

            // It will find smallest element in left subtree
            if (temp.left != null) {
                leftMin = smallestElement(temp.left);
                // Compare min with leftMin and store the value of leftMin into min
                min = Math.min(min, leftMin);
            }

            // It will find smallest element in right subtree
            if (temp.right != null) {
                rightMin = smallestElement(temp.right);
                // Compare min with rightMin and store the value of rightMin into min
                min = Math.min(min, rightMin);
            }
            return min;
        }
    }

    public static void main(String[] args) {

        SmallestNode bt = new SmallestNode();
        //Add nodes to the binary tree
        bt.root = new Node(4);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(1);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);

        //Display the smallest node in the binary tree
        System.out.println("Smallest element in the binary tree: " + bt.smallestElement(bt.root));
    }
}
