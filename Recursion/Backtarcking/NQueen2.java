public class text1 {

    static int Nqueen(boolean matrix[][], int row) {

        // base condition
        if (row == matrix.length) {
            display(matrix);
            System.out.println();
            return 1;
        }

        int count = 0;

        // go to each column
        for (int col = 0; col < matrix[0].length; col++) {

            // check before placing
            if (isSafe(matrix, row, col)) {

                matrix[row][col] = true; // place

                count += Nqueen(matrix, row + 1); // move

                matrix[row][col] = false; // unplace / backtrack
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] matrix, int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {

            if (matrix[i][col]) {
                return false;
            }
        }

        // upper-right diagonal
        int i = row - 1;
        int j = col + 1;

        while (i >= 0 && j < matrix[0].length) {

            if (matrix[i][j]) {
                return false;
            }

            i--;
            j++;
        }

        // upper-left diagonal
        i = row - 1;
        j = col - 1;

        while (i >= 0 && j >= 0) {

            if (matrix[i][j]) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    static void display(boolean[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {

                if (matrix[row][col]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        boolean matrix[][] = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

        int ans = Nqueen(matrix, 0);

        System.out.println("Total solutions: " + ans);
    }
}
