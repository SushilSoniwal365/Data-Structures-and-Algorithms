import java.util.ArrayList;

public class T_01_Possible_Permutation {

    // Todo:- Print all the possible permutations of a given string.

    // * Method-01:- Print all permutations.
    public static void printPermutations(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        // At every recursive level we have total (ans.length()+1) recursive calls.
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i);
            printPermutations(first + ch + second, str.substring(1));
        }
    }

    // * Method-02:- Return all permutations in an arraylist.
    public static ArrayList<String> returnPermutations(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> local = new ArrayList<>();
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i);
            local.addAll(returnPermutations(first + ch + second, str.substring(1)));
        }
        return local;
    }

    public static void main(String[] args) {
        printPermutations("", "ABC");
        System.out.println(returnPermutations("", "ABC"));
    }
}
