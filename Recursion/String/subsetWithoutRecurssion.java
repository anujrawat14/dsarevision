// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Main {
//     static List<List<Integer>> subset(int[] arr){
//        List<List<Integer>> outerList=new ArrayList<>();
//        outerList.add(new ArrayList<Integer>());

//        for(int num:arr){
//         int n=outerList.size();
//         for(int i=0;i<n;i++){
//             List<Integer> innerList=new ArrayList<>(outerList.get(i));
//             innerList.add(num);
//             outerList.add(innerList);
//         }
//        }
//        return outerList;
        
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3};
//         System.out.println(subset(arr));
//     }
// }

import java.util.*;

class Main {

    static List<List<Integer>> subset(int arr[]) {

        List<List<Integer>> list = new ArrayList<>();

        // start with empty subset
        list.add(new ArrayList<>());

        for (int num : arr) {

            int n = list.size();

            for (int i = 0; i < n; i++) {

                List<Integer> innerlist =
                    new ArrayList<>(list.get(i));

                // create copy and add current number
                innerlist.add(num);

                list.add(innerlist);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println(subset(arr));
    }
}
