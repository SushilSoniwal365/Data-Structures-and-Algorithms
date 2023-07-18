public class P_06_String_Substring {

    // * (1) By using substring(int start).
    public static void printSub1(String s) {

        System.out.println(s.substring(4));
    }

    // * (2) By using substring(int start, int end).
    public static void printSub2(String s) {
        System.out.println(s.substring(0, 9));
    }

    public static void main(String[] args) {
        printSub1("SUSHIL SONIWAL");
        printSub2("SUSHIL SONIWAL");
    }

}
