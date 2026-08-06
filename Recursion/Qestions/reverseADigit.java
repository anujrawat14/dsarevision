// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int result=  rev(184);
      
      System.out.println(result);
    }
    static int rev(int n){
        return helper(n,0);
    }
    static int helper(int n,int sum){
        if(n==0){
            return sum;
        }
      return  helper(n/10,sum*10+n%10);
        
    }
}
