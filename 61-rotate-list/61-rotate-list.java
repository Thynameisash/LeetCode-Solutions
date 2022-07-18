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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode t2 = head;
        int size = 1;
        if (head == null) {
            return head;
        }
        while (t2.next != null) {
            t2 = t2.next;
            size++;
        }
        if (size == 1) {
            return head;
        }
        int count=0;
        k=k%size;
        while(count<k){
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
            count+=1;
        }
    return head;
    }
}