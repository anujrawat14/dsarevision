// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    static int Bs(int[] arr, int l, int r, int target) {
        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return Bs(arr, l, mid - 1, target);
        } else {
            return Bs(arr, mid + 1, r, target);
        }
    }
    static int  RBs(int arr[],int l,int r,int target){
        if(l>r){
            return -1;
        }
        int mid=l+(r-l)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        
         //left is sorted
        if(arr[l]<=arr[mid] ){
            //left k andar hi hai
           if (target >= arr[l] && target < arr[mid]){
               return Bs(arr,l,mid+1,target);
                
            }
            //search in roatated right part
            return RBs(arr,mid+1,r,target);
        }
        //right sorted
        //right ka andar hai
          if (target > arr[mid] && target <= arr[r]){
              return Bs(arr,mid+1,r,target);
          }
          
            return RBs(arr,l,mid-1,target);
         
        }
      
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        System.out.println(RBs(arr, 0, arr.length - 1, target));
    }
}
