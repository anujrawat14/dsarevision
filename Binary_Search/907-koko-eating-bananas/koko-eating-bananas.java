class Solution {

    public int maxelement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public long totalhour(int piles[], int mid) {
        long count = 0;

        for (int i = 0; i < piles.length; i++) {
            count += (piles[i] + mid - 1) / mid;
        }

        return count;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = maxelement(piles, piles.length);
        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long totalhr = totalhour(piles, mid); // ✅ fixed

            if (totalhr <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}