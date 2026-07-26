class Solution {
    int beauty(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);
            }
        }

        return max - min;
    }

    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ans += beauty(s.substring(i, j+1));
            }
        }
        return ans;

    }
}