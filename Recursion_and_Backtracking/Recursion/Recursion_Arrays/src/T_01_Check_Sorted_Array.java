public class T_01_Check_Sorted_Array {

    // Todo:- Check Whether An Array Is Sorted Or Not.
    public static boolean isSortedArray(int[] arr) {
        return helper(arr, 0, 1);
    }

    private static boolean helper(int[] arr, int i, int j) {
        if (j == arr.length) {
            return true;
        }
        if (arr[i] < arr[j]) {
            return helper(arr, ++i, ++j);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 6, 7};
        System.out.println(isSortedArray(nums));
    }
}
