
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
import java.util.ArrayList;


class Solution {
    public ListNode oddEvenList(ListNode head) {
        //brute will have an array to store value
        ArrayList<Integer> arr=new ArrayList<>();
        if(head==null){
            return null;
        }
        ListNode temp=head;
        //odd
        while(temp!=null){
            arr.add(temp.val);
            if(temp.next==null){
                break;
            }
            temp=temp.next.next;
        }
        //even
        ListNode temp2=head.next;
        while(temp2!=null){
            arr.add(temp2.val);
            if(temp2.next==null){
                break;
            }
            temp2=temp2.next.next;
        }

        //put value in ll
       ListNode temp3 =head;
        for(int i=0;i<arr.size();i++){
            temp3.val=arr.get(i);
            temp3=temp3.next;
        }
        
        return head;


    //     if (head.next.next != null) {
    //         ListNode odd = head;
    //         ListNode temp = head;
    //         ListNode even = temp.next;
    //         while (even != null && odd != null) {
    //             //1 odd wala yhi pr rhega
             
    //             odd.val = odd.val;
                
    //             odd = odd.next;
    //             even.val=odd.val;

    //             even = even.next;
    //         }

    //     }
    }
}