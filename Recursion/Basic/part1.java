//basic code to print hello 5 times
class Main {
    public static void main(String[] args) {
      hello1();
    }
   public static void hello1(){
        System.out.println("hello");
        hello2();
    }
   public static void hello2(){
        System.out.println("hello");
         hello3();
    }
   public static void hello3(){
        System.out.println("hello");
         hello4();
    }
   public static void hello4(){
        System.out.println("hello");
        hello5()
    }
   public static void hello5(){
        System.out.println("hello");
    }
}
//code to print hello word using single function using recursion
// class Main {
//     public static void main(String[] args) {
//       hello1(5);
//     }
//    public static void hello1(int val){
//        if(val==0){
//            return ;
//        }
       
//         System.out.println("hello");
        
//         hello1(val-1);
//     }
// }
