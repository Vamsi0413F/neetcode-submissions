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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int count1 = 0;
        int count2 = 0;
        while(temp1!=null){
            count1++;
            temp1 = temp1.next;
        }
        temp1 = l1;
        while(temp2!=null){
            count2++;
            temp2 = temp2.next;
        }
        temp2 = l2;
        int diff = count1-count2;
        if(diff == 0){
            while(temp1!=null){
                temp1.val = temp1.val+temp2.val;
                temp1=temp1.next;
                temp2 = temp2.next;
            }
            temp1 = l1;
            while(temp1!=null){
                if(temp1.val>10){
                    if(count1 ==1){
                        ListNode abc = new ListNode(0);
                        l1.next = abc;
                    }
                    temp1.val = temp1.val-10;
                    temp1.next.val +=1;
                }
                temp1 = temp1.next;
            }
            temp1 = l1;
            return l1;
        }
        else if(diff >0){
            int b = 0;
            while(temp2!=null){
                temp2 = temp2.next;
            }
            for(int i = 0;i<diff;i++){
                ListNode a = new ListNode(b);
                temp2.next = a;
                temp2 = temp2.next; 
            }
            temp2 = l2;
            while(temp1!=null){
                temp1.val = temp1.val+temp2.val;
                temp1=temp1.next;
                temp2 = temp2.next;
            }
            temp1 = l1;
            while(temp1!=null){
                if(temp1.val>10){
                    temp1.val = temp1.val-10;
                    temp1.next.val +=1;
                }
                temp1 = temp1.next;
            }
            temp1 = l1;
            return l1;
        }
        else if(diff <0){
            while(temp1!=null){
                temp1 = temp1.next;
            }
            diff = 0-(diff);
            for(int i = 0;i<diff;i++){
                ListNode a = new ListNode(0);
                temp1.next = a;
                temp1 = temp1.next; 
            }
            temp1 = l1;
            while(temp1!=null){
                temp1.val = temp1.val+temp2.val;
                temp1=temp1.next;
                temp2 = temp2.next;
            }
            temp1 = l1;
            while(temp1!=null){
                if(temp1.val>10){
                    temp1.val = temp1.val-10;
                    temp1.next.val +=1;
                }
                temp1 = temp1.next;
            }
            temp1 = l1;
            return l1;
        }
        return l1;
        }
    }

