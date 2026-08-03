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

    ListNode movesec(ListNode head, int k) {
        ListNode second = head;
        while (second != null && k > 0) {
            second = second.next;
            k--;
        }
        return second;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;

        while (true) {

            // Find kth node
            ListNode second = movesec(first, k);

            if (second == null)
                break;

            ListNode end = second.next;

            // Reverse current group
            ListNode prev = end;
            ListNode curr = first.next;

            while (curr != end) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect reversed group
            ListNode temp = first.next; // old group start
            first.next = second;        // new group head
            first = temp;               // move to end of reversed group
        }

        return dummy.next;
    }
}