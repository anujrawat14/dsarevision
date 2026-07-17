class Solution {
    public int lowerbound(int nums[], int target) {

        int left = 0;
        int right = nums.length - 1;
        int lb =nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                lb = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return lb;
    }

    public int upperbound(int nums[], int target) {

        int left = 0;
        int right = nums.length - 1;
        int ub = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > target) {
                ub = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ub - 1;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = lowerbound(nums, target);
        int last = upperbound(nums, target);

        if ( first <nums.length && nums[first] == target) {
          return new int[] { first, last };

        }
        else{
            return new int[]{-1,-1};
        }
    }
}
