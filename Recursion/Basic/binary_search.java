// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int arr[]={0,1,2,3,4,5,6,7,8,9,10};
      int target=8;
      int left=0;
      int right=arr.length-1;
      int index=Bs(arr,target,left,right);
      System.out.println(index);
    }
    static int Bs(int[] arr,int target,int left,int right){
        if(left>right){
            //base condition
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
           return Bs(arr,target,left,mid-1);
        }
        else{
           return Bs(arr,target,mid+1,right);
        }
    }
}
