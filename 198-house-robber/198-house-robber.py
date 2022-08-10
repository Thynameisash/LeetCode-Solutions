class Solution:
    def rob(self, nums: List[int]) -> int:
        nlen=len(nums)
        if len(nums)==0: return 0
        if len(nums)==1: return nums[0]
        else:
            dp=[0]*2
            temp=0
            for i in nums:
                temp=dp[0];
                dp[0]=max(dp[1]+i,dp[0])
                dp[1]=temp
            return dp[0]
        
