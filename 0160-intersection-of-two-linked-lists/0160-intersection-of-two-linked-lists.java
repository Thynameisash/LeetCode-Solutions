public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        int count1 = 0, count2 = 0;
        ListNode d1 = l1, d2 = l2;

        // Count nodes in l1
        while (l1 != null) {
            count1++;
            l1 = l1.next;
        }
        // Count nodes in l2
        while (l2 != null) {
            count2++;
            l2 = l2.next;
        }
        // Reset l1 and l2 to the beginning
        l1 = d1;
        l2 = d2;
        // Adjust the starting points based on the difference in counts
        int diff = Math.abs(count1 - count2);
        for (int i = 0; i < diff; i++) {
            if (count1 > count2) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        // Find the intersection node
        while (l1 != null && l2 != null) {
            if (l1 == l2) {
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
}
