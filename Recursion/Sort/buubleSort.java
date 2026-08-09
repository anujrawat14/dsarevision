

class Main {
    static void bubleSort(int arr[],int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[col+1]){
                //swap
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
             bubleSort(arr,row,col+1);
        }
        bubleSort(arr,row-1,0);
    }
    public static void main(String[] args) {
        int arr[]={5,6,1,3};
       bubleSort(arr,arr.length-1,0);
       for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
       }
    }
}
