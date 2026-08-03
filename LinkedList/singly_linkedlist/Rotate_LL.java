/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode tail(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    int len(ListNode head) {
        ListNode temp = head;
        int l = 1;
        while (temp.next != null) {
            temp = temp.next;
            l++;
        }
        return l;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode start = head;
        ListNode end = tail(head);

        int length = len(head);
        k = k % length;
        if (k == 0) {
            return head;
        }

        //tail ko head k sath join kr diya
        end.next = start;

        ListNode temp2 = head;
        for(int i=1;i<length-k;i++){
            temp2=temp2.next;
        }
        ListNode newHead=temp2.next;
        temp2.next = null;
        
        return newHead;

    }
}
