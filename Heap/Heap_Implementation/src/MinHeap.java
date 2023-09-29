public class MinHeap {

    int[] arr;
    int size;

    MinHeap(int capacity) {
        size = 0;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == arr.length);
    }

    /* Function To Insert An Element In Heap.
     * T.C Best Case:- O(1), Worst Case:- O(logn).
     */
    public void insert(int val) {
        if (isFull()) {
            System.out.println("Heap Is Full Already");
            return;
        }
        int index = size;
        arr[index] = val;
        size = size + 1;

        while (index > 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] > arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            } else {
                return;
            }
        }
    }

    /* Function To Delete An Element From Heap. */
    public void delete() {
        if (isEmpty()) {
            System.out.println("Heap Is Empty Already");
            return;
        }

        /* Last Element At Root. */
        arr[0] = arr[size - 1];
        size--;

        int i = 0;
        while (i < size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIndex = i;

            if (left < size && arr[left] < arr[minIndex]) {
                minIndex = left;
            }

            if (right < size && arr[right] < arr[minIndex]) {
                minIndex = right;
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                i = minIndex;
            } else {
                return;
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(15);
        heap.insert(30);
        heap.insert(40);
        heap.insert(10);
        heap.insert(20);
        heap.insert(70);
        heap.insert(60);

        heap.print();

        heap.delete();
        System.out.println("After Deleting An Element:- ");
        heap.print();
    }
}
