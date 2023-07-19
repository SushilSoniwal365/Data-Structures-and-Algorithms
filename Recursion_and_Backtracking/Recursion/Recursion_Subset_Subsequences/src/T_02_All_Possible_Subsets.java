public class T_02_All_Possible_Subsets {

    public static void subsets(int[] arr, int start, int end) {
        if (end == arr.length) {
            return;
        }
        if (start > end) {
            subsets(arr, 0, ++end);
        } else {
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[end] + " ");
            subsets(arr, ++start, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsets(arr, 0, 0);
    }
}
