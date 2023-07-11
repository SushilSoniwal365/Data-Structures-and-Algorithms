import java.util.Arrays;

public class T_07_Insertion_Sort {

    /**
     * ? Algo:- Pick An Element From Unsorted Array, Place It At Its Right Position
     * and Shift The Elements Accordingly.
     * ! Time Complexity:- O(N^2).
     * * Space Complexity:- O(1).
     * ? Stable:- Yes.
     */

    // Todo:- Method To Implement Insertion Sort.
    public static void sort(int[] arr) {
        int n = arr.length;

        // Loop from 1 to n.
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int j = i - 1;

            // Shift elements towards right if they are in wrong order.
            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 8, 0, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}