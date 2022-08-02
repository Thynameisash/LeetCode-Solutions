class Solution:
    def sellingWood(self, m: int, n: int, prices: List[List[int]]) -> int:
        price = [[0 for _ in range(n+1)] for _ in range(m+1)] 
        for r, c, p in prices: price[r][c] = p
        dp = [[0 for _ in range(n+1)] for _ in range(m+1)] 
        for r in range(1, m+1):
            for c in range(1, n+1):
                result = price[r][c] 
                for i in range(1, r//2+1): result = max(result, dp[r-i][c]+dp[i][c])
                for i in range(1, c//2+1): result = max(result, dp[r][c-i]+dp[r][i])
                dp[r][c] = result 
        return dp[m][n]