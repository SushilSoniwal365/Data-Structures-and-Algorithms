public class T_07_Factorial {

    // Todo:- The Factorial Of A Given Number.
    public static int getFactorial(int n) {
        if (n <= 1)
            return 1;
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
