class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        lmax,lmin=nums[0],nums[0]
        gmax,gmin=nums[0],nums[0]
        
        if max(nums)<=0: return max(nums)
        
        for i in range(1,len(nums)):
            lmax=max(nums[i],nums[i]+lmax)
            lmin=min(nums[i],nums[i]+lmin)
            
            gmax=max(gmax,lmax)
            gmin=min(gmin,lmin)
            
        return max(gmax,sum(nums)-gmin)