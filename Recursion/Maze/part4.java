//stoping recursion at obstacles (1,1)

// static List<String> pathOb(String p, int r, int c) {
//         //obsatcle
//         if (r == 1 && c == 1) {
//             return new ArrayList<>();
//         }

//   //base condition
//         if (r == 2 && c == 2) {
//             List<String> ans = new ArrayList<>();
//             ans.add(p);
//             return ans;
//         }

//         List<String> ans = new ArrayList<>();
//         if (r < 2) {
//             ans.addAll(pathOb(p + "D", r + 1, c));
//         }
//         if (c < 2) {
//             ans.addAll(pathOb(p + "R", r, c + 1));
//         }
//         return ans;
//     }
//their is an flase in matrix where therei is obstacles

 static List<String> pathObB(String p, boolean[][] maze, int r, int c) {

        if (!maze[r][c]) {// maze[r][c]=false not krenga toh true ayega
            return new ArrayList<>();
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        if (r < maze.length-1) {
            ans.addAll(pathObB(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length-1) {
            ans.addAll(pathObB(p + "R", maze, r, c + 1));
        }
        return ans;
    }
