import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        //u can also use switch case

        // int ans = hm.get(s.charAt(0));

        // for (int i = 1; i < s.length(); i++) {

        //     char prev = s.charAt(i - 1);
        //     int prevvalue = hm.get(prev);

        //     char curr = s.charAt(i);
        //     int currvalue = hm.get(curr);

        //     if (prevvalue < currvalue) {
        //         int diff = currvalue - 2*prevvalue;
        //         ans += diff;
        //     } else {

        //         ans += hm.get(curr);
        //     }

        // }

        int ans = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int curr = hm.get(s.charAt(i));
            int next = hm.get(s.charAt(i + 1));

            if (next>curr) {
                ans -=curr ;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}
