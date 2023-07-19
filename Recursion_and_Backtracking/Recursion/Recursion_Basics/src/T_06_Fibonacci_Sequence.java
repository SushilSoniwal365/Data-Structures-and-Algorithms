public class T_06_Fibonacci_Sequence {

    // Todo:- Print the fibonacci sequence till n.
    public static void fibSequence(int n) {
        helper(n, 0, 1);
    }

    private static void helper(int n, int a, int b) {
        if (n < 0) {
            return;
        }
        System.out.print(a + " ");
        helper(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        fibSequence(7);
    }
}
