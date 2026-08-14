//without storing values making letter through asci values
// import java.util.ArrayList;
// import java.util.List;

// class test {

//     static List<String> subset(String p, String up) {
//         if (up.isEmpty()) {
//             List<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }

//         int digit = (int) (up.charAt(0) - '0');// '2'->2
//         List<String> newList = new ArrayList<>();
//         int start = (digit - 2) * 3;
//         int end = (digit - 1) * 3;

//         if (digit < 2) {
//             return new ArrayList<>();
//         }
//         switch (digit) {
//             case 7:
//                 end = end + 1;
//                 break;
//             case 8:
//                 start = start + 1;
//                 end = end + 1;
//                 break;
//             case 9:
//                 start = start + 1;
//                 end = end + 2;
//                 break;
//             default:
//                 start = start;
//                 end = end;
//         }
//         for (int i = start; i < end; i++) {
//             char ch = (char) ('a' + i);
//             newList.addAll(subset(p + ch, up.substring(1)));
//         }

//         return newList;
//     }

//     static List<String> letter(String digit) {
//         return subset("", digit);
//     }

//     public static void main(String args[]) {
//         List<String> res = letter("9");
//         System.out.println(res);

//     }
// }


//Using An object to store keypad values

import java.util.ArrayList;
import java.util.List;

class test {
    static String[] keypad = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    static List<String> subset(String p, String up) {

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = (int) (up.charAt(0) - '0');// '2'->2
        List<String> newList = new ArrayList<>();

        String letters = keypad[digit];
        for (char ch : letters.toCharArray()) {
            newList.addAll(subset(p + ch, up.substring(1)));
        }
        return newList;
    }

    static List<String> letter(String digit) {
        return subset("", digit);
    }

    public static void main(String args[]) {
        List<String> res = letter("9");
        System.out.println(res);

    }
}
