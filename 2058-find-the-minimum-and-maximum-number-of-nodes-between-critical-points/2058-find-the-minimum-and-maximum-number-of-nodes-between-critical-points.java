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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next==null) {
            return new int[]{-1, -1};
        }
        ListNode temp1 = head;
        ListNode curr = head.next;
        
        int count = 1;
        List<Integer> critVals = new ArrayList<>();

        while (curr.next != null) {
            int prevVal = temp1.val;
            int currVal = curr.val;
            int nextVal = curr.next.val;

            if ((currVal > prevVal && currVal > nextVal) || (currVal < prevVal && currVal < nextVal)) {
                critVals.add(count+1);
            }

            temp1 = curr;
            curr = curr.next;
            count++;
        }

        System.out.println("All crit values index: " + critVals);
        if(critVals.size()<2) return new int[] {-1,-1};
        else{
            int min= Integer.MAX_VALUE;
            for (int i = 1; i < critVals.size(); i++) {
                min = Math.min(min, critVals.get(i) - critVals.get(i - 1));
            }
            int max = critVals.get(critVals.size() - 1) - critVals.get(0);
            // Collections.sort(critVals);
            // int[] valArr = new int[critVals.size()];
            // for (int i = 0; i < valArr.length; i++) {
            //      valArr[i] = critVals.get(i);
            // }
            // int len = valArr.length;
            // for(int i=0;i<len-1;i++){
            //     if (valArr[i]<min){
            //         min=valArr[i];
            //     }
            // }
            // for(int i=0;i<len-1;i++){
            //     if (valArr[i]>min && valArr[i]<min2){
            //         min2=valArr[i];
            //     }
            // }
            // for(int i=0;i<len-1;i++){
            //     if (valArr[i]>max){
            //         max=valArr[i];
            //     }
            // }
            // for(int i=0;i<len-1;i++){
            //     if (valArr[i]<max && valArr[i]>max2){
            //         max2=valArr[i];
            //     }
            // }
            return new int[]{min,max};
            }
        }
}
