// /**
//  * Definition for singly-linked list.*/
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode(int val) { this.val = val;this.next = null; }
//   }
 

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        if(head == null){
            return null;
        }
        else{
            while(head!=null){
                head = head.next;
                current.next = previous;
                previous = current;
                current = head;
            }
            return previous;
        }
    }
}
