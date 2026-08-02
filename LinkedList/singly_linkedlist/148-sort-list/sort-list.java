
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
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right=right.next;
            }
            temp = temp.next;
        }
        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //brute force :-make a array, then sort them give the value
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while (temp != null) {
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // Collections.sort(arr);
        // temp=head;

        // for (int i = 0; i < arr.size(); i++) {
        //     temp.val = arr.get(i);
        //     temp = temp.next;
        // }
        // return head;

        //using merge sort directly

        //find midddle
        ListNode mid = middle(head);
        ListNode lefthead = head;
        ListNode righthead = mid.next;
        mid.next = null;

        lefthead = sortList(lefthead);
        righthead = sortList(righthead);
        return merge(lefthead, righthead);

        // split LL left and right half

    }
}