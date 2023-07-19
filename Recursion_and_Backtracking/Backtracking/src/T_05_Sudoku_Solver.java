public class T_05_Sudoku_Solver {

    public void solveSudoku(char[][] board) {

        for(int row=0;row< board.length;row++){
            for(int col=0;col<board[row].length;col++){
                if(board[row][col] == '.'){
                    for(char ch = '1';ch<'10';ch++){
                        if(isValid(board,row,col,ch)){
                            board[row][col]=ch;
                            solveSudoku(board);
                        }
                    }
                }
            }
        }
    }
}
