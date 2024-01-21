class Solution {
    public int rob(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
                evenSum = Math.max(evenSum, oddSum); // Update evenSum to the maximum so far
            } else {
                oddSum += nums[i];
                oddSum = Math.max(oddSum, evenSum); // Update oddSum to the maximum so far
            }
        }

        return Math.max(oddSum, evenSum);
    }
}
