/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    ListNode right(ListNode head){
        ListNode temp=head;
        while(temp.next!=null){
             temp=temp.next;
    }
    return temp;
    }
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
       List<List<Integer>> list = new ArrayList<>();
        // Your code goes here
        ListNode left=head; ListNode right=right(head);
      while(left != null && right != null &&
      left != right && right.next != left){
            int sum=left.val+right.val;
            if(sum==target)  {
            list.add(Arrays.asList(left.val, right.val));
             left=left.next;
                right=right.prev;
            }    
            else if(sum>target){
                right=right.prev;
            }
            else{
                left=left.next;
            }
        }
        return list;
    }
}
