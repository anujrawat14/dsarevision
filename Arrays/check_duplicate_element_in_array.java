class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int n=nums.size();
        boolean issort=true;
        if(n<2){
            return true;
        }
        for(int i=1;i<n;i++){
            if(nums.get(i)<nums.get(i-1)){
                issort=false;
                break;
            }
        }
    return issort;

    }
}
