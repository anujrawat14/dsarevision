// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int result=sumDigit(-1345);
        System.out.println(result);
       
    }
    static int sumDigit(int n){
        n=Math.abs(n);
        if(n==0){
            return 0;
        }
        return n%10+sumDigit(n/10);
    }
}
