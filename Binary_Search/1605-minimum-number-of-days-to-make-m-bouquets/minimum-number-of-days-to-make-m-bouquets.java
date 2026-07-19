class Solution {
    public int maxElement(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    

    public int check(int arr[], int n, int mid, int m, int k) {
        int count = 0;
        int adjacentcount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= mid) {
                adjacentcount++;
            } else {
                count += adjacentcount / k;
                adjacentcount = 0;
            }
        }
        count += adjacentcount / k;

        return count;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n)
            return -1;

        int left = 1;
        int right = maxElement(bloomDay, n);
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = check(bloomDay, n, mid, m, k);
            if (count >= m) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }
}