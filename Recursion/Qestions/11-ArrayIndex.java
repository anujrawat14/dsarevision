//adding arraylist inside function call
// import java.util.ArrayList;
// class Main {
//     static ArrayList<Integer> index(int arr[],int target ,int s,ArrayList<Integer> res){
        
//         if(s==arr.length){
//             return res;
//         }
//         if (arr[s]==target){
//             res.add(s);
//         }
//         return index(arr,target,s+1,res); 
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,4,5,6};
//         int target=4;
//         // ArrayList<Integer> res=new ArrayList<Integer>();
//         System.out.println( index(arr,target,0,new ArrayList<Integer>()));
//     }
// }

// USING GLOBAL ARRAYLIST AND STORED INSIDE IT
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     static ArrayList<Integer> resultant=new ArrayList<>();
//     static void index(int arr[],int target ,int s){
        
//         if(s==arr.length){
//             return ;
//         }
//         if (arr[s]==target){
//             resultant.add(s);
//         }
//         index(arr,target,s+1); 
//     }
//     public static void main(String[] args) {
//        int arr[]={1,2,3,4,4,5,6};
//        int target=4;
//        index(arr,target,0);
       
//        for(int i: resultant){
//            System.out.println(i);
//        }
       
//     }    
// }

// EVRY FUNCTION RETURN INDIVIDUAL ANSWER AND ADD THEM
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 import java.util.ArrayList;
class Main {
    static ArrayList<Integer> index(int arr[],int t,int s){
           ArrayList<Integer> list=new  ArrayList<Integer>() ;
           if(s==arr.length){
               return list;
           }
           if(arr[s]==t){
               list.add(s);
           }
           ArrayList<Integer> ans=index(arr,t,s+1);
           list.addAll(ans);
           return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        ArrayList<Integer> as=index(arr,4,0);
        System.out.println(as);
    }
}
