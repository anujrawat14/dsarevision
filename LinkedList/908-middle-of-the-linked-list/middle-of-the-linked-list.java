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
    public int length(ListNode head){
        if(head ==null){
            return 0;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int count=length(head);
        int mi=(count/2)+1;

        ListNode temp=head;
        int counter=1;
        while(counter<mi){
            temp=temp.next;
            counter++;
        }
        return temp;
    }
}