import java.util.*;

class Main {

    static List<List<Integer>> subset(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        //take start and end to check the range of repated number
        int start=0;int end=0;

        for (int i=0;i<arr.length;i++) {
            start=0;
            if(i>0 &&arr[i]==arr[i-1]){
                start=end+1;
            }
                end=list.size()-1;
             int n = list.size();
           
            for (int j = start; j<n; j++) {

                List<Integer> innerlist =new ArrayList<>(list.get(j));
               innerlist.add(arr[i]);
                 list.add(innerlist);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 2};

        System.out.println(subset(arr));
    }
}
