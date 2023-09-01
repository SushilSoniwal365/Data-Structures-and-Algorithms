import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T_08_Zig_Zag_Traversal {

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result; // Return an empty list if the tree is empty.
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // Add the root node to the queue.
        boolean isLeftToRight = true; // To track the zigzag direction

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level.
            List<Integer> currentLevel = new ArrayList<>();

            // Process all nodes at the current level.
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll(); // Remove the current node from the queue.

                if (isLeftToRight) {
                    currentLevel.add(currentNode.data);
                } else {
                    currentLevel.add(0, currentNode.data);
                }

                // Add the child nodes to the queue for processing in the next level.
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevel);
            isLeftToRight = !isLeftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree for testing.
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        // Get the level order traversal of the binary tree.
        List<List<Integer>> result = zigzagLevelOrder(root);

        // Print the result.
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }

}
