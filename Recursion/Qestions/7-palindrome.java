// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
     static int rev(int n){
        return helper(n,0);
    }
    static int helper(int n,int sum){
        if(n==0){
            return sum;
        }
      return  helper(n/10,sum*10+n%10);
        
    }
    static boolean palindrome(int n){
        return n==rev(n);
    }
    public static void main(String[] args) {
        int n=1221;
       boolean res= palindrome(n);
       System.out.println(res);
       
    }
}
