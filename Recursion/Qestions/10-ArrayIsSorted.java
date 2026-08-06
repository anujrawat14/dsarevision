// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        boolean ans=sorted(arr);
        System.out.println(ans);
    }
    static boolean sorted(int[] arr){
        int s=0;
       
        return helper(arr,s); 
        
    }
    static boolean helper(int[] arr,int s){
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]<=arr[s+1]){
            return helper(arr,s+1);
        }else{
            return false;
        }
    }
    
}
