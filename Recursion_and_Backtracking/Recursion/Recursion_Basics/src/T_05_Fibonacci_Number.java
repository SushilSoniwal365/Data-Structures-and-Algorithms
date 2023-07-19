public class T_05_Fibonacci_Number {

    // Todo:- Return The N'th Fibonacci Number.
    public static int fibNum(int n) {
        if (n < 2) {
            return n;
        }
        return (fibNum(n - 1) + fibNum(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(fibNum(7));
    }
}
