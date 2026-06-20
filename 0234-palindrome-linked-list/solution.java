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
    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;
        Stack<ListNode> stk = new Stack<>(); 

        while(temp!=null){
            stk.push(temp);
            temp=temp.next;
        }

        ListNode cur =head;

        while(cur!=null){
            ListNode list=stk.pop();
            if(list.val!=cur.val){
                return false;
            }
            cur=cur.next;
        }

        return true;


    }
}
