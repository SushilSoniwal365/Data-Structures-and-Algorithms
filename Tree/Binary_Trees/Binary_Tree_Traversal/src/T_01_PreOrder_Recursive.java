public class T_01_PreOrder_Recursive {

    /* PreOrder Traversal:- root->left->right. */
    public static void PreOrder(Node node) {
        if (node==null) {
            return;
        }
        System.out.print(node.data + " ");
        PreOrder(node.left);
        PreOrder(node.right);
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
