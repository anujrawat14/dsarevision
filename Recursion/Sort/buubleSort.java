// IT IS SIMILAR TO PARTTERN 1 PART 1 JAVA
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static void BubbleSort(int[] arr){
        sort(arr,arr.length,0);
    }
  static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void sort(int[] arr,int r,int c){
        if(r==0){
            return ;
        }
        if(r==c){
            sort(arr,r-1,0);
            return;
        }
         if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
           }
         sort(arr,r,c+1);
    }
    public static void main(String[] args) {
        int arr[]={3, 5, 8, 1, 2};
        BubbleSort(arr);
        for(int i=0;i<arr.length;i++){
        
        System.out.println(arr[i]);
        }
    }
}
