class Solution {
    void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
    }

    public void rotate(int[][] matrix) {

        //step 1 transpose (row -> column)

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (i > j) {
                    // swap(i)(j) to (j)(i)
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                }
            }
        }

        //step 2 reverse
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i],0,matrix.length-1);
        }
    }
}