class Solution {
    public int maxElement(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    public int checkdivisor(int arr[], int mid, int threshold) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int divide=(arr[i]+mid-1)/mid;
            sum=sum+divide;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int left = 1;
        int right = maxElement(nums, n);
        int ans=right;

        while(left<=right){
            int mid=left+(right-left)/2;

           int value= checkdivisor(nums,mid,threshold);

           if(value<=threshold){
            ans=mid;
            right=mid-1;
           }
           else{
            left=mid+1;
           }
        }
        return ans;
    }
}