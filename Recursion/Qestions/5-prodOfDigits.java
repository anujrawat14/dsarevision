class Main {
    public static void main(String[] args) {
        int n = -55;
        int sign = (n < 0) ? -1 : 1;

        int result = sign * prodDigit(Math.abs(n));
        System.out.println(result);
    }

    static int prodDigit(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * prodDigit(n / 10);
    }
}
