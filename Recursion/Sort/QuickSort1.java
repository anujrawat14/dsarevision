//quick sort code taking last as my pivot elemnt

class Main {
    static void quickSort(int arr[],int low,int high){
        if(low >= high){
            return;
        }
        int s=low;int e=high-1;int pivot=arr[high];
        
        while(s<=e){
            //if array sorted toh hum ko swap nhi krn hai
           while (s <= e && arr[s] <= pivot) {
                s++;
            }
            while(s<=e && arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }
        }
        // pivot ko correct position par rakhenge
        int temp = arr[s];
        arr[s] = arr[high];
        arr[high] = temp;
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    public static void main(String[] args) {
        int arr[] = {7, 6, 5, 4};
         // Quick Sort call
         quickSort(arr, 0, arr.length-1); 
         // Print sorted array 
         for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
          } 
        
    
    }
}
