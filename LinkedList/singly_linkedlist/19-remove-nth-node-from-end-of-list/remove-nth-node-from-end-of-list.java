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
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode front = null;

        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    ListNode removeAtN(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while (count < k - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = reverse(head);
        ListNode res=removeAtN(ans,n);
        return reverse(res);
    }
}