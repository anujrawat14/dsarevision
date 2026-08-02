
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

    public int length(ListNode head) {
        ListNode temp = head;
        int len = 1;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

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
        // HashSet< ListNode> set = new HashSet<>();
        // ListNode first = headA;
        // while (first != null) {
        //     set.add( first);
        //     first = first.next;

        // }
        // ListNode second = headB;
        // while (second != null) {
        //     if (set.contains(second)) {
        //         return second;
        //     }
        //     second = second.next;
        // }
        // return null;

        //using two pointers
        int l1 = length(headA);
        int l2 = length(headB);
        int diff;
        ListNode fast, slow;

        if (l1 > l2) {
            fast = headA;
            slow = headB;
            diff = l1 - l2;
        } else {
            fast = headB;
            slow = headA;
            diff = l2 - l1;
        }
        for (int i = 0; i < diff; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            if (fast == slow) {
                return slow;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;

    }
}