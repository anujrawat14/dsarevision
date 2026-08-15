
//we can move horizontaly vertically and also diagonaly


import java.util.ArrayList;
import java.util.List;

public class E {
    static List<String> path(String p, int r, int c) {

        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        // Diagonal
        if (r > 1 && c > 1) {
            ans.addAll(path(p + "D", r - 1, c - 1));
        }

        // Horizontal
        if (c > 1) {
            ans.addAll(path(p + "H", r, c - 1));
        }

        // Vertical
        if (r > 1) {
            ans.addAll(path(p + "V", r - 1, c));
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
    }
}
