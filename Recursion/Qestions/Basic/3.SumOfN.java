class Main {
    public static void main(String[] args) {
        int result = SumN(5);
        System.out.println(result);
    }

    static int SumN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + SumN(n - 1);
    }
}
