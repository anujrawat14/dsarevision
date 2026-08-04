// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int left=0;
        int right=arr.length-1;
       int index=Bs(arr,left,right,7);
        System.out.println(index);
         
    }
    static int Bs(int[] arr,int left,int right,int target){
    if(left>right){
        return -1;
    }
    int mid = left + (right - left) / 2;
    
    if(arr[mid]==target){
            return mid;
        }
  else if(arr[mid]<target){
            return Bs(arr,mid+1,right,target);
        }
        else{
            return Bs(arr,left,mid-1,target);
        }
    }
}
