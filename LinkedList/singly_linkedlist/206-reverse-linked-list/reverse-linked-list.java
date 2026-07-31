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
    
    //brute approach 
    //using an stack ds 
    //simply push value 
    //pop value and establish a backward link

    //optimal approach
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode front;
        
        while(curr!=null){
            //save the next node befor breaking link
            front=curr.next;
            //change the direction of link 
            curr.next=prev;
            //move prev pointer 
            prev=curr;
            //move curr pointer
            curr=front;
        }
        return prev;
    }
}
