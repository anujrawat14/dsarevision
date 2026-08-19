public class testy {

    static int Knight(boolean[][] board, int row, int col, int target) {

        if (target == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        if (row == board.length) {
            return 0;
        }

        if (col == board[0].length) {
            return Knight(board, row + 1, 0, target);
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count = count + Knight(board, row, col + 1, target - 1);
            board[row][col] = false;
        }
        // dont place knight at current position
        count += Knight(board, row, col + 1, target);

        return count;
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

        // moves main sa har ek array ko nikalunga or usko row,col ka sath add krunga
        for (int[] move : moves) {
            int r = row + move[0];
            int c = col + move[1];

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
        int count = Knight(board, 0, 0, 2);
        System.out.println(count);
    }

}
