public class T_02_Skip_String_1 {

    // Todo:- Skip the string that starts with "Brown".

    // * Method-01:- By passing an "ans" string in parameters.
    public static String skipString(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.startsWith("Brown")) {
            return skipString(str.substring(5), ans);
        } else {
            return skipString(str.substring(1), ans + str.charAt(0));
        }
    }

    // * Method-02:- By passing an "ans" string in parameters.
    public static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("Brown")) {
            return skipString(str.substring(5));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipString("That Greedy Brown Fox Is Hungry", ""));
        System.out.println(skipString("That Greedy Brown Fox Is Hungry"));
    }
}
