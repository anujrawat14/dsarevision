class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
       int n1=nums1.length;
       int n2=nums2.length; 
       int n3=n1+n2;
       int[] arr=new int[n3];
       int k=0;
       int j=0;
       int i=0;
       while(i<n1 &&j<n2){
        if(nums1[i]<nums2[j]){
               if (k == 0 || arr[k - 1] != nums1[i]) {
                 arr[k]=nums1[i];
                  k++;
               }
            i++;
        }
      else  if(nums1[i]>nums2[j] ){
            
            if (k == 0 || arr[k - 1] != nums2[j]) {
                arr[k]=nums2[j];
                 k++;
               }
            j++;
        }
        else{//same
            if (k == 0 || arr[k - 1] != nums1[i]) {
                arr[k]=nums2[j];
                k++;
               }
             i++;
             j++;
        }
       }
       while(i<n1){
         if (k == 0 || arr[k - 1] != nums1[i]){
        arr[k]=nums1[i];
       k++;
         }
        i++;
       }
       }while(j<n2)

    {
        if (k == 0 || arr[k - 1] != nums2[j]) {
            arr[k] = nums2[j];
            k++;
        }
        j++;
    }return java.util.Arrays.copyOf(arr,k);
}}
