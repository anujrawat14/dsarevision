class Solution {
    public int upperBound(int[] nums, int x) {
        int left=0;
        int right=nums.length-1;
        int ans=left;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>x ){
                ans=Math.max(ans,mid);
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
