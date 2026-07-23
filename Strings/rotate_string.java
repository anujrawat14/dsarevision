class Solution {
    public boolean rotateString(String s, String goal) {

        //brute take a bp and roate the string

        // for (int i = 0; i < goal.length(); i++) {

        //     if (goal.charAt(i) == s.charAt(0)) {

        //         String ans = goal.substring(i) + goal.substring(0, i);

        //         if (ans.equals(s))
        //             return true;
        //     }
        // }

        // return false;

        //optimal
        if (s.length() != goal.length())
            return false;

        return (s + s).contains(goal);
    }
}
