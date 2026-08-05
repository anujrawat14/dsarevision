class Main {
    public static void main(String[] args) {
        int result=sumDigit(-1345);
        System.out.println(result);
       
    }
    static int sumDigit(int n){
        n=Math.abs(n);
        if(n<10){
            return n;
        }
        return sumDigit(n/10)+n%10;
    }
}
