import java.util.Scanner;

public class T_01_Matrix_Intro {

    // Todo:- 2D Array Declaration & Initialization In Java.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows in your matrix");
        int row_len = in.nextInt();
        System.out.println("Enter the number of columns in your matrix");
        int col_len = in.nextInt();

        int[][] mat = new int[row_len][col_len];

        // * Input The Matrix.
        System.out.println("Enter elements of your matrix:- ");
        for (int row = 0; row < row_len; row++) {
            for (int col = 0; col < col_len; col++) {
                mat[row][col] = in.nextInt();
            }
        }

        // * Output The Matrix.
        System.out.print("Your matrix is:- ");
        for (int row = 0; row < row_len; row++) {
            for (int col = 0; col < col_len; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}