class Solution {
    void genrate(int opening,int max,int closing,List<String> result,String p) {
        if(p.length()==(2*max)){
            result.add(p);
            return;
        }

        if(opening<max){
            genrate(opening+1,max,closing,result,p+"(");
        }

        if(closing<opening){
            genrate(opening,max,closing+1,result,p+")");
        }

     }

    public List<String> generateParenthesis(int n) {
        int max=n; int opening=0;int closing=0;String p="";
        List<String> ans=new ArrayList<>();
        genrate(opening,max,closing,ans, p);
        return ans;
    }

}