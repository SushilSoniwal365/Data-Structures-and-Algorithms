public class T_05_Check_Palindrome_String {

    // Todo:- Check Whether A Given String Is Palindrome Or Not.

    public static boolean isStringPalindrome(String str) {
        return helper(str, 0, str.length() - 1);
    }

    private static boolean helper(String str, int left, int right) {
        if (left > right) {
            return true;
        }
        if (str.charAt(left) == str.charAt(right)) {
            return helper(str, ++left, --right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("racaecar"));
    }
}
