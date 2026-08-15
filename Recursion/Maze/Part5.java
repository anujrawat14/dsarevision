//backtrack k time par waps sa true mark kr denga

static List<String> pathObB(String p, boolean[][] maze, int r, int c) {

    // obstacle OR already visited
    if (!maze[r][c]) {
        return new ArrayList<>();
    }

    // destination
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

    // Backtrack: make cell available again
    maze[r][c] = true;

    return ans;
}
