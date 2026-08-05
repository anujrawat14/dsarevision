// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       //print 5 to 1
     //    printNum(5);
     //    printNumRev(5);
           printNumBoth(5);
    }
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);//if u want 5-4-3-2-1
        printNum(n-1);
     
    }
    public static void printNumRev(int n){
        if(n==0){
            return;
        }
      
        printNumRev(n-1);
       System.out.println(n);//if u want 1-2-3-4-5 (in this the stack have(5,4,3,2,1) but function is printing when it return )
    }
    public static void printNumBoth(int n){
        if(n==0){
            return;
        }
       System.out.println(n);//if u want 5-4-3-2-1
        printNumBoth(n-1);
       System.out.println(n);//if u want 1-2-3-4-5 (in this the stack have(5,4,3,2,1) but function is printing when it return )
    }

  
}
