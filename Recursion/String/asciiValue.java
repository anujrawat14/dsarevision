import java.util.Map;
import java.util.HashMap;
class Main {
    static Map<String,Integer> subset(String p,String str,int ascii) {
         if(str.isEmpty()){
            Map<String,Integer> map=new HashMap<>();
            map.put(p,ascii);
            return map;
        }
        char ch=str.charAt(0);
        //lena hai
      Map<String,Integer> left=subset(p+ch,str.substring(1),(ascii+ch));
        // nhi liya
        Map<String,Integer> right=subset(p,str.substring(1),ascii);
            left.putAll(right);
            return left;
        
    }

    public static void main(String[] args) {
      Map<String, Integer> result = subset("", "abc", 0); 
      System.out.println(result);
    }
}
