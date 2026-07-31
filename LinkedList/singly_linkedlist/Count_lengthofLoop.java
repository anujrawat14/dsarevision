/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

 class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;ListNode fast=head;
        while(fast!= null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                int len=1;
                slow=slow.next;
                while(fast!=slow){
                   slow=slow.next;
                    len++;
                }
                return len;
            }
        }
        return 0;
     }
 }
