public class P_01_Basic_Construction {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(5);
        root.right = new Node(7);
        root.left.left = new Node(11);
        root.left.right = new Node(22);
        root.right.left = new Node(25);

        System.out.println(root.left.right.data);
    }
}
