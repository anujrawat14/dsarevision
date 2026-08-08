//* 
// * * 
// * * * 
// * * * * 

//USING TAIL RECURSION

// class Main {
//       static void fun(int n){
//          print(1,0,n);
//        }    
//       static void print(int r,int c,int n){
//           if(r>n){
//               return;
//           }
//         if(r>c){
//             System.out.print("* ");
//             print(r,c+1,n);
//         }
//         else{
//             System.out.println();
//             print(r+1,0,n);
//         }
//       }
//     public static void main(String[] args) {
//        fun(4);
//     }
// }
//using Non tail recurssion


class Main {
    static void    print(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            print(r,c+1);
            System.out.print("* ");
        }
        else{
            print(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
       print(4,0);
    }
}
