// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       printNumbers(1);
    }
    static void printNumbers(int n){
        if(n==5){
        System.out.println(n);
        return;
        }
        System.out.println(n);
        n=n+1;
        printNumbers(n);
    }
}
