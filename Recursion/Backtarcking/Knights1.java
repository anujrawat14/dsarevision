public class testy {

    static void Knight(boolean[][] board, int row, int col, int target) {

        if (target == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board[0].length) {
            Knight(board, row + 1, 0, target);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Knight(board, row, col + 1, target - 1);
            board[row][col] = false;
        }
        Knight(board, row, col + 1, target);
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] moves = {
                { 1, 2 }, { -1, 2 },
                { -1, -2 }, { 1, -2 },
                { 2, 1 }, { -2, 1 },
                { -2, -1 }, { 2, -1 },
        };

        int r = row;
        int c = col;

        // moves main sa har ek array ko nikalunga or usko row,col ka sath add krunga
        for (int[] move : moves) {
            r += move[0];
            c += move[1];
            if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
                if (board[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // boolean board[][] = { { false, false, false, false }, { false, false, false,
        // false },
        // { false, false, false, false }, { false, false, false, false } };
        boolean board[][] = { { false, false }, { false, false }, };
        Knight(board, 0, 0, 2);
    }

}
