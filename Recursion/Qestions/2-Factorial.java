// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main {
    public static void main(String[] args) {
        int result=factorial(-1);
        // int result=factorial(5);
        //int result=factorial(0);
        System.out.println(result);
    }
    static int factorial(int n){
        
        if(n==1 || n==0){
            return 1;
        }
        if(n <0){
             throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        return n*factorial(n-1);
        
    }
}
