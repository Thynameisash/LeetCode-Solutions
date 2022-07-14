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
        ListNode res=new ListNode();
        if(lists==null || lists.length==0) return null;
        res=lists[0];
        if(lists.length == 1) {
            return res;
        }
        for (int i=0;i<=lists.length-2;i++)
        {
            res=mergetwo(res,lists[i+1]);
        }
        return res;
    }
    
    public ListNode mergetwo(ListNode l1, ListNode l2)
    {
        ListNode l3=new ListNode(-1);
        ListNode l3head=l3;
        while(l1!=null && l2!=null)
        {
            if(l1.val>=l2.val)
            {
                l3.next=l2;   
                l2=l2.next;  
            }
            else
            {
                l3.next=l1;
                l1=l1.next;
            }
            l3=l3.next; 
        }
        while(l1!=null)
        {
            l3.next=l1;
            l1=l1.next;
            l3=l3.next;
            
        }
        while(l2!=null)
        {
            l3.next=l2;
            l2=l2.next;
            l3=l3.next;
            
        }
        return l3head.next;
    }
}
