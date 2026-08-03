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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            ListNode tempo = head.next;
            head = head.next;
            
        }
        else if(head.next.next == null){
            if(n == 1){
                head.next = null;
                
            }
            else if(n==2){
                head = head.next;
                
            }
        }
        else{
            ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int diff = count-n;
        temp = head;
        for(int i = 0; diff-1>i;i++){
            temp = temp.next;
        }
        ListNode temp1 = temp;
        ListNode temp2 = temp1.next;
        temp = temp.next.next;
        temp1.next = temp;
        temp2.next = null;
        
        }
        return head;
    }
}
