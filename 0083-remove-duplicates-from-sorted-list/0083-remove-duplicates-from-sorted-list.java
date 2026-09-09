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
    public ListNode deleteDuplicates(ListNode head) {
      
        if(head==null) return null;
        if(head.next==null) return head;
          ListNode curr=head;
        ListNode prev=head;
        while(curr!=null){
            while(curr.next!=null && curr.val==curr.next.val)
               curr.next=curr.next.next;
        if(curr!=null) curr=curr.next;

        }
        return head;
    }
}