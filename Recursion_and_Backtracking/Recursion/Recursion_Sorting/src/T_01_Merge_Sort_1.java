import java.util.Arrays;

public class T_01_Merge_Sort_1 {

    /**
     * Merge Sort:- Divide array into two halves, Sort Both & Merge Them.
     * T.C:- O(n*log(n)).
     * S.C:- O(n).
     */
    // Todo:- Method for merge sort.
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    // Todo:- Method to merge arrays.
    public static int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k++] = first[i++];
            } else {
                res[k++] = second[j++];
            }
        }

        while (i < first.length) {
            res[k++] = first[i++];
        }

        while (j < second.length) {
            res[k++] = second[j++];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 45, 12, 67, 34, 15};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
