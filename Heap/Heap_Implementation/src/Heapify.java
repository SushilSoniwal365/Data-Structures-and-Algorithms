public class Heapify {

    /* Method To Create A Max-Heap. */
    public static void Max_Heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Max_Heapify(arr, n, largest);
        }
    }

    /* Method To Create A Min-Heap. */
    public static void Min_Heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[smallest] > arr[left]) {
            smallest = left;
        }
        if (right < n && arr[smallest] > arr[right]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            Min_Heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,11,5,0,1,4,2};

        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            Max_Heapify(arr, arr.length, i);
        }

        System.out.println("MaxHeap Is:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            Min_Heapify(arr, arr.length, i);
        }

        System.out.println("MinHeap Is:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
