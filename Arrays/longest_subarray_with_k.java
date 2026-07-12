//prefix sum is used  with hash map

import java.util.HashMap;


class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum=0;
        int result=0;
        map.put(0,-1);//edge case if first value is answer

        for(int i=0;i<nums.length;i++){

            prefixSum += nums[i];
            // if(prefixSum==k){
            //     result=i+1;
            // }

            if(map.containsKey(prefixSum-k)){
                result=Math.max(result,i-map.get(prefixSum-k));
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }

        }
        return result;
    }
}
