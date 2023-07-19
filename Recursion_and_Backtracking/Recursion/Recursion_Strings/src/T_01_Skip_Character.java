public class T_01_Skip_Character {

    // Todo:- Remove character 's' from a given string.

    // * Method-01:- By passing an "ans" string in parameters.
    public static String skipChar(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);

        // Don't add in answer string.
        if (ch == 's') {
            return skipChar(str.substring(1), ans);
        }
        // Add in answer string.
        else {
            return skipChar(str.substring(1), ans + ch);
        }
    }

    // * Method-02:- By passing an "ans" string in function body.
    public static String skipChar(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 's') {
            return skipChar(str.substring(1));
        } else {
            return ch + skipChar(str.substring(1));
        }
    }


    public static void main(String[] args) {
        System.out.println(skipChar("sushil", ""));
        System.out.println(skipChar("sushil"));
    }
}
