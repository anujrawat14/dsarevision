
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
import java.util.Stack;

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

    public boolean isPalindrome(ListNode head) {

        //brute using stack
        //push in stack
        // Stack<Integer> stack=new Stack<>();
        //  ListNode temp=head;
        //  while(temp!=null){
        //     stack.push(temp.val);
        //     temp=temp.next;
        //  }

        // //pop with comaprison
        // ListNode temp2=head;

        // while(!stack.isEmpty()){
        //     int ans= stack.pop();
        //     if(temp2.val!=ans){
        //         return false;
        //     }
        //     temp2=temp2.next;
        // }

        // return true;

        //optimal
        //1:- find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half
        ListNode NewHead = reverse(slow.next);

        //check;
        ListNode newTemp = NewHead;
        ListNode temp = head;

        while (newTemp != null ) {
            if (temp.val != newTemp.val) {
                return false;
            }
            temp = temp.next;
            newTemp = newTemp.next;
        }
        // reverse(NewHead);
        return true;
    }
}