// import java.util.*;

// class Solution {

//     public List<String> helper(String p, String up) {

//         //base condition
//         if (up.isEmpty()) {
//             List<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }

//         int digit = up.charAt(0) - '0';//it will give me integer of that digit like  12"->1 

//         int start = (digit - 2) * 3;
//         int end = (digit - 1) * 3;

//         if (digit >= 8) {
//             start++;
//             end++;
//         }

//         if (digit == 7 || digit == 9) {
//             end = end + 1;
//         }
//         List<String> ans = new ArrayList<>();

//         for (int i = start; i < end; i++) {

//             char ch = (char) ('a' + i);

//             ans.addAll(helper(p + ch, up.substring(1)));

//         }

//         return ans;
//     }

//     public List<String> letterCombinations(String digits) {
//         if (digits.isEmpty()) {
//             return new ArrayList<>();
//         }
//         return helper("", digits);
//     }
// }
import java.util.*;

class Solution {

    String[] keypad = {
        "", "", "abc", "def",
        "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
    };

    public List<String> helper(String p, String up) {

        // base condition
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        String letters = keypad[digit];

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            ans.addAll(helper(p + ch, up.substring(1)));
        }

        return ans;
    }

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return helper("", digits);
    }
}