//Approach 1
// class Main {
//     static Void subset(String p,String str) {
//         if(str.isEmpty()){
//             System.out.println(p);
//             return;
//         }
//         char ch=str.charAt(0);
//         //lena hai
//          subset(p+ch,str.substring(1));
//         // nhi liya
//         subset(p,str.substring(1));
        
//     }
//     public static void main(String[] args) {
      
//        subset(" ","abc");
//     }
// }

//approach 2 making array lista as global variable

// import java.util.ArrayList;
// class Main {
//     static ArrayList<String> subset(String p,String str,ArrayList<String> arr) {
//         if(str.isEmpty()){
//             arr.add(p);
//             return arr;
//         }
//         char ch=str.charAt(0);
//         //lena hai
//          subset(p+ch,str.substring(1),arr);
//         // nhi liya
//        subset(p,str.substring(1),arr);
//        return arr;
        
//     }

//     public static void main(String[] args) {
//       ArrayList<String> result = new ArrayList<>();
//         // Pass an empty string "" instead of a space " ", and pass the list
//         subset("", "abc", result);
//         System.out.println(result);
//     }
// }


//Appraoch 3


import java.util.ArrayList;
class Main {
    static ArrayList<String> subset(String p,String str) {
        
       
        
        if(str.isEmpty()){
             ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=str.charAt(0);
        //lena hai
         ArrayList<String> left=subset(p+ch,str.substring(1));
        // nhi liya
         ArrayList<String> right=subset(p,str.substring(1));
            left.addAll(right);
            return left;
        
    }

    public static void main(String[] args) {
      ArrayList<String> result = new ArrayList<>();
      result= subset("", "abc");
       
        System.out.println(result);
    }
}
