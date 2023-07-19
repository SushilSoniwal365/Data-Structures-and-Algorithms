public class T_09_Reverse_Number {

    // Todo:- Print the reverse of a given number.
    public static void reverseNumber(int num, int rev_num) {
        int rem = num % 10;
        if (num == 0) {
            System.out.println(rev_num);
            return;
        }
        rev_num = rev_num * 10 + rem;
        reverseNumber(num / 10, rev_num);
    }

    public static void main(String[] args) {
        reverseNumber(70159, 0);
    }
}
