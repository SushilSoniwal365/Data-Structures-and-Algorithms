public class T_03_Sum_Of_Digits {

    // Todo:- Return the sum of all the digits of a number.
    public static int digitSum(int num) {
        int rem = num % 10;
        if (rem == num) {
            return num;
        }
        return rem + digitSum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(54321));
    }
}
