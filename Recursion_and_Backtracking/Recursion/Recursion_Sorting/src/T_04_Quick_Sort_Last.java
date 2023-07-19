import java.util.Arrays;

public class T_04_Quick_Sort_Last {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot_idx = partition(arr, low, high); // Correct index of our pivot.

            // Recursive call for left side of pivot.
            quickSort(arr, low, pivot_idx - 1);

            // Recursive call for right side of pivot.
            quickSort(arr, pivot_idx + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot.
        int i = low - 1; // Initially no element is smaller than pivot.

        // Compare all the elements with pivot.
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swapping element at i with element at j
                swap(arr, i, j);
            }
        }
        // Swap the pivot element with the greater element specified by i
        i++;
        swap(arr, i, high);
        return i; // Correct index of pivot.
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
