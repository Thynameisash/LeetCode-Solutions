class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        l, sl = 0, 0
        
        for i in nums:
            if i > l:
                # update first largest and second largest
                l, sl = i, l
                
            elif i > sl:
                # update second largest
                sl = i
        
        return (l - 1) * (sl - 1)
