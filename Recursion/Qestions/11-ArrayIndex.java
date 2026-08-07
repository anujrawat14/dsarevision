//adding arraylist inside function call
// import java.util.ArrayList;
// class Main {
//     static ArrayList<Integer> index(int arr[],int target ,int s,ArrayList<Integer> res){

//         // Base case: reached end of array
//         if(s==arr.length){
//             return res;
//         }

//         // If current element matches target, store its index
//         if (arr[s]==target){
//             res.add(s);
//         }

//         // Continue searching in the remaining array
//         return index(arr,target,s+1,res); 
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,4,5,6};
//         int target=4;

//         // Passing a newly created ArrayList
//         System.out.println(index(arr,target,0,new ArrayList<Integer>()));
//     }
// }

// USING GLOBAL ARRAYLIST AND STORED INSIDE IT
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class Main {
//     // Global list to store all matching indices
//     static ArrayList<Integer> resultant=new ArrayList<>();

//     static void index(int arr[],int target ,int s){

//         // Base case
//         if(s==arr.length){
//             return ;
//         }

//         // Store index if target is found
//         if (arr[s]==target){
//             resultant.add(s);
//         }

//         // Move to next index
//         index(arr,target,s+1);
//     }

//     public static void main(String[] args) {
//        int arr[]={1,2,3,4,4,5,6};
//        int target=4;

//        // Start recursive search
//        index(arr,target,0);

//        // Print all stored indices
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

    static ArrayList<Integer> index(int arr[], int t, int s) {

        // Every recursive call creates its own list
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Base case: return empty list
        if (s == arr.length) {
            return list;
        }

        // If current element matches target,
        // store the current index in this call's list
        if (arr[s] == t) {
            list.add(s);
        }

        // Get the answer from the remaining recursive calls
        ArrayList<Integer> ans = index(arr, t, s + 1);

        // Merge current list with the returned list
        list.addAll(ans);

        // Return the combined list
        return list;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 5};

        // Start recursive search
        ArrayList<Integer> as = index(arr, 4, 0);

        // Print all indices
        System.out.println(as);
    }
}
