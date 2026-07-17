class Solution {
    public boolean search(int[] nums, int target) {
        int left=0; int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                return true;
            }

          else  if(nums[mid]== nums[right] && nums[mid]==nums[left]){
                //left=right=mid
                left=left+1;
                right=right-1;
            }
            //left sorted
            else if(nums[mid]>=nums[left]){
                if(nums[mid]>target && nums[left]<=target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }

            //right sorted
            else{
                if(nums[mid]<target && nums[right]>= target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }

        return false;
    }
}