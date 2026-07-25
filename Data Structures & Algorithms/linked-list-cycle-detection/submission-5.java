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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if (head == null || head.next == null) {
            return false;
        }   
        else{
            while (head != null && head.next != null) {
                head = head.next.next;
                temp = temp.next;

                if (head == temp) {
                    return true;
                }
            }
            return false;
        }
    }
}
