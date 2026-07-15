import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        arr.add(nums[n-1]);
        int rightmax=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>rightmax){
                arr.add(nums[i]);
                rightmax=nums[i];
            }
        }
        Collections.reverse(arr);
        return arr;

    }
}
