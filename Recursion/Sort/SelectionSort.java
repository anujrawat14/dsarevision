//first logic without not much improvement
// class Main {

//     static void swap(int arr[], int left, int right) {
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//     }

//     static void selectionSort(int arr[], int row, int col, int max) {

//         // Base condition
//         if (row == 0) {
//             return;
//         }

//         if (row > col) {

//             if (arr[max] < arr[col]) {
//                 selectionSort(arr, row, col + 1, col);
//             } else {
//                 selectionSort(arr, row, col + 1, max);
//             }

//         } else {

//             // col == row
//             if (arr[max] < arr[col]) {
//                 // max is already at the correct position
//                 selectionSort(arr, row - 1, 0, 0);
//             } else {
//                 // Put maximum element at row
//                 swap(arr, row, max);
//                 selectionSort(arr, row - 1, 0, 0);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {64, 25, 12, 22, 11};

//         selectionSort(arr, arr.length - 1, 0, 0);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

//selection sort with maximu optimization
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void selectionSort(int arr[],int row,int col,int max){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[max]<arr[col]){
                max=col;
            }
            selectionSort(arr,row,col+1,max);
        }
        else{
            // row=col
            if(arr[max]>arr[col]){
                //last elemnt is not maximu
                swap(arr,col,max);
            }
             selectionSort(arr,row-1,0,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        selectionSort(arr,arr.length-1,0,0);
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
