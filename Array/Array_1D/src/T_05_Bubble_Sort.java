import java.util.Arrays;

public class T_05_Bubble_Sort {

    /**
     * ? Algo:- Repeatedly Swap Two Adjacent Elements If They Are In Wrong Order
     * ! Time Complexity:- O(N^2).
     * * Space Complexity:- O(1).
     * ? Stable:- Yes.
     */

    // Todo:- Method To Implement Bubble Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Outer Loop For No. Of Passes.
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            // Inner Loop For Comparison & Swapping.
            for (int j = 0; j < n - i - 1; j++) {
                // Check For Wrong Order.
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break; // Array Is Sorted, No Need To Check Again.
        }
    }

    // Todo:- Method To Swap Two Numbers In An Array.
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}