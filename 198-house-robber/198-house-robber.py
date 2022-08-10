class Solution:
    def rob(self, nums: List[int]) -> int:
        nlen=len(nums)
        if nlen==0: return 0
        if nlen==1: return nums[0]
        else:
            dp=[0]*2
            prev1,prev2,temp=0,0,0
            for i in nums:
                temp=dp[0];
                dp[0]=max(dp[1]+i,dp[0])
                dp[1]=temp
            return dp[0]
        
