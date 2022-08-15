class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Step 1
        low_buy = 100000 # set a very high value
        high_sell = 0
		
		#Step 2        
        for i in range(len(prices)):
            
			# Step 2.1
            if prices[i] < low_buy:
                low_buy = prices[i]
                
			# Step 2.2
            if (prices[i] - low_buy) > high_sell:
                high_sell = prices[i] - low_buy
                
        return high_sell
  