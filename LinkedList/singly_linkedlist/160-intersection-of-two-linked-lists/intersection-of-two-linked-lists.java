/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;

        while (first != null ) {
         ListNode second = headB;
            while (second != null) {
                if (first == second) {
                    return first;
                }
                second=second.next;
            }
            first=first.next;

        }

        return null;
    }
}