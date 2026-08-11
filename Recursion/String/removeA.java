

class Main {
    public static String removeA(String str,StringBuilder ans,int i){
        if(str.length()==i){
            return ans.toString();
        }
        if(str.charAt(i)!='a'){
           ans.append(str.charAt(i));
        }
       
        return removeA(str,ans,i+1);
      
    }
    public static void main(String[] args) {
        String str="abba";
        StringBuilder ans=new StringBuilder();
        String res=removeA(str,ans,0);
        
        System.out.println(res);
    }
}
