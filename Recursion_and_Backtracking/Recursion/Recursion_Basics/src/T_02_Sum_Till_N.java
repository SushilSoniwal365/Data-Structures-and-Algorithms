public class T_02_Sum_Till_N {

    // Todo:- Print the sum of numbers from 1 till n.
    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        printSum(n - 1, sum + n);
    }

    // Todo:- Return the sum of numbers from 1 till n.
    public static int returnSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + returnSum(n - 1);
    }

    public static void main(String[] args) {
        printSum(5, 0);
        System.out.println(returnSum(5));
    }
}
