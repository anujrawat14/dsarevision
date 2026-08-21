class Solution {
   void helper(List<List<Integer>> ans,List<Integer> p,int[] up,int target,int start){

        //base condition
        if(target==0){
            //process array haui usko list ka andar dal dunga
            ans.add(new ArrayList<>(p));
            return;
        }

        if(target<0){
            return;
        }

        //process array ka andar hum elemnt dalenga from unprocess array
        for(int i=start;i<up.length;i++){
            p.add(up[i]);
            helper(ans,p,up,target-up[i],i);
            p.remove(p.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        helper(ans,p,candidates,target,0);
        return ans;
    }
}