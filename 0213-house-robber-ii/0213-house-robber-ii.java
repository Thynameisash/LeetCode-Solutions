class Solution {
    public int rob(int[] nums) {
        int oddSum = 0;
        int evenSum = 0;
        if(nums.length==1) return nums[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
                evenSum = Math.max(evenSum, oddSum); 
            } else {
                oddSum += nums[i];
                oddSum = Math.max(oddSum, evenSum);
            }
        }
        int leftsum= Math.max(oddSum, evenSum);
        
        oddSum=0;
        evenSum=0;
        System.out.println(leftsum);
        for (int i = nums.length-1; i > 0; i--) {
            if (i % 2 == 0) {
                evenSum += nums[i];
                evenSum = Math.max(evenSum, oddSum); 
            } else {
                oddSum += nums[i];
                oddSum = Math.max(oddSum, evenSum);
            }
        }

        int rightsum= Math.max(oddSum, evenSum);
        System.out.println(rightsum);

        return Math.max(leftsum,rightsum);
    }
}
