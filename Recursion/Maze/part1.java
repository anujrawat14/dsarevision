//moving left and right to reach to last elemnt count number of posiblity

public class C {
    static int maze(int row, int col) {
        if (row == 1 && col == 1) {
            return 1;
        }
        int count = 0;
        if (row > 0) {
            // down
            count = count + maze(row - 1, col);
        }
        if (col > 0) {
            // right
            count = count + maze(row, col - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maze(3, 3));
    }
}
