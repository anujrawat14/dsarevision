/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashMap;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Boolean> hm=new HashMap<>();

        ListNode temp=head;

        while(temp!=null){
        if(hm.containsKey(temp)){
            return true;
        }
        else{
            hm.put(temp,true);
        }
            temp=temp.next;
        }
    return false;
    }
}