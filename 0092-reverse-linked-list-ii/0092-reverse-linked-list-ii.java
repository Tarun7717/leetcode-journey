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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp =dummy;
        
        for(int i=1;i<left;i++){
            temp=temp.next;
        }

                ListNode prev = null;
               
                ListNode cur = temp.next;
                ListNode leftNode = cur;
                int count=right-left+1;
                while(count>0){
                    ListNode nextNode = cur.next;
                    cur.next = prev;
                    prev = cur;
                    cur = nextNode;
                    count--;
                }
                temp.next = prev;
                leftNode.next = cur;
                
            
        
        return dummy.next;
    }
}