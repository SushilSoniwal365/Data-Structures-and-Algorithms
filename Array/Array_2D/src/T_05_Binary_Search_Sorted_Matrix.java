public class T_05_Binary_Search_Sorted_Matrix {

    // ! T.C = O(log(m*n)), S.C = O(1).
    public static boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length;// No. Of Rows.
        int n = mat[0].length;// No. Of Cols In First Row.

        // Two Imaginary Indexes.
        int start = 0; // First Element Of Matrix.
        int end = m * n - 1;// Last Element Of Matrix.

        // While Loop To Traverse Complete Matrix.
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculating Mid-Index.

            int mid_num = mat[mid / n][mid % n]; // Element Present At Mid-Index.

            if (mid_num == target)
                return true;
            else if (mid_num > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(mat, 20));
    }
}