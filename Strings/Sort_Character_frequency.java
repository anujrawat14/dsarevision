import java.util.*;

class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        List<Character>[] bucket = new ArrayList[s.length() + 1];

        Map<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] == null)
                continue;

            for (char ch : bucket[i]) {
                for (int j = 0; j < i; j++) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();

 // StringBuilder ans = new StringBuilder();
 //        List<Character>[] bucket = new ArrayList[s.length() + 1];

 //        Map<Character, Integer> hm = new HashMap<>();

 //        for (char ch : s.toCharArray()) {
 //            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
 //        }

 //        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
 //            int freq = entry.getValue();
 //            if (bucket[freq] == null) {
 //                bucket[freq] = new ArrayList<>();
 //            }
 //            bucket[freq].add(entry.getKey());
 //        }
 //        for (int i = bucket.length - 1; i >= 0; i--) {
 //            if (bucket[i] == null)
 //                continue;

 //            for (char ch : bucket[i]) {
 //                for (int j = 0; j < i; j++) {
 //                    ans.append(ch);
 //                }
 //            }
 //        }
 //        return ans.toString();
      

    }
}
