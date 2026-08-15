
    // static int countstep(int row, int col) {
    //     if (row == 1 || col == 1) {
    //         return 1;
    //     }
    //     int right = countstep(row, col - 1);
    //     int down = countstep(row - 1, col);
    //     return right + down;
    // }



static List<String> mazeList(String p, int row, int col) {

        // Base condition
        if (row == 1 && col == 1) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();

        if (row > 1) {

            // Move Down
            List<String> down = mazeList(p + "D", row - 1, col);
            ans.addAll(down);
        }
        if (col > 1) {
            // Move Right

            List<String> right = mazeList(p + "R", row, col - 1);
            ans.addAll(right);
        }

        return ans;
    }
