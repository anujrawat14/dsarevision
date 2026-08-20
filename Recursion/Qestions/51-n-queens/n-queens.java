class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        helper(board, 0, ans);
        return ans;
    }

    public void helper(boolean[][] board, int row,List<List<String>> ans) {
        if (row == board.length) {
           List<String> list= new ArrayList<>();
            
            // for (int i = 0; i < board.length; i++) {

            //     StringBuilder str = new StringBuilder();

            //     for (int j = 0; j < board[0].length; j++) {

            //         if (board[i][j]) {
            //             str.append("Q");
            //         } else {
            //             str.append(".");
            //         }
            //     }

            //     list.add(str.toString());
            // }
            for(int r=0;r<board.length;r++){
                StringBuilder str=new StringBuilder();
                for(int c=0;c<board.length;c++){
                    if(board[r][c]){
                        str.append("Q");
                    }
                    else{
                        str.append(".");
                    }
                }
                list.add(str.toString());
            }
            ans.add(list);
            
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                helper(board, row + 1,ans);
                board[row][col] = false;
            }

        }
    }

    public boolean isSafe(boolean[][] board, int row, int col) {

        //verticall up
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col]) {
                return false;
            }
        }

        // right diagonal up
        int r = row - 1;
        int c = col + 1;

        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        // left diagonal up
        r = row - 1;
        c = col - 1;

        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        return true;
    }
}