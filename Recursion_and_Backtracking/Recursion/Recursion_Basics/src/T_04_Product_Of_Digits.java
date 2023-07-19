public class T_04_Product_Of_Digits {

    // Todo:- Return the product of all the digits of a number.
    public static int digitProduct(int num) {
        int rem = num % 10;
        if (rem == num) {
            return num;
        }
        return rem * digitProduct(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitProduct(54321));
    }
}
