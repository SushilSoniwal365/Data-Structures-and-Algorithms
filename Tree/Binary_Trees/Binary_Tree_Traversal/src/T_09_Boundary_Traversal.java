import java.util.ArrayList;

public class T_09_Boundary_Traversal {


    public static ArrayList<Integer> boundary(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return ans;
        }

        ans.add(root.data);

        // Add left boundary.
        leftBoundary(root.left, ans);

        // Add leaf nodes.
        leafTraversal(root, ans);

        // Add right boundary.
        rightBoundary(root.right, ans);

        return ans;
    }

    // Function to add nodes to the left boundary
    private static void leftBoundary(Node root, ArrayList<Integer> ans) {
        if ((root == null) || (root.left == null && root.right == null)) {
            return;
        }
        ans.add(root.data);
        if (root.left != null) {
            leftBoundary(root.left, ans);
        } else {
            leftBoundary(root.right, ans);
        }
    }

    // Function to add leaf nodes to the result
    private static void leafTraversal(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }

        leafTraversal(root.left, ans);
        leafTraversal(root.right, ans);
    }

    // Function to add nodes to the right boundary
    private static void rightBoundary(Node root, ArrayList<Integer> ans) {
        if ((root == null) || (root.left == null && root.right == null)) {
            return;
        }

        if (root.right != null) {
            rightBoundary(root.right, ans);
        } else {
            rightBoundary(root.left, ans);
        }
        ans.add(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        System.out.println(boundary(root));
    }
}
