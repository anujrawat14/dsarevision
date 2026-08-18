public class H {

    static void NQueen(boolean[][] board, boolean[][] matrix,
                       int row, int col) {

        // all queens placed every row is reached
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // try every column
        for (int i = 0; i < matrix[0].length; i++) {

            // check current position
            if (isSafe(board, row, i)) {

                // place queen
                board[row][i] = true;

                // move to next row
                NQueen(board, matrix, row + 1, i);

                // backtracking
                board[row][i] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        // upper-left diagonal
        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {

            if (board[r][c]) {
                return false;
            }

            r--;
            c--;
        }

        // upper-right diagonal
        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < board[0].length) {

            if (board[r][c]) {
                return false;
            }

            r--;
            c++;
        }

        return true;
    }

    static void printBoard(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];
        boolean[][] matrix = new boolean[n][n];

        NQueen(board, matrix, 0, 0);
    }
}
