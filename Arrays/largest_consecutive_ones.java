class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Maxcount=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                Maxcount=Math.max(Maxcount,count);
                count=0;
            }
        }
        Maxcount=Math.max(Maxcount,count);
        return Maxcount;
    }
}
