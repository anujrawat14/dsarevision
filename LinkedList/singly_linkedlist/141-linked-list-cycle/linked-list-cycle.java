
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
         //brute force using hashmap to store the pointer 
        // HashMap<ListNode, Boolean> hm = new HashMap<>();

        // ListNode temp = head;

        // while (temp != null) {
        //     if (hm.containsKey(temp)) {
        //         return true;
        //     } else {
        //         hm.put(temp, true);
        //     }
        //     temp = temp.next;
        // }
        // return false;

        //optimal using  tortoise slow fast pointer
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }        
    return false;
    }
}