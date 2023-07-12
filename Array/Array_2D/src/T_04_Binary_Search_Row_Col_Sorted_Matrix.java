public class T_04_Binary_Search_Row_Col_Sorted_Matrix {

    /**
     * 1. We start from the top right corner of the matrix.
     * 2. If the target is greater than the value in the current position, then the
     * target cannot be in the current row. Why? Because the row is sorted and if the
     * target is greater than the current element, then all the elements to the
     * right of the current element are also greater than the current element.
     * 3. If the target is less than the value in the current position, then the
     * target cannot be in the current column. Why? Because the column is sorted and
     * if the target is less than the current element, then all the elements below
     * the current element are also less than the current element.
     * 4. If the target is equal to the value in the current position, then return
     * true.
     * 5. Repeat the above steps until you either find the target or search all the
     * elements in the matrix.
     */

    // ! T.C = O(m+n). S.C = O(1).
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 50}
        };

        System.out.println(searchMatrix(mat, 35));
    }
}
