import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        if (s.length() != t.length())
            return false;

        if (s.length() == 1) {
            return true;
        }
        map.put(s.charAt(0), t.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (map.containsValue(ch2)) {
                    return false;
                }
            }
            map.put(ch1, ch2);
        }

        return true;

      // you can also use 2 hash map
    }
}
