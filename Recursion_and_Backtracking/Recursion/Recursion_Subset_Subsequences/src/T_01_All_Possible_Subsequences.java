import java.util.ArrayList;

public class T_01_All_Possible_Subsequences {

    // * Method-01:- Passing "ans" string in arguments.
    public static void printSubSeq1(String str, String ans) {
        // Base Case.
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        printSubSeq1(str.substring(1), ans + ch); // Taking Element.
        printSubSeq1(str.substring(1), ans); // Ignoring Element.
    }

    // Method-02:- Return All Subsequences In An ArrayList.
    public static ArrayList<String> printSubSeq2(String str, String ans) {

        // Base Case.
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> first = printSubSeq2(str.substring(1), ans + ch); // Taking The Element.
        ArrayList<String> second = printSubSeq2(str.substring(1), ans); // Ignoring The Element.

        // Add All The Answers In One List.
        first.addAll(second);

        // Returning The List Which Contains All The Answers.
        return first;
    }

    public static void main(String[] args) {
        printSubSeq1("ABC", "");
        System.out.println(printSubSeq2("ABC", ""));
    }
}
