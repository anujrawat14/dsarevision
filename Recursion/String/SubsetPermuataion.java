import java.util.*;

class Main {

    public static ArrayList<String> permutation(String p, String up) {

        // when all characters are used
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // we have different number of recursive calls
        int n = p.length() + 1;

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for (int i = 0; i < n; i++) {

            // _x_y_
            // substring(0,0) + ch + substring(0)
            // substring(0,1) + ch + substring(1)
            // substring(0,2) + ch + substring(2)

            String left = p.substring(0, i);
            String right = p.substring(i);

            String newString = left + ch + right;

            ans.addAll(
                permutation(newString, up.substring(1))
            );
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(permutation("", "abc"));
    }
}
