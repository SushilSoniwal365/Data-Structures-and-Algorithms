public class T_02_Matrix_Traversal {

    // Todo:- Traversal in a N*N matrix.
    public static void traversal1(int[][] mat) {
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.println("Element at (" + row + "," + col + ") is = " + mat[row][col]);
            }
        }
    }

    // Todo:- Traversal in a M*N matrix.
    public static void traversal2(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.println("Element at (" + row + "," + col + ") is = " + mat[row][col]);
            }
        }
    }

    // Todo:- Traversal in a matrix having a variable Number Of Columns..
    public static void traversal3(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.println("Element at (" + row + "," + col + ") is = " + mat[row][col]);
            }
        }
    }

    public static void main(String[] args) {

        // N * N Matrix => Number Of Rows == Number Of Columns.
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        traversal1(mat1);

        // M * N Matrix => Number Of Rows != Number Of Columns.
        int[][] mat2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}};
        traversal2(mat2);

        // Column Not Fixed.
        int[][] mat3 = {{1, 2, 3}, {4}, {5, 6, 7, 8}};
        traversal3(mat3);
    }
}
