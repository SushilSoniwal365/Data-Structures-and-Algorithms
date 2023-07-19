public class T_03_Skip_String_2 {

    // Todo:- Skip a string that starts with "Bro" but not with "Brown" from a given string.

    // * Method-01:- By passing an "ans" string in parameters.
    public static String skipString(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }

        if (str.startsWith("Bro") && !(str.startsWith("Brown"))) {
            return skipString(str.substring(3), ans);
        } else {
            return skipString(str.substring(1), ans + str.charAt(0));
        }
    }

    // * Method-02:- By passing an "ans" string in parameters.
    public static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("Bro") && !(str.startsWith("Brown"))) {
            return skipString(str.substring(3));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "The Lazy And Week Brown Fox Is My Bro.";
        System.out.println(skipString(str, ""));
        System.out.println(skipString(str));
    }
}
