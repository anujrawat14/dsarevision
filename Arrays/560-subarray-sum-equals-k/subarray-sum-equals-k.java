import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map=new HashMap<>();
        int n =nums.length;
        map.put(0,1);
        int prefsum=0;
        int Totalcount=0;

        for(int i=0;i<n;i++){
            prefsum += nums[i];
            int currentsum=prefsum-k;

            if(map.containsKey(currentsum)){
                Totalcount=Totalcount+map.get(currentsum);
            }
            map.put(prefsum,map.getOrDefault(prefsum,0)+1);
            
        }
        return Totalcount;
       
    }
}