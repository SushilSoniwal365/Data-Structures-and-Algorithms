public class T_01_Find_All_Paths {

    // Todo:- PRINT THE PATHS THAT WE CAN FOLLOW TO REACH THE TARGET, WE CAN MOVE UP-DOWN-RIGHT-LEFT.
    public static void printPaths(String ans, boolean[][] maze, int row, int col) {

        // Base Case.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        // Obstacle Case.
        if (!maze[row][col]) {
            return;
        }

        // * Considering A Cell In Our Path.
        maze[row][col] = false;

        // To Travel Down.
        if (row < maze.length - 1) {
            printPaths(ans + "D", maze, row + 1, col);
        }

        // To Travel Right.
        if (col < maze[0].length - 1) {
            printPaths(ans + "R", maze, row, col + 1);
        }

        // To Travel Up.
        if (row > 0) {
            printPaths(ans + "U", maze, row - 1, col);
        }

        // To Travel Left.
        if (col > 0) {
            printPaths(ans + "L", maze, row, col - 1);
        }

        // * BackTrack:- Remove The Changes That We Were Made Previously.
        maze[row][col] = true;
    }

    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
        printPaths("", maze, 0, 0);
    }
}
