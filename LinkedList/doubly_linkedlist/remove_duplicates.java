/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode removeDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode temp=head.next;;
        ListNode curr=head;
        while(temp!=null){
            if(temp.val==curr.val){
                temp=temp.next;
            }
            else{
                curr.next=temp;
                temp.prev=curr;
                curr=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}
