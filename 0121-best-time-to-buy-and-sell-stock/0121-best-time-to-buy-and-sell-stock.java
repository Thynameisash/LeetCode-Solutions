class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int globalProfit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            currProfit = prices[i]-buy;
            globalProfit = Math.max(globalProfit,currProfit);
            buy=Math.min(buy,prices[i]);
        }
        return globalProfit;
    }
}