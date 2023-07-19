import java.util.Arrays;

public class T_05_Quick_Sort_First {

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
        int pivot = arr[low];
        int i = low;

        // Compare all the elements with pivot.
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swapping element at i with element at j
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i; // Correct index of pivot.
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
