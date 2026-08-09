class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        return helper(num, count);
    }

    int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
       
        if (num % 2 == 0) {
            return helper(num / 2, count + 1);
        } else {
            return helper(num - 1, count + 1);
        }
    }
}