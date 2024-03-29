class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }
        if(size == 1 || size == n) return head.next;
        
        temp = head;
        for(int i=0; i<size-n-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}