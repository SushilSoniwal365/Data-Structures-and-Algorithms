import java.util.Stack;

public class T_02_PreOrder_Iterative {

    /* PreOrder Traversal:- root->left->right. */
    public static void PreOrder(Node root) {

        // Check if the tree is empty.
        if (root == null) {
            return;
        }

        // Create an empty stack and push the root node in it.
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        // Loop till stack is empty.
        while (!stack.isEmpty()) {

            // Pop the node from the stack and print it.
            Node current = stack.pop();
            System.out.print(current.data + " ");

            // Push the right child of the popped node into the stack.
            if (current.right != null) {
                stack.push(current.right);
            }

            // Push the left child of the popped node into the stack.
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreOrder(root);
    }
}
