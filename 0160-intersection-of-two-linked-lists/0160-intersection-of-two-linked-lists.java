/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        ListNode d1=l1;
        ListNode d2=l2;
        int count1=0;
        int count2=0;
        ListNode len1=l1;
        ListNode len2=l2;
        while(len1!=null){
            count1++;
            len1=len1.next;
        }
        while(len2!=null){
            count2++;
            len2=len2.next;
        }
        if(count1>count2){
            int diff=count1-count2;
            for(int i=0;i<diff;i++){
                d1=d1.next;
            }
        }
        if(count2>count1){
            int diff=count2-count1;
            for(int i=0;i<diff;i++){
                d2=d2.next;
            }
        }
        while(d1!=null && d2!=null){
            if(d1==d2){
                return d1;
            } else {
                d1=d1.next;
                d2=d2.next;
            }
        }
        return null;
    }
}