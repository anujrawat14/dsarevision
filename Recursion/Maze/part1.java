//moving down and right to reach to last elemnt count number of posiblity

// public class C {
//     static int maze(int row, int col) {
//         if (row == 1 && col == 1) {
//             return 1;
//         }
//         int count = 0;
//         if (row > 0) {
//             // down
//             count = count + maze(row - 1, col);
//         }
//         if (col > 0) {
//             // right
//             count = count + maze(row, col - 1);
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         System.out.println(maze(3, 3));
//     }
// }

// Maintaing an lsit of path

import java.util.ArrayList;
import java.util.List;

public class C {

    static List<String> mazeList(int row, int col) {

        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        List<String> ans = new ArrayList<>();

        if (row > 0) {
            List<String> right = mazeList(row - 1, col);

            for (String path : right) {
                ans.add("R" + path);
            }

        }
        if (col > 0) {
            List<String> down = mazeList(row, col - 1);
            for (String path : down) {
                ans.add("D" + path);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
       
        System.out.println(mazeList(3, 3));
    }
}

