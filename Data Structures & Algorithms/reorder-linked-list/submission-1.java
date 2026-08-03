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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        count = count/2;
        for(int i = 0; i<count; i++){
            temp = temp.next;
        }
        ListNode temp1 = temp.next;
        temp.next = null;
        
        ListNode prev = null;
        ListNode current = temp1;
        ListNode next = null;

        while (current != null) {
            next = current.next;  
            current.next = prev; 
            prev = current;      
            current = next;      
        }
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        } 


    }
}
