class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = nums[n - 1];
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            //left sorted
            if (nums[mid] >= nums[left]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;

            } else {
                min = Math.min(nums[mid], min);
                right = mid - 1;
            }
        }
        return min;
    }
}