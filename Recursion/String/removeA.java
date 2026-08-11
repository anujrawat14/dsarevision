//Appproach 1
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     public static void removeA(String str,String ans){
//         if(str.isEmpty()){
//             System.out.println(ans);
//             return;
//         }
//         if(str.charAt(0)=='a'){
//             removeA(str.substring(1),ans);//index 0 remove ho jayega aur substring bn jayegi 1 to end
//         }
//         else{
//             removeA(str.substring(1),ans+str.charAt(0));
//         }
      
      
//     }
//     public static void main(String[] args) {
//         String str="abba";
       
//        removeA(str,"");
        
//     }
// }


// Approach 2

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
