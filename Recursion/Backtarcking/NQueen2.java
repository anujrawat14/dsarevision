public class H {

    static void NQueen(boolean[][] board, int row) {

        // All queens placed
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try every column in current row
        for (int col = 0; col < board[0].length; col++) {

            if (isSafe(board, row, col)) {

                // Place queen
                board[row][col] = true;

                // Move to next row
                NQueen(board, row + 1);

                // Backtracking
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // Same column
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col]) {
                return false;
            }
        }

        // Upper-left diagonal
        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {

            if (board[r][c]) {
                return false;
            }

            r--;
            c--;
        }

        // Upper-right diagonal
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

        NQueen(board, 0);
    }
}
