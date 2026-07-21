class Solution {
    int maxRowIndex(int[][] mat, int col) {
        int rows = mat.length;
        int maxRow = 0;

        for (int i = 0; i < rows; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }

    public int[] findPeakGrid(int[][] mat) {
        
         int col = mat[0].length;

        int low = 0;
         int high = col - 1;

        while(low<=high){

            int mid=low+(high-low)/2;

            int maxrow= maxRowIndex(mat,mid);

            int left= mid-1>=0? mat[maxrow][mid-1] : -1;

            int right=mid+1<col? mat[maxrow][mid+1] : -1;

            if(mat[maxrow][mid] >left  && (mat[maxrow][mid] > right)){
                 return new int[]{maxrow, mid};
            }
            else if(mat[maxrow][mid] < left ){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return new int[]{-1,-1};
    }
}