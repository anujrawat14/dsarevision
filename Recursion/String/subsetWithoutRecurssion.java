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
