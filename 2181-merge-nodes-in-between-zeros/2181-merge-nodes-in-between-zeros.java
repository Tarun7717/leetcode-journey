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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        int sum=0;
        List<Integer> res = new ArrayList<>();

        while(temp!=null){
            if(temp.val==0){
                res.add(sum);
                sum=0;
            }
            sum+=temp.val;
            temp=temp.next;
        }
        
        ListNode newHead=new ListNode();
        ListNode dummy = newHead;

        for(int n : res){
            ListNode temp1=new ListNode(n);
            newHead.next=temp1;
            newHead=newHead.next;
        }

        return dummy.next;
    }
}