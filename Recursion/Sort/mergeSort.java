// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static void mergeSort(int arr[],int start,int end){
        int mid=start+(end-start)/2;
        if(end-start==1){
            return;
        }
        //left half sorted
       mergeSort(arr,start,mid);//left index
       //right half sorted
        mergeSort(arr,mid,end);//right index
        //merge both half
        merge(arr,start,mid,end);
    }
    static void merge(int arr[],int start,int mid,int end){
        int mix[]=new int[end-start];
        int i=start;int j=mid;int k=0;
        
        while(i<mid && j<end){
            if(arr[i]>arr[j]){
                mix[k]=arr[j];
                j++;
            }
            else{
                mix[k]=arr[i];
                i++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            k++;i++;
        }
        while(j<end){
            mix[k]=arr[j];
            k++;j++;
        }
        // return mix;
        // we dont have to return anything just to modify it as it is void
    
        for(int in=0;in<mix.length;in++){
            arr[start+in]=mix[in];
        }
        
    }
    public static void main(String[] args) {
          int[] arr = {5, 2, 8, 1, 3, 7, 6, 4};

        mergeSort(arr, 0, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
