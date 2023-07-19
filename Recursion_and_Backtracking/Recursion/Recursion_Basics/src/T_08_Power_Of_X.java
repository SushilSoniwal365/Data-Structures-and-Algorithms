public class T_08_Power_Of_X {

    // Todo:- Return The Power Of a Given Number.
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
