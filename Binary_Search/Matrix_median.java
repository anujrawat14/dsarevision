class Solution {
    int countnum(int [][] matrix,int target){
        int row=matrix.length ; int col=matrix[0].length;
        int count=0;

        for(int i=0; i<row;i++){
            //upper bound
            int ub=col;
            int low=0;int high=col-1;
            while(low<=high){
                int mid = low + (high - low) / 2;
                if(matrix[i][mid]>target){
                    ub=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            count=count+ub;
        }
        return count;
        
    }
    public int findMedian(int[][] matrix) {

        int row=matrix.length ; int col=matrix[0].length;
        int median=-1;

        int low=matrix[0][0];
        int high=matrix[0][col-1];

        for(int i=1;i<row;i++){
            if(low>matrix[i][0]){
                low=matrix[i][0];
            }
            if(high<matrix[i][col-1]){
                high=matrix[i][col-1];
            }
        }
       int requiredmedian=(row*col)/2;

        while(low<=high){
            int mid=low+(high-low)/2;
       int smallerequal=countnum(matrix,mid);

            if(smallerequal <= requiredmedian){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return low;
     
    }
}
