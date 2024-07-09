class Solution {
    public double averageWaitingTime(int[][] cust) {
        double total = 0;
        double curr = 0;
        int len = cust.length;

        for (int i = 0; i < len; i++) {
            if (curr < cust[i][0]) {
                curr = cust[i][0];
            }
            curr += cust[i][1];
            total += curr - cust[i][0];
        }

        return total / len;
    }
}