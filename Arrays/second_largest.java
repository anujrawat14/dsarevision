class Solution {
    public int secondLargestElement(int[] nums) {
    int n=nums.length;
    if(n<2){
        return -1;
    }

    int largest=nums[0];
    int secondlargest=Integer.MIN_VALUE;

    for(int i=1;i<n;i++){
        if(largest<nums[i]){
            secondlargest=largest;
            largest=nums[i];
        }
        else if(secondlargest<nums[i] && largest>nums[i]){
            secondlargest=nums[i];
        }
    }

  return (Integer.MIN_VALUE==secondlargest)?-1:secondlargest;

    }
}
