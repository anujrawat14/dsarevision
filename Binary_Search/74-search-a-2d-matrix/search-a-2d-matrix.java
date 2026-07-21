class Solution {

    int potentialRow(int[][] mat, int target) {
        int row = mat.length;
        int left = 0, right = row - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mat[mid][0] <= target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = potentialRow(matrix, target);

        if (rowIndex == -1)
            return false;

        int col = matrix[0].length;
        int left = 0, right = col - 1;

        // Binary search in that row
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[rowIndex][mid] == target)
                return true;
            else if (matrix[rowIndex][mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

}