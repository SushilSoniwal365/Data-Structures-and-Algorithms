public class P_03_Delete_Node_In_BST {

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        } else if (root.data > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = minValue(root.right);
                root.right = deleteNode(root.right, root.data);
            }
        }
        return root;
    }

    private static int minValue(Node node) {
        int min_val = node.data;
        while (node.left != null) {
            min_val = node.left.data;
            node = node.left;
        }
        return min_val;
    }

    /* * Inorder Traversal. */
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);
        System.out.println("Before Deleting Any Node From BST :- ");
        inorder(root);

        System.out.println();

        System.out.println("After Deleting 15 From BST :- ");
        deleteNode(root, 3);
        inorder(root);
    }
}
