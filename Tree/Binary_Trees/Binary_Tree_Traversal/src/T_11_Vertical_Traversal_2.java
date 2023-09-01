import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class T_11_Vertical_Traversal_2 {

    static class Items {
        Node node;
        int row;
        int col;

        public Items(Node node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        // * Initialize a queue for level-order traversal.
        Queue<Items> queue = new LinkedList<>();

        // * Create a TreeMap to store nodes by their column and row positions.
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // * Start with the root node at (0, 0).
        queue.offer(new Items(root, 0, 0));

        // * Perform a level-order traversal of the tree.
        while (!queue.isEmpty()) {
            Items item = queue.poll();
            Node node = item.node;
            int x = item.row;
            int y = item.col;

            // * If this is the first node encountered at this column, create the treemap.
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            // * Add the node's value to the corresponding column and row.
            map.get(x).get(y).offer(node.data);

            // * Enqueue the left child with adjusted positions.
            if (node.left != null) {
                queue.offer(new Items(node.left, x - 1, y + 1));
            }
            // * Enqueue the right child with adjusted positions.
            if (node.right != null) {
                queue.offer(new Items(node.right, x + 1, y + 1));
            }
        }

        // * Prepare the final result list.
        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> colMap : map.values()) {
            result.add(new ArrayList<>());
            for (PriorityQueue<Integer> rowMap : colMap.values()) {
                while (!rowMap.isEmpty()) {
                    result.get(result.size() - 1).add(rowMap.poll());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> verticalTraversalResult = verticalTraversal(root);
        System.out.println(verticalTraversalResult);
    }
}
