
class Main {
    static Void subset(String p,String str) {
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        //lena hai
         subset(p+ch,str.substring(1));
        // nhi liya
        subset(p,str.substring(1));
        
    }
    public static void main(String[] args) {
      
       subset(" ","abc");
    }
}
