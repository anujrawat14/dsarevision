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
   
    public boolean isPalindrome(ListNode head) {
        //push in stack
        Stack<Integer> stack=new Stack<>();
         ListNode temp=head;
         while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
         }
        
        //pop with comaprison
        ListNode temp2=head;

        while(!stack.isEmpty()){
            int ans= stack.pop();
            if(temp2.val!=ans){
                return false;
            }
            temp2=temp2.next;
        }

        return true;
    }
}