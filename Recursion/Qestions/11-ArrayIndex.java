//adding arraylist inside function call
import java.util.ArrayList;
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
//        int arr[]={1,2,3,4,4,5,6};
//        int target=4;
//        ArrayList<Integer> res=new ArrayList<Integer>();
//        ArrayList<Integer> result= index(arr,target,0,res);
//        for(int i: result){
//            System.out.println(i);
//        }
       
//     }
// }

// USING GLOBAL ARRAYLIST AND STORED INSIDE IT
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static ArrayList<Integer> resultant=new ArrayList<>();
    static void index(int arr[],int target ,int s){
        
        if(s==arr.length){
            return ;
        }
        if (arr[s]==target){
            resultant.add(s);
        }
        index(arr,target,s+1); 
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,4,5,6};
       int target=4;
       index(arr,target,0);
       
       for(int i: resultant){
           System.out.println(i);
       }
       
    }    
}
