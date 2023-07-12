public class T_03_Linear_Search {

    // ! T.C = O(m*n), S.C = O(1).
    public static boolean Search(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Search(mat1, 18));
    }
}
