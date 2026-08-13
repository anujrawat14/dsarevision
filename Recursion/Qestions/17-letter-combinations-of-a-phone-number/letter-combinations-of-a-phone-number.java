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

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.isEmpty()) {
            return ans;
        }

        backtrack(0, digits, new StringBuilder(), ans);

        return ans;
    }

    private void backtrack(
        int index,
        String digits,
        StringBuilder current,
        List<String> ans
    ) {

        // base condition
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (char ch : letters.toCharArray()) {

            current.append(ch);

            backtrack(index + 1, digits, current, ans);

            // backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }
}