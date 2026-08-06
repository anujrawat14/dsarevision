//check firts with last digit

class Main {
    public static void main(String[] args) {
        // int n=0;
        int n=900090;
        int res=count(n);
        System.out.println(res);
    }
  static int count(int n){
      if(n==0){
          return 1;
      }
      int count=0;
     return helper(n,count);
  }
  static int helper(int n,int count) {
      if(n==0){
          return count;
      }
    count=  n%10==0 ?count+1:count;
     
      return helper(n/10,count);
  }
}
