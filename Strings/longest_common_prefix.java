import java.util.Arrays;
class Solution {
  
    public String longestCommonPrefix(String[] strs) {
      // //brute force
      //   Arrays.sort(strs);
      //   StringBuilder ans = new StringBuilder();
      //   int n = strs.length;
      //   String first = strs[0];
      //   String last = strs[n - 1];

      //   for (int i = 0; i <  Math.min(first.length(), last.length()); i++) {
      //       char ch1 = first.charAt(i);
      //       char ch2 = last.charAt(i);

      //       if (ch1 == ch2) {
      //           ans.append(ch1);
      //       }
      //       else{
      //           break;
      //       }

      //   }
      //   return ans.toString();

      //optimal using vertical searching
      if (strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
