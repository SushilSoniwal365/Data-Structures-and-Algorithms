public class P_01_Create_BST {

    // * Recursive Method To Create BST From Given Inorder.
    public static Node createBST(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = createBST(root.left, key);
        } else {
            root.right = createBST(root.right, key);
        }
        return root;
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
        int[] preorder = {8, 5, 1, 7, 10, 12};
        Node root = null;
        for (int j : preorder) {
            root = createBST(root, j);
        }
        inorder(root);
    }
}
