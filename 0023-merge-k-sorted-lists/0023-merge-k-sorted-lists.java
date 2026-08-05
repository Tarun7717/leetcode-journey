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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }

        Collections.sort(list);

        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        for(int n : list){
            head.next = new ListNode(n);
            head = head.next;
        }
        return dummy.next;
    }
}