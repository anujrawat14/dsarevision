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
 import java.util.HashSet;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //brute force taking two loops
        // ListNode first = headA;

        // while (first != null ) {
        //  ListNode second = headB;
        //     while (second != null) {
        //         if (first == second) {
        //             return first;
        //         }
        //         second=second.next;
        //     }
        //     first=first.next;

        // }

        // return null;

        //using hash map
        HashSet< ListNode> set = new HashSet<>();
        ListNode first = headA;
        while (first != null) {
            set.add( first);
            first = first.next;

        }
        ListNode second = headB;
        while (second != null) {
            if (set.contains(second)) {
                return second;
            }
            second = second.next;
        }
        return null;
    }
}