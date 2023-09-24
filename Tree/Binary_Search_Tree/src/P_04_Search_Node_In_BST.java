public class P_04_Search_Node_In_BST {

    /* * Search for a node in bst. */
    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (root.data > target) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(13);
        root.right = new Node(20);
        root.left.left = new Node(12);
        root.left.right = new Node(14);
        root.right.left = new Node(18);
        root.right.right = new Node(22);
        root.left.left.left = new Node(10);
        root.right.right.left = new Node(21);
        root.right.right.right = new Node(23);
        root.left.left.left.left = new Node(9);
        root.left.left.left.right = new Node(11);

        System.out.println(search(root, 21));
    }
}
