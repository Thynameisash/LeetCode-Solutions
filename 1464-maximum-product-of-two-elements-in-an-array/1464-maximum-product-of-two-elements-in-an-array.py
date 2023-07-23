class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        l=0
        sl=0
        for i in range(len(nums)):
            if nums[i]>l:
                sl=l
                l=nums[i]
                
            elif nums[i]>sl:
                sl=nums[i]

        return (l-1)*(sl-1)