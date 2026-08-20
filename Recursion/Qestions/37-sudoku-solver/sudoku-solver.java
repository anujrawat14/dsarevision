class Solution {
    public void solveSudoku(char[][] board) {
         helper(board, 0, 0);
    }

    boolean isSafe(char[][] board, int row, int col, char digit) {

        //row wise

        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == digit) {
                return false;
            }
        }

        //col wise

        for (int c = 0; c < board[0].length; c++) {
            if (board[row][c] == digit) {
                return false;
            }
        }

        //3*3 matrix
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    void display(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean helper(char[][] board, int row, int col) {
        //base condition
        if (row == board.length) {
            return true;
        }

        if (col == board[0].length) {
            return helper(board, row + 1, 0);

        }

        if (board[row][col] != '.') {
            return helper(board, row, col + 1);
        }

        if (board[row][col] == '.') {

             for (char digit = '1'; digit <= '9'; digit++) {

                if (isSafe(board, row, col, digit)) {

                    board[row][col] = digit;

                    if(helper(board, row, col + 1)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }
}