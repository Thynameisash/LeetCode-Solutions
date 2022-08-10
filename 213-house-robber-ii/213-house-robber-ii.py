class Solution:
    def rob(self, nums: List[int]) -> int:
        nlen=len(nums)
        if nlen==0: return 0
        if nlen<=3: return max(nums)

        dp=[0]*2
        dp2=[0]*2

        for i in range(nlen-1):
            temp=dp[0];
            dp[0]=max(dp[1]+nums[i],dp[0])
            dp[1]=temp
        for i in range(1,nlen):
            temp=dp2[0];
            dp2[0]=max(dp2[1]+nums[i],dp2[0])
            dp2[1]=temp
        
        return max(dp[0],dp2[0])