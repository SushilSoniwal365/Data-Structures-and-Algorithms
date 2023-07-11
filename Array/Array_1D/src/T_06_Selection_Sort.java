import java.util.Arrays;

public class T_06_Selection_Sort {

    /**
     * ? Algo:- Find The Minimum Element From Unsorted Array & Place It At The
     * Beginning Of The Unsorted Array.
     * ! Time Complexity:- O(N^2).
     * * Space Complexity:- O(1).
     * ? Stable:- No.
     */

    // Todo:- Method To Implement Selection Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Loop Through the Array From 0 To n-1.
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array.
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the minimum with first element of the unsorted array.
            swap(arr, min_idx, i);
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 8, 0, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}