

class Main {
    static String skip(String str){
      //if string == apple skip
      if(str.isEmpty()){
          return "";
      }
      if(str.startsWith("apple")){
          return skip(str.substring(5));
      }
      else{
          return  str.charAt(0)+skip(str.substring(1));
      }
    }
    public static void main(String[] args) {
        String res=skip("applebbbbapple");
        System.out.println(res);
    }
}
