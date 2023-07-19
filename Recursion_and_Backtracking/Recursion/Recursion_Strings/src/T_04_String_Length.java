public class T_04_String_Length {

    // Todo:- Calculate the length of a given string using recursion.
    public static int strLen(String str, int len) {
        if (str.isEmpty()) {
            return len;
        }
        return strLen(str.substring(1), ++len);
    }

    public static void main(String[] args) {
        System.out.println(strLen("sushil soniwal", 0));
    }
}
