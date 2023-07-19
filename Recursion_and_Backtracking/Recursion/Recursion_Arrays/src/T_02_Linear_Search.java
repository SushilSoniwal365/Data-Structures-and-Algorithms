public class T_02_Linear_Search {

    // Todo:- Recursive Linear Search.
    public static int search(int[] arr, int target) {
        return helper(arr, 0, target);
    }

    private static int helper(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return helper(arr, ++idx, target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 1, 5, 8, 4, 0};
        System.out.println(search(nums, 0));
    }
}
