// class Solution {
//     void helper(List<List<Integer>> ans, List<Integer> p, int[] up, int target, int start) {

//         //base condition
//         if (target == 0) {
//             //process array haui usko list ka andar dal dunga
//             ans.add(new ArrayList<>(p));
//             return;
//         }

//         //process array ka andar hum elemnt dalenga from unprocess array
//         for (int i = start; i < up.length; i++) {

//               if (i > start && up[i] ==up[i - 1]) {
//                 continue;
//             }

//             if (up[i] > target) {
//                 break;
//             }
//             //add krega
//             p.add(up[i]);

//             //wapsa sa hum usi index sa strt krenga
//             helper(ans, p, up, target - up[i], i);

//             //backtrack last wala ko remove krka
//             p.remove(p.size() - 1);

//         }

//     }

//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> p = new ArrayList<>();
//         Arrays.sort(candidates);
//         helper(ans, p, candidates, target, 0);
//         return ans;
//     }
// }

class Solution {
    public void solve(int[] candidates, int target, int start,
                      List<Integer> curr, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
    
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target)
               continue;
            curr.add(candidates[i]);
            solve(candidates, target - candidates[i], i, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(candidates, target, 0, curr, ans);
        return ans;
    }
}