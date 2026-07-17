class Solution {
    public int lowerBound(int[] nums, int x) {
       int left=0;
       int right=nums.length-1;
       int smallest_index=right;

       while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]==x || nums[mid]>x){
            smallest_index=Math.min(smallest_index,mid);
            right=mid-1;
        }
        else {
            left=mid+1;
        }

       }
       return smallest_index;
     }
}
