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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
		if(l2 == null) return l1;
        ListNode he=new ListNode(0);
        ListNode head=he;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                he.next=l1;
                l1=l1.next;
            } else{
                he.next=l2;
                l2=l2.next;
            }
            he=he.next;
        }
        he.next = l1==null ? l2 : l1;
        return head.next;
    }
}