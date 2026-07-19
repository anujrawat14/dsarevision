class Solution {
    int maxelement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = maxelement(piles, n);
        int ans =right;
        while (left <= right) {
            int mid = left+(right-left) / 2;

            long count = 0;

            for (int i = 0; i < piles.length; i++) {
                int calculate = (piles[i] + mid - 1) / mid;
                count += calculate;
            }

            if (count <= h) {
                ans = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }
        return ans;

    }
}