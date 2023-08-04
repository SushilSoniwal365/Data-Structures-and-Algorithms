import java.util.LinkedList;
import java.util.Queue;

public class P_01_Inbuilt_Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(22);
        queue.add(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
