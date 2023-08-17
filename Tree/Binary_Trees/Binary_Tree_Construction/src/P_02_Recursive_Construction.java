import java.util.Scanner;

public class P_02_Recursive_Construction {

    static Scanner sc = null;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method to create a tree.
    static Node createTree() {
        System.out.print("Enter Data:- ");
        int value = sc.nextInt();

        if (value == -1) return null;

        Node root = new Node(value);

        System.out.println("Enter left for " + value);
        root.left = createTree(); // Recursive Call For Left.

        System.out.println("Enter right for " + value);
        root.right = createTree(); // Recursive Call For Right.

        return root;

    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

        if (root == null) {
            System.out.println("Tree Is Empty");
        } else {
            System.out.println("The root node's data is: " + root.data);
        }
    }
}
