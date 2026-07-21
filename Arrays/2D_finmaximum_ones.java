class Solution {
    public int rowWithMax1s(int[][] mat) {
        // int row = mat.length;
        // int col = mat[0].length;

        // int ans = -1;
        // int max_count = 0;

        // for (int i = 0; i < row; i++) {

        //     int left = 0, right = col - 1;
        //     int firstindex = col;

        //     // Binary search for first 1
        //     while (left <= right) {
        //         int mid = left + (right - left) / 2;

        //         if (mat[i][mid] == 1) {
        //             firstindex = mid;
        //             right = mid - 1;
        //         } else {
        //             left = mid + 1;
        //         }
        //     }

        //     int count = col - firstindex;

        //     if (count > max_count) {
        //         max_count = count;
        //         ans = i;
        //     }

        // return ans;

       //OPTIMAL ANSWER
      int row=mat.length;
       int col=mat[0].length;
       int ans=-1;

       int left=0; int right=col-1;

       while(left<row && right>=0){
        if(mat[left][right]==1){
            ans=left;
            right--;
        }
        else{
            left++;
        }
       }
       return ans;
    }
}
