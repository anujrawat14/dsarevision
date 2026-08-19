public class testiy {

    static void sudokuSolver(int[][] board, int row, int col) {

        if (row == board.length) {
            display(board);
            return;
        }
        if (col == board[0].length) {
            sudokuSolver(board, row + 1, 0);
            return;
        }
        if (board[row][col] != 0) {
            sudokuSolver(board, row, col + 1);
            return;
        }

        // now we have an empty cell

        // pick a digit from 1 to 9
        for (int digit = 1; digit < 10; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                sudokuSolver(board, row, col + 1);
                board[row][col] = 0;
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int digit) {

        // check col if the digit exist there
        for (int c = 0; c < board[0].length; c++) {
            if (board[row][c] == digit) {
                return false;
            }
        }
        // check row if the digit exist there
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == digit) {
                return false;
            }
        }

        // check 3x3
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int idx = 0; idx < board[0].length; idx++) {
                System.out.print(board[i][idx] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        sudokuSolver(board, 0, 0);
    }
}
