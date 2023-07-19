import java.util.Arrays;

public class T_03_Quick_Sort_Middle {

    /**
     * Quick Sort:- Sort An Array By Partition.
     * T.C:- O(n*log(n)).
     * S.C:- O(n).
     */

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start_idx = low, end_idx = high;
        int mid_idx = start_idx + (end_idx - start_idx) / 2;
        int pivot = arr[mid_idx];

        while (start_idx <= end_idx) {

            while (arr[start_idx] < pivot) {
                start_idx++;
            }

            while (arr[end_idx] > pivot) {
                end_idx--;
            }

            if (start_idx <= end_idx) {
                int temp = arr[start_idx];
                arr[start_idx] = arr[end_idx];
                arr[end_idx] = temp;
                start_idx++;
                end_idx--;
            }
        }

        quickSort(arr, low, end_idx);
        quickSort(arr, start_idx, high);
    }

    public static void main(String[] args) {
        int[] arr = {34, 11, 12, 45, 67, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
