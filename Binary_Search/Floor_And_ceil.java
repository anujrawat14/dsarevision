class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor=-1;int ceil=-1;
       int left =0; int right =nums.length-1;

       while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]==x){
            return new int[]{nums[mid],nums[mid]};
        }
        else if(nums[mid]<x){
            floor=nums[mid];
            left=mid+1;
        }
        else{
            ceil=nums[mid];
            right=mid-1;
        }
       }
       return new int[]{floor,ceil};
    }
}
