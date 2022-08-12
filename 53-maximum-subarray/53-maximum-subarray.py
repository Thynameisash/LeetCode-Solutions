class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum, overallsum = nums[0], nums[0]
        
        if len(nums)==1: return nums[0]
        
        for i in range (1,len(nums)):
            if currsum>=0: currsum+=nums[i]
            else: currsum=nums[i]
            if currsum>overallsum: overallsum=currsum
        
        return overallsum