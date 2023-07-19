public class T_05_Rotated_Binary_Search {

    // Todo:- Rotated Binary Search Using Recursion.
    public static int RBS(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid_idx = start + (end - start) / 2;
        if (arr[mid_idx] == target) {
            return mid_idx;
        }
        else if (arr[start] <= arr[mid_idx]) {
            if (target >= arr[start] && target < arr[mid_idx]) {
                return RBS(arr, start, mid_idx - 1, target);
            }
            return RBS(arr, mid_idx + 1, end, target);
        }
        else {
            if (target > arr[mid_idx] && target <= arr[end]) {
                return RBS(arr, mid_idx + 1, end, target);
            }
            return RBS(arr, start, mid_idx - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(RBS(arr, 0, arr.length - 1, 2));
    }
}
