class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        buy=prices[0]
        for sell in prices[1:]:
            profit=max(profit,sell-buy)
            if buy>sell:
                print(buy)
                buy=sell
        return profit