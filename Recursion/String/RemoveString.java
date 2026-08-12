//remove a string

// class Main {
//     static String skip(String str){
//       //if string == apple skip
//       if(str.isEmpty()){
//           return "";
//       }
//       if(str.startsWith("apple")){
//           return skip(str.substring(5));
//       }
//       else{
//           return  str.charAt(0)+skip(str.substring(1));
//       }
//     }
//     public static void main(String[] args) {
//         String res=skip("applebbbbapple");
//         System.out.println(res);
//     }
// }


//remove a string with only few characters
class Main {

    static String skipAppNotApple(String str) {

        if (str.isEmpty()) {
            return "";
        }

        // Skip "app" only if it is NOT part of "apple"
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } 
        else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String res = skipAppNotApple("appbbbbappe");
        System.out.println(res);
    }
}
