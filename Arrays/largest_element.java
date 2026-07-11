class Solution {
    public int largestElement(int[] nums) {
        
        int n=nums.length;

        if(n==0){
            return 0;
        }

        else{

        int larg=nums[0];

        for(int i=1;i<n;i++){
            if(larg<nums[i]){
                larg=nums[i];
            }
        }
         return larg;

        }       
    }
}
