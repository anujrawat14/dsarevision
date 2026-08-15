// Backtracking means undoing the changes made for the current path and restoring the array/state to how it was before we took that path.
// Recursion takes us deeper into a path, and when the recursive call returns, backtracking restores the previous state so we can try another path.

static List<String> pathObB(String p, boolean[][] maze, int r, int c) {

    // Current cell is already visited / obstacle
    if (!maze[r][c]) {
        return new ArrayList<>();
    }

    // Destination
    if (r == maze.length - 1 && c == maze[0].length - 1) {
        List<String> ans = new ArrayList<>();
        ans.add(p);
        return ans;
    }

    // Mark current cell as visited
    maze[r][c] = false;

    List<String> ans = new ArrayList<>();

    // Down
    if (r < maze.length - 1) {
        ans.addAll(pathObB(p + "D", maze, r + 1, c));
    }

    // Right
    if (c < maze[0].length - 1) {
        ans.addAll(pathObB(p + "R", maze, r, c + 1));
    }

    // Up
    if (r > 0) {
        ans.addAll(pathObB(p + "U", maze, r - 1, c));
    }

    // Left
    if (c > 0) {
        ans.addAll(pathObB(p + "L", maze, r, c - 1));
    }

    // Backtrack
    maze[r][c] = true;

    return ans;
}
