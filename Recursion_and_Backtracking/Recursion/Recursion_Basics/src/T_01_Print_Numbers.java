public class T_01_Print_Numbers {

    // Todo:- Print numbers from 1 to n.
    public static void printNums1(int n) {
        if (n == 0) {
            return;
        }
        printNums1(n - 1);
        System.out.println(n);
    }

    // Todo:- Print numbers from n to 1.
    public static void printNums2(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNums2(n - 1);

        // * T.C = O(n) & S.C = O(n).
    }

    public static void main(String[] args) {
        printNums1(5);
        printNums2(5);
    }
}
