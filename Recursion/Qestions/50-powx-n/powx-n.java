class Solution {
     public double pow(double x, long n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / pow(x, -n);
        }

        double half = pow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public double myPow(double x, int n) {
        return pow(x, (long) n);
    }
}