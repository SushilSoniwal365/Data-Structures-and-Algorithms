public class T_10_Count_Zeros {

    // Todo:- Return The Number Of 0's In A Given Number.
    public static int countZeros(int num, int count) {
        int rem = num % 10;
        if (num == 0) {
            return count;
        }
        if (rem == 0) {
            return countZeros(num / 10, ++count);
        }
        return countZeros(num / 10, count);
    }

    public static void main(String[] args) {
        System.out.println(countZeros(10020, 0));
    }
}
