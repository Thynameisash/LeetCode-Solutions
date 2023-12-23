class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        ListNode split = head;
        for (int i = 0; i < len - k - 1; i++) {
            split = split.next;
        }
        ListNode newHead = split.next;
        split.next = null;
        temp.next = head;

        return newHead;
    }
}
