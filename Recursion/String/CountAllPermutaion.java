class Main{
public static int subsets(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);

        int count = 0;

        for (int i = 0; i < p.length() + 1; i++) {
            String newString = p.substring(0, i) + ch + p.substring(i);
            count = count + subsets(newString, up.substring(1));
        }
        return count;
    }
public static void main(String[] args) {
        // System.out.println(subsets("", "abc"));
        // subsets("", "abc");
        int count = subsets("", "abc");
        System.out.println(count);
    }
}
