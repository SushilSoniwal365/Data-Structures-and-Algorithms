public class P_02_Queue_Using_Array {

    static class MyQueue {
        static int[] arr;
        static int size;
        static int rear;

        public MyQueue(int size) {
            arr = new int[size];
            this.size = size;
            rear = -1;
        }

        // ! IsEmpty => Queue is empty or not.
        public static boolean isEmpty() {
            return (rear == -1);
        }

        // ! Enqueue => Insert Elements.
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // ! Dequeue => Remove Elements.
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Already Empty");
                return -1;
            }
            int front = arr[0];
            for (int idx = 0; idx < rear; idx++) {
                arr[idx] = arr[idx + 1];
            }
            rear--;
            return front;
        }

        // ! Peek => Return The Element Present At Top.
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue Is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(33);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
