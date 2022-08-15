class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy=inf
        sell=0
        
        for i in prices:
            if i<buy:
                buy=i
            if i-buy>sell:
                sell=i-buy
        
        return sell
    
  