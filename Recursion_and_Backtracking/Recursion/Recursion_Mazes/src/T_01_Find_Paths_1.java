import java.util.ArrayList;

public class T_01_Find_Paths_1 {

    /**
     * RETURN ALL PATHS TO REACH FROM THE SOURCE(0,0) TO THE TARGET(2,2), WHILE WE CAN ONLY GO
     * RIGHT AND DOWN.
     */

    // Todo:- Return the number of paths to reach the target.
    public static int totalPaths(int row, int col) {

        // Base Case:- We have only one way to go.
        if (row == 2 || col == 2) {
            return 1;
        }

        // To travel down.
        int down = totalPaths(row + 1, col);

        // To travel right.
        int right = totalPaths(row, col + 1);

        // Total paths.
        return down + right;
    }

    // Todo:- Print the exact paths to reach the target.
    public static void printPaths(String ans, int row, int col) {

        // Base Case:- We have only one way to go.
        if (row == 2 && col == 2) {
            System.out.println(ans);
            return;
        }

        // To travel down.
        if (row < 2) {
            printPaths(ans + "D", row + 1, col);
        }

        // To travel right.
        if (col < 2) {
            printPaths(ans + 'R', row, col + 1);
        }
    }

    // Todo:- Return the exact paths to reach the target in an ArrayList.
    public static ArrayList<String> getPaths(String ans, int row, int col) {

        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> local = new ArrayList<>(); // Contains answer for this function call only.

        // To travel down.
        if (row < 2) {
            local.addAll(getPaths(ans + "D", row + 1, col));
        }

        // To travel right.
        if (col < 2) {
            local.addAll(getPaths(ans + 'R', row, col + 1));
        }

        return local;
    }

    public static void main(String[] args) {
        System.out.println(totalPaths(0, 0));
        printPaths("", 0, 0);
        System.out.println(getPaths("", 0, 0));
    }
}
