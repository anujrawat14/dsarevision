import java.util.Arrays;

public class F {

    static void pathObB(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {

        // obstacle / already visited
        if (!maze[r][c]) {
            return;
        }

        // destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
             System.out.println(p);
            path[r][c] = steps;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
           
            System.out.println();
            return;
        }

        // mark current cell as visited
        maze[r][c] = false;
        path[r][c] = steps;

        // Down
        if (r < maze.length - 1) {
            pathObB(p + "D", maze, r + 1, c, path, steps + 1);
        }

        // Right
        if (c < maze[0].length - 1) {
            pathObB(p + "R", maze, r, c + 1, path, steps + 1);
        }

        // Up
        if (r > 0) {
            pathObB(p + "U", maze, r - 1, c, path, steps + 1);
        }

        // Left
        if (c > 0) {
            pathObB(p + "L", maze, r, c - 1, path, steps + 1);
        }

        // Backtracking: restore the cell
        maze[r][c] = true;
        path[r][c] = 0;

    }

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int path[][] = new int[maze.length][maze[0].length];

        pathObB("", maze, 0, 0, path, 1);
    }
}
