/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode head= node;

        ListNode temp1=head;
        ListNode temp2 = temp1;
        while(temp1==node){
            temp2 = temp1;
            temp1=temp1.next;
        }

        temp2.val=temp1.val;

        temp2.next=temp1.next;   
    }
}