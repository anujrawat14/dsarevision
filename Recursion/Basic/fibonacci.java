// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
     int result=fib(6);
     System.out.println(result);
    }
    static int fib(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        if(n<2){
            return n;
        }
       return fib(n-1)+fib(n-2);
      
    }
}
