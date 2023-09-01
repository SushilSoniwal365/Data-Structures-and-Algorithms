import java.util.Stack;

public class T_04_InOrder_Iterative {

    /* InOrder Traversal:- left->root->right. */
    public static void InOrder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                } else {
                    current = stack.pop();
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        InOrder(root);
    }
}
